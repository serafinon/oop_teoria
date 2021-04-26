package M5;

import java.util.Collection;
import java.util.Collections;

public interface Shop<T> {
    T sell();
    void buy(T item);
    void sell(Collection<? super T> item, int nItems);
        //in generale <? super T> si usa in lettura
    void buy(Collection<? extends T> item); //se ho uno shop di vegetables non posso acquistare fruits
        //in generale <? extends T> si usa in scrittura


    /*
     *   List<Fruit> NON è UN SOTTOTIPO DI List<Product>
     *   sono entrambi sottotipi di List<?>

     *   List<?> è una lista di unknown
     *   ? è una wildcard che indica qualsiasi tipo
     *       le wildcard supportano upper e lower bounds
     *
     *       List<? extends Fruit> può contenere qualcunque cosa che estenda Fruit
     *
     *       List<? super Fruit> può contenere qualunque cosa che sia padre (o padre del padre ecc.) di Fruit
     *
     */

}
