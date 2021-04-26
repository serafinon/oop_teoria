package M7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Classe {

    //DELEGA COMPLETA
    public void funz() throws IOException { //throws delega le eccezioni

        char[] v= new char[256];
        FileReader f = new FileReader("test.txt");
        f.read(v);
        f.close();
    }
    /*
    *   con la delega completa non gestisco l'eccezione nel metodo funz()
    *       ma delego la gestione al main (chiamante)
     */



    //DELEGA PARZIALE

    public void funz2() throws MyException { //throws delega le eccezioni

        char[] v= new char[256];
        FileReader f;

        try{
            f = new FileReader("test.txt");
            f.read(v);
            f.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            throw (new MyException()); //throw genera le eccezioni
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    /*
    * dopo aver gestito l'ecczione, ne genero un'altra
     */
}
