package M1_M2_M3.visibilitaCostruttoriGettersSetters;

public class Point {

    //ATTRIBUTI:
    private double x;
    private double y;


    //METODI:

    //costruttore
    public Point(double x, double y) { //
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    /*
     *   IL COSTRUTTORE NON HA TIPO !
     *
     *   se NESSUN costruttore viene definito, java ne usa uno di default senza parametri (tutti i campi vuoti o inizializzati a 0)
     *
     *   per l'overloading posso definire più costruttori con parametri diversi
     *
     *   la parola chiave this si utilizza nei setter e nei costruttori per riferirsi all'attributo interno della classe
     *       è un modo che usa la classe per riferirsi a se stessa
     */


    //getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    //setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
/*
    to_string
    @Override
    public String toString(){
        return "x = "+x+"; y = "+y;
    }
*/
}
