package com.company;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Toyota();
        cars[1] = new BMW();
        cars[2] = new Mercedes();
        for(int i=0;i<3;i++){
            cars[i].changeName();
            System.out.println("Characteristic of "+cars[i].name);
            System.out.print("Horse Powers: ");
            int hP = input.nextInt();
            System.out.print("Color: ");
            String c = input.next();
            System.out.print("Mileage: ");
            int miles = input.nextInt();
            cars[i].init(hP,c,miles);
        }
        for (Car car : cars) {
            System.out.println("Do i need repair?");
            car.doINeedRepair();
        }
    }
}
