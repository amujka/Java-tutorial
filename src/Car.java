public class Car extends Vehicle {

    private final String type;
    private final int doorNumber;


    public Car(String manufacturer, String model, String registration, String type, int doorNumber) {
        super(manufacturer, model, registration);
        this.type = type;
        this.doorNumber = doorNumber;
    }
    
    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", type: " + this.type + ", seats: " + this.doorNumber;
    }
}
