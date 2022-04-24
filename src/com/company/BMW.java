package com.company;

public class BMW extends Car{
    void changeName() {
        this.name = "BMW";
    }
    void doINeedRepair(){
        if(this.mileage>20000){
            System.out.println("Please HELP MEEE!");
        }
        else{
            System.out.println("Nah im fine");
        }
    }
}
