package M1_M2_M3.frameworks;
import java.util.ArrayList;
import java.util.List;

/*
*   List è una sottointerfaccia di Collection
*
*   metodi:
*       Object get(int)
*       Object set(int,Object)
*
 */
public class Interfaccia_List {

    public static void main(String[] args){

        List<Person> l= new ArrayList<Person>();
        //ArrayList è una classe che implementa l'interfaccia List

        l.add(new Person("Luca","Bianchi"));
        l.add(new Person("Marco", "Rossi"));

        for(Person p : l)
            System.out.println(p);

        for(int i=0; i< l.size(); i++)
            System.out.println(l.get(i));

    }
}
