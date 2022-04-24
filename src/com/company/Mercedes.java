package com.company;

public class Mercedes extends Car{
    void changeName() {
        this.name = "Mercedes";
    }
    void doINeedRepair(){
        if(this.mileage>100000 && this.mileage<200000){
            System.out.println("It will be better to repair me but if you can't its not problem");
        }
        else if(this.mileage>200000){
            System.out.println("Help me");
        }
        else{
            System.out.println("Nah im fine");
        }
    }
}
