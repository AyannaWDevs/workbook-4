package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
public class DealershipFileManager {
    public static void main(String[] args) {
        new DealershipFileManager().getDealership();
    }
    private static final String filePath="src/main/resources/inventory.csv";

    public Dealership getDealership(){
       // Dealership myDealership = new Dealership("name","address","phone");
       try {
           FileReader fr = new FileReader(filePath);
           BufferedReader br = new BufferedReader(fr);
           String dealershipInfo = br.readLine();
           String[] tokens=dealershipInfo.split("[|]");
           System.out.println(tokens[0]);
           return new Dealership(tokens[0],tokens[1],tokens[2]);
           //for loop to split  while br.readline() !null
       }
       catch(Exception e){

       }
       return null;
    }
    public void saveDealership(String dealership){

    }

}
