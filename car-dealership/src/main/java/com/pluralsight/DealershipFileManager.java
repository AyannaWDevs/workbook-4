package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
public class DealershipFileManager {
    public static void main(String[] args) {
        new DealershipFileManager().getDealership();
        UserInterface ui = new UserInterface();
        ui.display();
    }
    private static final String filePath="src/main/resources/inventory.csv";
    String delimiter = "[|]";

    public Dealership getDealership(){
       Dealership myDealership = null;
       try {
           FileReader fr = new FileReader(filePath);
           BufferedReader br = new BufferedReader(fr);
           String dealershipInfo = br.readLine();
           String[] tokens=dealershipInfo.split("[|]");
           System.out.println(tokens[0] +"|"+ tokens[1] +"|"+tokens[2]);

           String vehicleInfo;
           myDealership = new Dealership(tokens[0],tokens[1],tokens[2]);
           while((vehicleInfo= br.readLine())!=null){
               String[] vehicleTokens = vehicleInfo.split("[|]");
               Vehicle vehicle = new Vehicle(Integer.parseInt(vehicleTokens[0]),Integer.parseInt(vehicleTokens[1]),vehicleTokens[2],vehicleTokens[3], vehicleTokens[4],vehicleTokens[5],Integer.parseInt(vehicleTokens[6]),Double.parseDouble(vehicleTokens[7]));
               //public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
               myDealership.addVehicle(vehicle);
               System.out.println(vehicle);
           }
       }
       catch(Exception e){

       }
       return null;
    }
    public void saveDealership(String dealership){

    }

}
