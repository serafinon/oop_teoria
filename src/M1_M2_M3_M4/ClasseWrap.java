package M1_M2_M3_M4;
/*
 *   le classi wrapper sono la versione a classe dei tipi primitivi
 *
 *   Boolean
 *   Integer
 *   Character
 *   Byte
 *   Long
 *   Float
 *   Double
 *   Void
 *
 *
 *   le classi wrapper hanno metodi static
 *
 *   servono per convertire i tipi di dati tra tipo primitivo, versione a oggetto e stringhe
 *
 *
 *  la conversione dal tipo primitivo al tipo corrispondente a oggetto (auto boxing) e viceversa (auto unboxing)
 *      sono automatici
 *
 */

public class ClasseWrap {
    public static void main(String[] args) {

        int xP = 10;

        String xS = Integer.toString(xP); //conv da tipo primitivo a oggetto String

        Integer xObj = Integer.valueOf(xS); //conv da String a Integer

        xS = xObj.toString(); //da Integer a String

        xP=Integer.parseInt(xS); //da String a int primitivo

        System.out.println(xP);
        System.out.println(xS);
        System.out.println(xObj);


        xS = Integer.toString(xObj); //funziona per l'auto boxing (toString ammette tipo primitivo int)
    }
}
