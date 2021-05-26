/*
The Game class is defined as follows.
DO NOT redefine it in your answer!!

public class Game {
    private String description;

    public Game() {
    }
    public Game(String description) {
    }

    public String getDescription() {
    }
    public void setDescription(String description) {
    }

    public String toString() {
    }
    public boolean equals(Object o) {
    }
}
*/
package IIT.OOP;
public class PCGame extends Game{
    private double requiredRAMSize,requiredDiskSize,requiredCPUSpeed;

    public PCGame(){
        super("PCGame : Test PCGame");
        this.requiredRAMSize = 0;
        this.requiredDiskSize = 0;
        this.requiredCPUSpeed = 0;
    }
    public PCGame(
        double ramSize, 
        double DiskSize,
        double CPUSpeed,
        String name
        ){
        super(name);
        this.setRequiredRAMSize(ramSize);
        this.setRequiredDiskSize(DiskSize);
        this.setRequiredCPUSpeed(CPUSpeed);
    }
    public double getRequiredRAMSize(){return this.requiredRAMSize;}
    public double getRequiredDiskSize(){return this.requiredDiskSize;}
    public double getRequiredCPUSpeed(){return this.requiredCPUSpeed;}

    public void setRequiredRAMSize(double ramSize){this.requiredRAMSize = ramSize;}
    public void setRequiredDiskSize(double DiskSize){this.requiredDiskSize = DiskSize;}
    public void setRequiredCPUSpeed(double CPUSpeed){this.requiredCPUSpeed = CPUSpeed;}


    @Override
    public boolean equals(Object o){
        if(o instanceof PCGame){
            PCGame game = (PCGame)o;
            return game != null
                && super.equals(game)
                && this.getRequiredRAMSize() == game.getRequiredRAMSize()
                && this.getRequiredCPUSpeed() == game.getRequiredCPUSpeed()
                && this.getRequiredDiskSize() == game.getRequiredDiskSize();
                // && this.isEqual(this.getName(),game.getName());
        }
        return false;
    }
    @Override
    public String toString(){return String.format("PCGame: %s",super.getDescription());}

    protected boolean isEqual(String s1,String s2){
        return (s1==null && s2==null) || (s1!=null && s1.equals(s2));
    }
}


