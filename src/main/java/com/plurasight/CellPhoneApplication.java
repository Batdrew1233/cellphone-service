package com.plurasight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellphone1 = new CellPhone();
        //Ask Questions
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        //Use setters
        cellphone1.setSerialNumber(serialNumber);
        cellphone1.setModel(model);
        cellphone1.setCarrier(carrier);
        cellphone1.setPhoneNumber(phoneNumber);
        cellphone1.setOwner(owner);

        //Use getters
        System.out.println("\nSerial Number: " + cellphone1.getSerialNumber());
        System.out.println("Model: " + cellphone1.getModel());
        System.out.println("Carrier: " + cellphone1.getCarrier());
        System.out.println("Phone Number: " + cellphone1.getPhoneNumber());
        System.out.println("Owner: " + cellphone1.getOwner());

        scanner.close();







    }

}
