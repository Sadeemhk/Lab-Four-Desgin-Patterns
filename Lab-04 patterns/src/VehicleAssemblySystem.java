/*
   Lab 4: Assignment Two Vehicle Assembly System
   Sadeem Aljahdali
   2116258
 */

// Vehicle interface
  interface Vehicle {
    void assemble();
  }

// Vehicle Classes
  // Car class
 class Car implements Vehicle {
    @Override
    public void assemble() {
        System.out.println(" - Assembling a Car: 2 doors, sport engine");
    }
 }

 // Truck class
 class Truck implements Vehicle {
    @Override
    public void assemble() {
        System.out.println(" - Assembling a Truck: Small pickup with fuel-efficient engine");
    }
 }

  // Motorcycle class
 class Motorcycle implements Vehicle {
    @Override
    public void assemble() {
        System.out.println(" - Assembling a Motorcycle: Electric bike with fast charging");
    }
 }
 // Vehicle Factory Interface
 interface VehicleFactory {
    Vehicle createVehicle();
 }

 // Car Factory
 class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
 }

 // Truck Factory
 class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
 }

 // Motorcycle Factory
 class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
 }
 
 public class VehicleAssemblySystem {
    public static void main(String[] args) {
        // Create vehicle factories
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        // Produce vehicles
        Vehicle car = carFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();

        // Assemble vehicles
        System.out.println("Vehicle Assembly Line:");
        car.assemble();
        truck.assemble();
        motorcycle.assemble();
    }
 }
