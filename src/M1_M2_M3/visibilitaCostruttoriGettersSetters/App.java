

/*
 *   l'interfaccia di un package è l'insieme di tutte le classi pubbliche contenute nel PACKAGE
 *       (le librerie si implementano così)
 *
 *   se una classe appartiene a un package, va segnalato con la parola chiave package
 *
 *   se voglio importare una classe da un altro package devo usare
 *        import packageName.ClassName
 *  oppure la chiamo in tutto il codice con il nome completo packageName.ClassName
 *
 */

package M1_M2_M3.visibilitaCostruttoriGettersSetters;

//le classi non pubbliche si usano SOLO per mettere più classi in un file

//soltanto UN FILE DEL PROGETTO AVRà UN MAIN (in genere App.java)


//POLIMORFISMI:
/*
 *   OVERLOADING:
 *   in java è possibile definire più metodi in una classe con lo stesso nome ma che accettano parametri diversi
 */
/*
 *  OVERRIDING:
 *  in java è possibile ridefinire (sovrascrivere) un metodo con lo stesso nome di uno ereditato da un'altra classe padre
 *
 *  ci si riferisce poi al metodo ereditato con super.metodo() e a quello che lo sovrascrive come this.metodo()
 */

public class App {

    /*
     *   gli attributi e le classi statiche NON SONO legate a un'istanza
     *
     *   un metodo static è simile a una funzione classica, non essendo legata a un oggetto,
     *       e si richiama come Classe.metodo() (ad esempio Math.sqrt() )
     *
     *       se una classe di cui è stato istanziato un oggetto contiene un metodo static,
     *           questo non può essere invocato come ogg.metodo()
     *           (non essendo il metodo legato all'oggetto, non avrebbe senso)
     *
     *
     *   un attributo static non è legato a un solo oggetto, ma a tutti gli oggetti di quella classe
     *       non può assumere un valore legato a un solo oggetto (quindi non può essere istanziato),
     *       tutti gli oggetti della stessa classe avranno l'attributo statico allo stesso valore,
     *       si richiama come Classe.attr o come oggQualsiasi.attr
     *
     *       è utile per le costanti (ad esempio Math.PI )
     *
     */

    public static void main(String[] args) {
        Point p = new Point(2, 2);
        Point p1 = p;
        Point p0 = new Point();


        System.out.println(p);
        System.out.println(p1);//stampano lo stesso id perchè sono riferimenti allo stesso oggetto
        /*
         *   l'operatore new chiama il costruttore e
         *       ritorna un riferimento che punta alla locazione di memoria che contiene l'oggetto creato
         *       p e p1 sono quindi due riferimenti allo stesso oggetto
         *
         *   un oggetto è definito dalla sua classe, dal suo stato (ins dei val degli attributi),
         *       e ha un identifier univoco (stampabile)
         */
        System.out.println(p.getX());
        System.out.println(p.getY());

        System.out.println(p.toString());

        /////////////////////////////////////////////////////////////////////////////////

        /*
         *   la memoria viene deallocata automatica dal GARBAGE COLLECTOR
         *       che disalloca la memo di tutti gli oggetti che non hanno riferimenti attivi
         *       ed è un thread
         */

        Casa c = new Casa(12);
        Casa c1 = new Casa(4.5F, "masonette", 2);
        c1 = c;   //dopo questa istruzione l'oggetto Casa(4.5,masonette,2) perde il riferimento attivo
        //  e il garbage collector provvede a disallocare questo oggetto


        Casa.costante = 12;

        //essendo costante un attr static, tutti gli oggetti della classe Casa assumono costante=12
        System.out.println(c.costante);
        System.out.println(c1.costante);


    }
}


//a livello di linguaggio è possibile determinare livelli di visibilità per attributi e metodi

/*
 *
 *   private significa che solo all'interno della classe stessa vi si può accedere, nemmeno dalle sottoclassi della classe stessa
 *
 *   package o default (senza indicare il liv di visibilità) è accessibile dalla classe stessa, dalle classi dello stesso package, dalle sottoclassi nello stesso package
 *       (non è accessibile da classi e sottoclassi in altri package)
 *
 *   protected è visibile da tutti TRANNE che dalle classi di altri package(  MA DALLE SOTTOCLASSI IN ALTRI PACKAGE SI !)
 *
 *   public significa che tutti possono accedere (leggere e scrivere) -> DA EVITARE PER GLI ATTRIBUTI
 *
 *
 *   per leggere o scrivere un attributo dall'esterno è necessario scrivere metodi public per poterli modificare
 *      (getter e setter)
 *
 *   la visibilità degli attributi conviene che sia default o protected,
 *      in modo che le classi figlie possano ereditarli
 */
