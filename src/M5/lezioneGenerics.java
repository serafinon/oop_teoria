package M5;

/*
*   i generics sono stati aggiunti per avere il type checking a tempo di compilazione
*
*   i generics consentono di indicare il tipo degli elementi delle collections (quello tra <>)
*
*   si possono applicare i generics anche a altre interfacce e classi(es. shop)
*
*   anche i metodi possono essere generic (es. fill() di java.util.Collections)
*       static <T> void fill(List<? super T> list, T obj)
*
*   i generics hanno rilevanza solo a tempo di compilazione, non a runtime (code erasure)
*       quindi non posso confrontare i tipi di due collection all'interno del codice
*
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class lezioneGenerics {
    public static void main(String[] args){

        Shop<Fruit> fruitShop= new Shop<Fruit>() {
            @Override
            public Fruit sell() {
                return null;
            }

            @Override
            public void buy(Fruit item) {

            }

            @Override
            public void sell(Collection<? super Fruit> item, int nItems) {

            }

            @Override
            public void buy(Collection<? extends Fruit> item) {

            }
        };
        Shop<Product> productShop= new Shop<Product>() {
            @Override
            public Product sell() {
                return null;
            }

            @Override
            public void buy(Product item) {

            }

            @Override
            public void sell(Collection<? super Product> item, int nItems) {

            }

            @Override
            public void buy(Collection<? extends Product> item) {

            }
        };

        List<Product> prodotti=new ArrayList<Product>(Arrays.asList(new Product(), new Product()));
        List<Fruit> frutte=new ArrayList<Fruit>(Arrays.asList(new Fruit(), new Fruit()));

        fruitShop.sell(frutte, 2);
        fruitShop.sell(prodotti, 2); //essendo negozio di frutta può vendere prodotti, che è superclasse di Fruit, (perchè tutti la frutta è un prodotto)
        //productShop.sell(frutte, 2);  questo non va bene perchè List<Fruit> NON è UN SOTTOTIPO DI List<Product> (vedi Shop.java)
        productShop.sell(prodotti, 2);

        fruitShop.buy(frutte);
        //fruitShop.buy(prodotti); //il negozio di frutta non può vendere altro che frutta
        productShop.buy(frutte);
        productShop.buy(prodotti);




    }


}
