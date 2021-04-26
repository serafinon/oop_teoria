package M1_M2_M3_M4.ereditarieta;

/*
 *   di solito una classe è solo una modifica di n'altra classe
 *       l'ereditarietà consente di evitare di copiare codice inutile
 *
 *   una classe può essere una sottoclasse di una classe padre, da cui eridita tutti gli attr e i metodi dal padre
 *       la sottoclasse può inoltre creare nuovi metodi e attr,
 *       oppure sovrascrivere i metodi esistenti ereditati (OVERRIDE)
 *
 *   il costruttore della superclasse viene chaiamato con super()
 *       il costruttore delle sottoclassi può chiamare il costruttore del padre
 */

/*
 *   tutte le classi sono "sottoclassi" della classe Object e ereditano tutti i suoi metodi
 *       alcuni metodi di Object sono toString(Object o), equals(Object o)
 *
 *   infatti quando si scrive un metodo toString particolare i una classe, si sta facendo un Override
 *   equals() della classe Object confronta i riferimenti, non il contenuto degli oggetti
 *          se volessi fare un confronto sul contenuto dovrei riscrivere il metodo con un Override
 */

public class App {
    public static void main(String[] args) {
        Car[] garage = new Car[2];

        /*
         *   posso fare un casting da una classe a una sua sottoclasse (downcasting)
         *       come da Object a qualsiasi altra classe
         *       o come da Car a Tesla
         *    o viceversa (upcasting)
         *
         *    l'upcast è sempre consentito
         *    il downcasting non sempre
         */

        garage[0] = new Car();
        garage[1] = new Tesla(); //ho un oggetto Tesla in un vettore di Car
        //uso un riferimento di tipo Car per un oggetto di tipo Tesla



        for (Car c : garage) {
            c.turnOn();
        }

        System.out.println(garage[0].isOn);
        System.out.println(garage[1].isOn);

        /*
        *   garage[1] è un riferimento tipo Car a un oggetto Tesla
        *   per poter usare un attributo esclusivo della classe Tesla,
        *       devo fare un down-casting del riferimento garage[1] a tipo riferimento a Tesla
        *
        *   per essere sicuri che si possa effettuare un downcasting si usa l'operatore instanceof
        *       che controlla se un riferimento si riferisce a un oggetto di una determinata classe
         */

        if(garage[1] instanceof Tesla) {

            Tesla u = (Tesla) garage[1]; //essendo garage[1] un riferimento di tipo Car a un oggetto Tesla, devo fare un down-casting a Tesla

            System.out.println(((Tesla) garage[1]).isSelfDriving);
            System.out.println((u.isSelfDriving));

            System.out.println("\n" + (u.equals(garage[1])));//vero

        }
    }
}
