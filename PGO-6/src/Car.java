public class Car extends Vehicle{
    double milesDriven;
    double fuelConsumed;
    double FuelEfficiency;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }


    @Override
    public double calculateFuelEfficiency() {
       FuelEfficiency+= milesDriven / fuelConsumed;
       return FuelEfficiency;
    }
}
