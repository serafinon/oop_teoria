package M1_M2_M3;

public class Strings {

    /*
    *   le stringhe NON sono vettori di caratteri,
    *   ma sono istanze della classe String
    *
     */

    public static void main(String[] args){
        String s1 = new String("ciao sono una stringa");
        String s2 = new String("ciao sono una stringa");

        String s3 = "pippo anche così posso essere definita";
        String s4 = "pippo anche così posso essere definita";


        System.out.println(s1==s2);
        //è FALSE perchè s1 e s2 sono riferimenti diversi, nonostante gli oggetti a cui si riferiscono hanno lo stesso valore
        //quindi ->
        String copia=s1;
        System.out.println(s1==copia); //sarà true

        System.out.println(s1.equals(s2));
        //è TRUE perchè equals confronta i contenuti degli oggetti

        System.out.println(s3==s4);
        //è TRUE perchè java per risparimiare memoria puo allocare le stringhe in memoria statatica
        // (come nel caso della dichiarazione di s3 e s4)
        // e tutte le stringhe con lo stesso contenuto non vengono ripetute,
        // ma si utilizza la stessa stringa allocata precedentemente




        s3="ora la cambio";
        //System.out.println("\n"+ s3);
        System.out.println('\n'+ s3);
        System.out.println(s4);

        System.out.println("\n\nlungh di s1: " + s1.length());

        System.out.println("\n\nindex di 'sono' in s1: " + s1.indexOf("sono"));


        System.out.println("\n\n\n\n");

        /*
        *   concatenare le stringhe con l'operatore + è estremamente lento
        *   perchè così si crea una nuova stringa che è la copia delle stringhe concatenate
        */
        String s="";
        for(int i=0;i<10;i++){
            s+="a";
            System.out.println(s);
        }

        /*
        *   conviene invece utilizzare la classe StringBuffer
        *   in modo da aggiungere caratteri in coda a un buffer
        *   per poi, alla fine, convertire il contenuto dell' oggetto sb in una stringa
        */
       StringBuffer sb= new StringBuffer();

       for(int i=0;i<10;i++){
           sb.append("a");
       }
       System.out.println("\n"+ sb.toString());
    }
}
