import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car dodgeC = new Car("Dodge", "Challanger", 2023, 5783, 30);
        Truck scania = new Truck("Scania", "T650", 2014, 650123, 52, 3500);

        vehicles.add(dodgeC);
        vehicles.add(scania);

        for(int i = 0; i < vehicles.size(); i++) {
            double fuelEfficiency = vehicles.get(i).calculateFuelEfficiency();
            System.out.println("Fuel efficiency for: " + vehicles.get(i).make + " " + vehicles.get(i).model + " is: " + fuelEfficiency);
        }
    }
}