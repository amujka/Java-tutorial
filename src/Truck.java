public class Truck extends Vehicle {
    private final boolean hasTrailer;
    private final double cargoCapacity;

    public Truck(String manufacturer, String model, String registration, boolean hasTrailer, double cargoCapacity) {
        super(manufacturer, model, registration);
        this.hasTrailer = hasTrailer;
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", trailer: " + this.hasTrailer + ", cargo capacity: " + this.cargoCapacity;
    }

}
