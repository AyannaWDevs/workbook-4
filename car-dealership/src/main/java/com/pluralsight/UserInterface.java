package com.pluralsight;

import java.util.Scanner;

public class UserInterface{
public UserInterface() {
}
    public void display () {
        init();
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        System.out.println("""
                Please enter the number corresponding to your choice:
                1) List all Vehicles
                2) Search for vehicles by price 
                3) Search for Vehicles by make / model
                4) Search vehicles by color
                5) Search for vehicles by mileage
                6) Search vehicles by type (car, truck, SUV, van)
                7) Search vehicles by year 
                8) Add a vehicle
                9) Remove a vehicle
                10) Sell/Lease a Vehicle
                X) Quit
                """);
        do {
            userChoice = scanner.nextLine();
            switch (userChoice.toLowerCase()) {
                case "1":
                    processGetAllVehiclesRequest();
                    break;
                case "2":
                    processGetByPriceRequest();
                    break;
                case "3":
                    processGetByMakeModelRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetByYearRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "10":
                    displaySellLeaseMenu();
                    break;
                case "x":
                    System.out.println("Exiting to main menu");
                    break;
                default:
                    System.out.println("Invalid input try again.");
            }
            // stops loop once "x" is input
        } while (!userChoice.equalsIgnoreCase("x"));
        scanner.close();
    }
    private void init() {
    }
   public void displaySellLeaseMenu() {
    }
    public void processGetByPriceRequest () {

    }
    public void processGetByMakeModelRequest () {

    }
    public void processGetByYearRequest () {

    }
    public void processGetByColorRequest () {

    }
    public void processGetByMileageRequest () {

    }
    public void processGetByVehicleTypeRequest () {

    }
    public void processGetAllVehiclesRequest () {

    }
    public void processAddVehicleRequest () {

    }
    public void processRemoveVehicleRequest () {

    }
}
