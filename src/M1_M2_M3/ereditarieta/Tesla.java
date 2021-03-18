package M1_M2_M3.ereditarieta;

/*
*   la classe Tesla è una sottoclasse di Car
*       (Tesla estende Car oppure Tesla specializza Car)
 */

public class Tesla extends Car{

    //eredita tutti gli attributi e i metodi di Car

    boolean isSelfDriving;

    void turnSDOn(){
        this.isSelfDriving=true;
    }

    void turnSDOff(){
        this.isSelfDriving=false;
    }

    /*
    *   devo ridefinire il metodo turnOn in modo da avere la guida autonoma spenta al momento dell'accensione dell'auto, per poi fare il turnOn classico
    *   e ridefinire turnOff per spegnere la guida autonoma e fare turnOff classico di Car
    *
    *   ridefinisco le classi ereditate con l'OVERRIDE
     */

    @Override
    void turnOn(){
        turnSDOff();
        super.turnOn(); //con super si identifica la classe padre (mentre this identifica la classe stessa)
    }

    @Override
    void turnOff() {
        turnSDOff();
        super.turnOff();
    }


    //definisco il costruttore
    public Tesla(String licensePlate){
        super(licensePlate); //invoca il costruttore della superclasse, che fa this.licensePlate=licensePlate

        isSelfDriving=false;
    }

    public Tesla(){
        super();
        isSelfDriving=false;
    }

}
