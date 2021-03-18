package M1_M2_M3.ereditarieta;

public class Car {
    boolean isOn;
    String licensePlate;


    public Car(String licensePlate){
        this.licensePlate=licensePlate;
    }
    public Car(){
        licensePlate="default";
    }

    void turnOn(){
        this.isOn=true;
    }

    void turnOff(){
        this.isOn=false;
    }
}
