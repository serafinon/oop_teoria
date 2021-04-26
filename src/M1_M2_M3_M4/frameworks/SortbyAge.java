package M1_M2_M3_M4.frameworks;

import java.util.Comparator;

public class SortbyAge implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        return p1.age - p2.age;
    }

}
