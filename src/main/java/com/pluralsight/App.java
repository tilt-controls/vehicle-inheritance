package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Moped moped1 = new Moped("Blue", 2, 1, 5, true);
        Car car1 = new Car("Red", 4, 5, 10, true);
        SemiTruck semiTruck1 = new SemiTruck("Green", 2, 50, 20, true);
        Hovercraft hovercraft1 = new Hovercraft("Black", 6, 8, 10);

        System.out.println("Moped color: " + moped1.getColor());
        System.out.println("Car color: " + car1.getColor());
        System.out.println("Semi truck color: " + semiTruck1.getColor());
        System.out.println("Hovercraft color: " + hovercraft1.getColor());
        System.out.println();

        System.out.println("Moped number of passengers: " + moped1.getNumberOfPassengers());
        System.out.println("Car number of passengers: " + car1.getNumberOfPassengers());
        System.out.println("Semi truck number of passengers: " + semiTruck1.getNumberOfPassengers());
        System.out.println("Hovercraft number of passengers: " + hovercraft1.getNumberOfPassengers());
    }
}
