package M1_M2_M3;

import java.awt.*;
/*  il passaggio dei parametri avviene per valore, in copia
*
*
 */
public class Parameters {
    final double PI = 3.14;
    public static void main(String[] args){
        Point p1=new Point(0,0);
        Point p2=new Point(10,10);
        //p1 e p2 sono riferimenti di tipo Point, per manipolare oggetti di tipo Point
        //in realtà sono separati dall'oggetto che manipolano

        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        swap(p1,p2);
        //la funzione riceve delle copie dei riferimenti ai due oggetti
        //si scambiano le copie dei riferimenti ma non cambiano i riferimenti originali
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();


        //posso usare la copia dei riferimenti per modificare lo stato interno degli oggetti che manipolano
        move(p1,p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        /*
        *   I PARAMETRI SI PASSANO PER VALORE
        *   NON è POSSIBILE PASSARE I PARAMETRI PER RIFERIMENTO

        *   SI PASSANO COME PARAMETRI LE COPIE DEI RIFERIMENTI AGLI OGGETTI
        *   è POSSIBILE MODIFICARE GLI OGGETTI ATTRAVERSO LE COPIE DEI RIFERIMENTI
        *   NON è POSSIBILE MODIFICARE I RIFERIMENTI ORIGINALI
        *
         */

    }

    public static void swap(Point p1, Point p2){
        Point tmp=p1;
        p1=p2;
        p2=tmp;
    }

    public static void move(Point p1, Point p2){
        p1.move(10,10);
        p2.move(0,0);
    }
}


/*  byte è intero da 8 bit con segno
 *  char è intero da 16bit senza segno
 *  short è intero da 16bit con segno
 *  int è intero da 32bit con segno
 *  long è intero da 64 bit con segno
 *
 *  float a 32 pit
 *  double a 64bit
 *
 *  boolean -> gli operatori logici funzionano solo con valori booleani come operatori
 */

//costanti dichiarata con final