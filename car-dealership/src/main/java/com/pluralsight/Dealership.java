package com.pluralsight;

import java.sql.Array;
import java.util.ArrayList;

public class Dealership {
    String name;
    String address;
    String phone;
    ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        inventory = new ArrayList<Vehicle>();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min,double max){
        ArrayList<Vehicle> filteredByPrice;
        filteredByPrice = new ArrayList<Vehicle>();
        for (Vehicle vehicle: inventory){

        }
        return filteredByPrice; } //returns arrayList

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> filteredByMakeModel;
        filteredByMakeModel = new ArrayList<Vehicle>();
                return filteredByMakeModel;
    }
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        ArrayList<Vehicle> filteredbyYear;
        filteredbyYear = new ArrayList<Vehicle>();
        return filteredbyYear;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> filteredByColor;
        filteredByColor = new ArrayList<Vehicle>();
        return filteredByColor;
    }
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        ArrayList<Vehicle> filteredByMileage;
        filteredByMileage = new ArrayList<Vehicle>();
        return filteredByMileage;
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        ArrayList<Vehicle> filteredByType;
        filteredByType = new ArrayList<Vehicle>();
        return filteredByType;
    }
    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
      inventory.add(vehicle);

    }

    public void removeVehicle(Vehicle vehicle){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

