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
}
