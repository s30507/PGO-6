public class Truck extends Vehicle{
    double milesDriven;
    double fuelConsumed;
    double cargoWeight;
    double FuelEfficiency;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }


    @Override
    public double calculateFuelEfficiency() {
        FuelEfficiency+= milesDriven / (fuelConsumed + (cargoWeight * 0.5));
        return FuelEfficiency;
    }
}
