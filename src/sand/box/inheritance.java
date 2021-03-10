package src.sand.box;

import java.util.Scanner;

class Door {
    public void open ()
    {
        push();
    }
    public void pull (){
        System.out.println("pulled at door");
    }
    public void push(){
        System.out.println("pushed at door");

    }
}

class BankVaultDoor extends Door {
    private String Combination;
    public void open () {
        enterCombination();
        super.pull();
    }
    public void enterCombination(){
        Scanner CombinationScanner = new Scanner(System.in);
        System.out.println("Enter Combination:");
        this.Combination = CombinationScanner.next();
    }
}

class HouseFrontDoor extends Door {
    // Your code goes here
    public void open(){
        this.UseKeys();
        super.open();
    }
    public void UseKeys(){
        System.out.println("kchink");
    }
}

public class inheritance {
    public static void main(String[] args){
        Door door = new Door();
        BankVaultDoor bankDoor = new BankVaultDoor();
        HouseFrontDoor frontDoor = new HouseFrontDoor();
        
        System.out.println("testing doors:");
        door.open();
        System.out.println();
        System.out.println("robbing the bank:");
        bankDoor.open();
        System.out.println();
        System.out.println("stowing the money away:");
        frontDoor.open();

    }
}