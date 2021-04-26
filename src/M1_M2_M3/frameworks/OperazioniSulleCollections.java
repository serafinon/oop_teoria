package M1_M2_M3.frameworks;

//per importare le operazioni su liste, set e code
import java.util.Collections;

import java.util.ArrayList;


//per importare operazioni sugli Arrays (normali vettori, non Collection)
import java.util.Arrays;
import java.util.List;


/*
    java.util.Collections contiene

        sort() fa il merge sort
        binarySearch() -> richiede una collectio ordinata
        shuffle() unsort
        reverse()
        min() max()

 */






public class OperazioniSulleCollections {

    public static void main(String[] args) {
        ArrayList<String> cose = new ArrayList<String>(
                Arrays.asList("Nicola", "Cino", "Caino")
        );

        Collections.sort(cose);




        /*
         *   per ordinare degli oggetti generici si usa una combinazione delle classi Comparable e Comparator
         *
         *   comparator definisce un criterio di comparazione(faccio es. SortByAge)
         *      si usa per comparare oggetti anche di classi diverse
         *      l'unico metodo è
         *          public int compare(obj, obj)
         *
         *
         *   comparable si estende a una classe comparabile (faccio es. con Person)
         *       l'unico suo metodo è
         *           public int compareTo(obj)
         *           ritorna val <0 se this obj precede obj
         *                       ==0 se hanno la stessa posizione
         *                       >0 se this obj è dopo obj
         */

        List<Person> l=new ArrayList<Person>();
        l.add(new Person("Marco", "Rossi"));
        l.add(new Person("Luca", "Rapone"));
        l.add(new Person("Michelle", "Rossi"));

        System.out.println(l);
        Collections.sort(l); //con compareTo
        System.out.println(l);


        List<Person> lista=new ArrayList<Person>();
        lista.add(new Person("Marco", "Rossi",19));
        lista.add(new Person("Luca", "Rapone",50));
        lista.add(new Person("Michelle", "Rossi",5));

        System.out.println("\n\n"+lista);
        Collections.sort(lista, new SortbyAge()); //con compareTo
        System.out.println(lista);
    }
}
