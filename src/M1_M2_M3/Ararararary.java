package M1_M2_M3;

import java.awt.*;

public class Ararararary {
    public static void main(String[] args) {

        /*
         *   gli array in java possono contenere elementi di tipi primitivi o riferimenti a un oggetto (NON GLI OGGETTI!)
         *
         *   la dimensione viene definita a tempo di creazione e non può essere modificata
         */

        //DICHIARAZIONE:

        int v[];
        int[] v1; //è una sintassi valida
        //v e v1 sono riferimenti a vettori di int

        Point vp[];
        //vp è un riferimento a vettore di riferimenti a istanze della calsse Point


        //DEFINIZIONE:

        v = new int[16]; //tutti gli elementi del vettore vengono inizializzati a 0
        //v è riferimento a un oggetto di tipo vettore di 16 elementi int

        //  V NON è UN PUNTATORE AL PRIMO ELEMENTO DELL'ARRAY
        //  MA è UN RIFERIMENTO ALL'OGGETTO ARRAY
        //  QUINDI NON è POSSIBILE USARE L'ARITMETICA DEI PUNTATORI SUI VETTORI

        int v2[] = {0, 0, 0, 0, 0, 0, 0, 0}; //inizializzazione statica
        int[] v3 = new int[8]; //inizializzazione dinamica


        vp = new Point[10]; //tutti gli elementi (che sono riferimenti) vengono inizializzati a NULL
        //vp è un oggetto di tipo vettore di 10 riferimenti a istanze della classe Point

        vp[0] = new Point(0, 0); //instazio l'oggetto a cui il primo elemento di vp fa riferimento

        String vs1[] = {new String("primo"), new String("secondo")};//inizializzazione statica
        String vs2[] = new String[2]; //inizializzazione dinamica (tutti el a NULL)


        ///////////////////////////////////////////////////////////

        System.out.println(v.length);

        System.out.println(v[0]);

        v[3] = 5;
        System.out.println(v[3]);

        System.out.println("\n" + vp[0]);
        System.out.println(vp[1]);

        //////////////////////////////////////////////////////////

        System.out.println("\n\nv:\n");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        /*
         *   per scorrere un vettore a loop posso usare la seguente sintassi
         *   in cui al posto dell'indice ho a disposizione la variabile p che
         *       è un riferimento all'i-esimo elemento contenuto nel vettore (p=v[i] per ogni i<v.lenght)
         */

        System.out.println("\n\nv:\n");
        for (int p : v) {
            System.out.println(p);
        }

        System.out.println("\n\nvp:\n");
        for (Point p : vp) {
            System.out.println(p);
        }

        System.out.println("\n\nvs1:\n");
        for (String p : vs1) {
            System.out.println(p);
        }

        /////////////////////////////////////////////////

        String[][] s= new String[2][2];
        s[0][0]="0"; s[0][1]="1";
        s[1][0]="2"; s[1][1]="3";

        //swap delle righe 0 e 1
        String[] temp= s[0];
        s[0]=s[1];
        s[1]=temp;

        /*
        *   In Java è possibile perchè gli array (righe) di una matrice NON devono essere contigui in memo,
        *   mentre in C l'intera matrice occupa uno spazio contiguo in memoria
        *
        *   in java il riferimento s punta a un vettore di due puntatori a vettori di 2 elementi
        *       (gli elementi poi sono riferimenti a oggetti della classe String)
        *   l'elemento s[0] contiene il puntatore al vettore di due elementi (s[0][0] e s[0][1])
        *   essendo quindi s[0] e s[1] due puntatori, sono asseganbili
        *
         */
        for(int i=0;i<s.length;i++){
            for(String ps: s[i]){
                System.out.println(ps);
            }
        }


    }
}
