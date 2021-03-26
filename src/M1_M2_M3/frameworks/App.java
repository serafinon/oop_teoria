package M1_M2_M3.frameworks;

/*
*   il framework delle collections mette a disposizione gli strumenti oper anipolare gruppi du oggetti
*       in pratica sono versioni avanzate dei vettori
*
*   il framework è un gruppo di classi e interfacce cobn strutture dati utili
*   le interfacce rappresentano le funzionalità
*   le classi astratte implementano parte delle funzionalità delle interfacce
*   le classi concrete implementano le funzionalità
*   ci sono anche degli algoritmi
*
*
*   consentono di creare classi array ridimensionabili
*           ogni volta che il vettore si ingrandisce, raddoppia la sua dimensione
*           il vettore si ingrandisce quando viene fatta richiesta di aggiungere un elemento al vettore pieno
*           per ingrandirlo creo un vettore copia dell'originale con la dimensione doppia, e dealloco il vettore originale
*   il vettore ridimensionabile in realtà è una lista o un albero bilanciato o una struttura basata su hash table
*
 */

/*
*   INTERFACCE PRINCIPALI:
*
*   Iterable, indica qualsiasi cosa sia iterabile, non viene MAI implementata direttamente da una classe
*   viene specializzata dall'interfaccia Collection, che rappr insieme di elementi generici
*   Collection viene specializzata da diverse interfacce, quali Set , Queue e List
*   Set viene ulteriormente specializzata da SortedSet
*
*   Map, che viene poi specializzata da SortedMap
*
*
*
*   CLASSI RAPPRESENTABILI:
*
*   Set può rappresentare degli HashSet, TreeSet o LinkedHashSet (l'ultimo è un ibrido dei primi due)
*   List può rappr degli ArrayList e LinkedList
*   Map può rappresentare degli HashMap, TreeMap o LinkedHashMap (l'ultimo è un ibrido dei primi due)
 *
 */


import java.util.ArrayList;

/*
*   l'interfaccia Iterable dichiara un unico metodo iterator()
*       che ritorna un oggetto di tipo Iterator
*
*   Iterator è un'interfaccia con metodi
*       boolean hasNext()
*       Object bext()
*       void remove()
*
*   Collection ha due costruttori
*       Collection()
*       Collection(Collection c)
*           siccome vengono ereditati dalle sottointerfacce,
*               è possibile, da una classe di una sua sottointerfaccia (es. Lista)
*               istanziare un altro oggetto di una classe di un'altra sottointerfaccia(es. Set)
*   Collection ha metodi
*       int size()
*       boolean isEmpty()
*       boolean contains(Object)    boolean containsAll(Collection)
*       boolean add(Object)         boolean addAll(Collection)
*       boolean remove(Object)      boolean removeAll(Collection)
*       void clear()
*       Object[] toArray()
*       Iterator iterator() //ereditato da Iterable
*
 */
public class App {

    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<Integer>();
        //l è un oggetto della classe ArrayList che implementa l'interfaccia List (che implementa Collection che implementa Iterable)


        for(Integer o : l){
            System.out.println((o));
        }
    }


}
