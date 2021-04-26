package M1_M2_M3.frameworks;

public class Person implements Comparable<Person>{
    private String nome;
    private String cognome;
    protected int age;


    public Person(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;
    }
    public Person(String nome, String cognome, int age){
        this.nome=nome;
        this.cognome=cognome;
        this.age=age;
    }

    @Override
    public int compareTo(Person o) {
        //voglio che l'odinamento avvenga tramite il cognome
        int cmp= cognome.compareTo(o.cognome);

        //se hanno lo stesso cognome deve comparare il nome
        if(cmp == 0)
            cmp = nome.compareTo(o.nome);

        return cmp;
    }

    @Override
    public String toString() {
        return nome+" "+cognome;
    }
}
