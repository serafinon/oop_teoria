package M1_M2_M3_M4.abstract_interfacce.classiAstratte;

/*
*   in java è possibile dichiarare un metodo senza implementarlo, definendolo abstract
*   public abstract void funz();
*
*   una classe astratta è una classe che contiene uno o più metodi astratti
*
*   le classi astratte non possono essere istanziate
*
*   le classi astratte possono essere estese da figli che rimangono astratti o no
*       se la sottoclasse non è astratta, deve fornire un'implementazione dei metodi astratti del padre
*
*
*   è utile per rendere illegale l'uso di un metodo sul padre
*       mentre le classi figlie lo implementano in modo diverso
*   (
*       ad esempio, la classe astratta Figura ha metodo astratto getArea(),
*           mentre i figli (Quadrato, Cerchio, ecc.) implementano getArea() ognuna in modo diverso
*   )
*
*   le sottoclassi non astratte sono OBBLIGATE a implementare i metodi astratti del padre
*
 */

public class App {
    //Person è classe astratta, la classe Anziano iplementa i metodi astratti di Person
    Person p = new Anziano();
}
