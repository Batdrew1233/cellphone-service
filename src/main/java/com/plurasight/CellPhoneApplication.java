package com.plurasight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone user = new CellPhone();
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
        user.setSerialNumber(serialNumber);
        user.setModel(model);
        user.setCarrier(carrier);
        user.setPhoneNumber(phoneNumber);
        user.setOwner(owner);

        //Use getters
        System.out.println("\nSerial Number: " + user.getSerialNumber());
        System.out.println("Model: " + user.getModel());
        System.out.println("Carrier: " + user.getCarrier());
        System.out.println("Phone Number: " + user.getPhoneNumber());
        System.out.println("Owner: " + user.getOwner());







    }

}
