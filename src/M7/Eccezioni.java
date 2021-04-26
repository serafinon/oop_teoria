package M7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Eccezioni {
    public static void main(String[] args){

        char[] v= new char[256];
        FileReader f = null;

        //in ASSENZA DI DELEGA
        try{
            f = new FileReader("test.txt");
            f.read(v);
            f.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally { //ci passa sempre, sia se vengono generate eccezioni sia se non
            try{
                if(f!= null)
                    f.close();
            }
            catch(IOException e){
                throw new RuntimeException();
            }
        }


        /*
        *   FileNotFoundException è una sottoclasse di IOException
        *   per la gestione delle eccezioni vanno prima fatti i catch per le eccezioni più specifiche, in modo da avere maggiori info sull'eccezione
        *
        *   le sotto-classi dirette di Exception sono
        *       IOException
        *       SQLException
        *       RuntimeException (non è possibile metterla in un catch)
         */



        //gestione dell'eccezione delegata dal metodo funz()
        try{
            new Classe().funz();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }


        //gesione dell'eccezione custom delegata dal metodo funz2()
        try{
            new Classe().funz2();
        }
        catch (MyException e){
            e.printStackTrace();
        }




    }
}
