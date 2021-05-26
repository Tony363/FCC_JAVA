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
        // if(o instanceof PCGame){
        if (o!=null && o.getClass() == PCGame.class){
            PCGame game = (PCGame)o;
            return game != null && this.isEqualPCGame(this,game);
                // && super.equals(game)
                // && this.getRequiredRAMSize() == game.getRequiredRAMSize()
                // && this.getRequiredCPUSpeed() == game.getRequiredCPUSpeed()
                // && this.getRequiredDiskSize() == game.getRequiredDiskSize();
                // && this.isEqual(this.getName(),game.getName());
        }
        return false;
    }
    @Override
    public String toString(){return String.format("PCGame: %s",super.getDescription());}

    @Override
    public int hashCode() {
        Double ram = this.getRequiredRAMSize(),disk = this.getRequiredDiskSize(),cpu = this.getRequiredCPUSpeed();
        int h = ram.hashCode();
        h = 31 *h+Double.valueOf(disk).hashCode();
        h = 31*h+cpu.hashCode();
        return h;
    }

    protected boolean isEqual(String s1,String s2){
        return (s1==null && s2==null) || (s1!=null && s1.equals(s2));
    }

    protected boolean isEqualPCGame(PCGame g1, PCGame g2){
		return (g1.getRequiredRAMSize() == g2.getRequiredRAMSize())
            && (g1.getRequiredDiskSize() == g2.getRequiredDiskSize())
            && (g1.getRequiredCPUSpeed() == g2.getRequiredCPUSpeed())
            && isEqual(g1.getDescription(),g2.getDescription());
	}
    
}


