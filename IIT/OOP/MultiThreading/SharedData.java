package IIT.OOP.MultiThreading;
import java.io.Writer;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.IndexOutOfBoundsException;
import java.lang.InterruptedException;
// python has global interpreter lock issue
// print time stamps
class Box{
    private List<String> queue = new ArrayList<String>();
    public Box(){};
    synchronized public void addQueue(String logs){
        if (logs != null && logs.length() > 0){
            this.queue.add(logs);
            notify();
        }else{
            throw new IllegalArgumentException("empty logs");
        }
    }
    synchronized public String pop(){
        if (this.queue.size() == 0){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        return this.queue.remove(0);
    }
}
// make sure producer thread will not override each other
class Producer extends PeriodicMessageThread{ // heart beat task 1
    protected Box queue = null;
    private int running = 0;
    void setLogs(int logs){this.running = logs;}
    int getLogs(){return this.running;}
    void setQueue(Box queue){
        if (queue != null){
            this.queue = queue;
        }else{
            throw new IllegalArgumentException("Null Queue");
        }
    }
    public Box getQueue(){return this.queue;}

    // how to repeated produce heartbeat message
    public Producer(){}
    public Producer(int interval, String heartbeat,Box queue,int logs){
        super(interval,heartbeat);
        this.setQueue(queue);
        this.setLogs(logs);
    }
    // use thread to run over object
    @Override
    public void run(){
        while(this.running!=0){
            try{
                // create box, put string in to box and get string of box
                System.out.printf("Storing message %s to queue\n", super.getMessage());
                this.queue.addQueue(super.getMessage()+this.running);
                Thread.sleep(super.getInterval());
            }catch(Exception e){
                System.err.println("sleep() is interrupted");
            }
            this.running -= 1;
        }
        return;
    }
}


// only one of them gets specific message
class Consumer extends Thread{ // logging message task 2
    private Writer w = null;
    protected Box queue = null;
    private boolean logging = false;
    void setLogging(){this.logging=!this.logging;}
    boolean getLogging(){return this.logging;}
    void setWriter(Writer w){
        if (w != null){
            this.w = w;
        }else{
            throw new IllegalArgumentException("Null writer");
        }
    }
    Writer getWriter(){return this.w;}
    void setQueue(Box queue){
        if (queue != null){
            this.queue = queue;
        }else{
            throw new IllegalArgumentException("Null Queue");
        }
    }
    public Box getQueue(){return this.queue;}

    // wait for message, once get message save to file
    public Consumer(){}
    public Consumer(Box queue,Writer w){
        this.setQueue(queue);
        this.setWriter(w);
        this.setLogging();
    }
    public void run(){
        while(this.getLogging()){
            try{
                System.out.println("logging from queue");
                String temp = this.queue.pop(); 
                this.w.write(temp+"\n");
                this.w.flush();
            }catch (IOException io){
                io.printStackTrace();
                this.setLogging();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                this.setLogging();
            }
        }
    }
}


// use queue / vector container object
public class SharedData{
    // creates 4 threads, 2 consumer ,2 producer
    public static void main(String[] args){
        // set up box here
        Box queue = new Box();
        try{// time dependant to verify duplicate messages
            Writer w1 = new FileWriter("./txt/logging1.txt");
            Writer w2 = new FileWriter("./txt/logging2.txt");
            Producer t1 = new Producer(1,"Heartbeat1",queue,1000);
            Producer t2 = new Producer(1,"Heartbeat2!",queue,1000);
            Consumer c1 = new Consumer(queue,w1);
            Consumer c2 = new Consumer(queue,w2);
            t1.start();
            t2.start();
            c1.start();
            c2.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}