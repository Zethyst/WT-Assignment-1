import java.util.Scanner;

class Vehicle {
    long regnNumber;
    int speed;
    String color, ownerName;

    void showData() {
        System.out.println("\n\nThis is a Vehicle Class!!");
    }
}

class Bus extends Vehicle {
    long routeNumber;

    void showData() {
        super.showData();
        System.out.println("\nReg no: " + regnNumber);
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
        System.out.println("Speed: " + speed + " KM/H");
        System.out.println("Route: " + routeNumber);
    }
}

class Car extends Vehicle {
    String ManufacturerName;

    void showData() {
        super.showData();
        System.out.println("\nReg no: " + regnNumber);
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
        System.out.println("Speed: " + speed + " KM/H");
        System.out.println("Manufacturer: " + ManufacturerName);
    }
}

class Vehicle_Type {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Bus b = new Bus();
        Car c = new Car();

        // Bus Details
        System.out.print("\nEnter Bus Registration Number: ");
        b.regnNumber = sc.nextLong();
        System.out.print("Enter Bus Color: ");
        b.color = sc.next();
        sc.skip("\\R?");
        System.out.print("Enter Bus Owner Name: ");
        b.ownerName = sc.nextLine();
        System.out.print("Enter Bus Speed in Km/h: ");
        b.speed = sc.nextInt();
        System.out.print("Enter Bus Route No: ");
        b.routeNumber = sc.nextLong();
        b.showData();

        // Car Details
        System.out.print("\nEnter Car Registration Number: ");
        c.regnNumber = sc.nextLong();
        System.out.print("Enter Car Color: ");
        c.color = sc.next();
        sc.skip("\\R?");
        System.out.print("Enter Car Owner Name: ");
        c.ownerName = sc.nextLine();
        System.out.print("Enter Car Speed in Km/h: ");
        c.speed = sc.nextInt();
        sc.skip("\\R?");
        System.out.print("Enter Car Manufacturer: ");
        c.ManufacturerName = sc.nextLine();
        c.showData();

    }

}
