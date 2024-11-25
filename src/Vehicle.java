public abstract class Vehicle {

    private final String manufacturer;
    private final String model;
    private final String registration;

    public Vehicle(String manufacturer, String model, String registration) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.registration = registration;
    }

    public String getRegistration() {
        return this.registration;
    }

    public String getVehicleInfo() {
        return this.manufacturer + " " + this.model + ": " + this.registration;
    }
}
