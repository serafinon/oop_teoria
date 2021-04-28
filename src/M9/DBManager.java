package M9;


/*
*   molti databases usano il protocollo TCP (e un specifica porta) per comunicare con le applicazioni
*   (es. di db: Oracle, MySQL, MS SQL server, MariaDB, ecc.)
*
*   JDBC è una libreria per comunicare con un database.
*       ha metodi che rendono possibile la comunicazione via TCP con qualsiasi db (via TPC anche con db locali)
*       è una API e consente di gestire più driver per poter comunicare, nella stessa app Java, con più db
*
*   -> per leggere dati da locale, esistono librerie (es. sqllite) che consentono di operare su un file locale come se fosse un db
*           SQLLite è molto usata su Android ed è implementabile nel frame di JFrame
*
*
*   un driver JDBC implementa il protocollo che il db con cui opera utilizza per comunicare
*   esistono diversi tipi di driver (noi usiamo i Type 4, pure java)
*   ogni dbms ha il suo driver specifico (deve essere scaricato)
*/


/*
*   per connettersi a un DB:
*
*       - caricare il Driver specifico
*           Class.forName("percorso.del.Driver.nel.progetto"); //carica dinamicamente le classi del Driver
*           es. Class.forName("com.mysql.jdbc.Driver")
*
*       - stabilire la connessione
*           Connection c = DriverManager.getConnection(String url);
*           Connection c = DriverManager.getConnection(String url, String user, String passwd);
*           Connection c = DriverManager.getConnection(String url, Properties prop);
*               //gli oggetti Propertis sono come HashMap che tengono traccia delle configurazioni del software
*           es. Connection c = DriverManager.getConnection("jdbc:mysql://localhost/dbname?user=user&password=pass");
*
*       - creare uno Statement (oggetto che consente di inviare stringhe sql a un db)
*           Statement statement = c.createStatement();
*           -> ci sono altri oggetti per gli statement
*               PreparedStatement è utile per ripetere la stessa query molte volte, modificandone solo i parametri
*               CallableStatement serve ad accedere alle store-procedure sul db
*
*       - eseguire l'sql
*           int executeUpdate(String SQL) -> per scrivere sul DB, lo modificano.
*               //ritorna il numero di righe modificate
*           ResultSet rs = executeQuery(String SQL) -> per leggere dal database, ritorna i dati
*           es. statement.executeUpdate("CREATE TABLE Person(id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(30))");
*           es. statement.executeQuery("SELECT * FROM Person");
*
*       - get ResultSet (oggetto per il ritorno del db)
*           è simile a una collection. Le istanze di ResultSet hanno un cursore che indica la riga corrente del risultato
*           Hanno 3 gruppi di metodi:
*               . per la navigazione
*                       absolute() ti posiziona su un record indicando il suo numero
*                       first() last() next() previous()
*                       getRow() isFirst()
*               . per prelevare i dati
*                   String rs.getString("nomeColonna")
*                   String rs.getString(int n) //n indice della colonna
*                   getInt() getLong() getDouble()
*               . per ottenere l'indice di una colonna
*                   int rs.findColumn("nomeColonna")
*
*           es. while(rs.next()){ rs.getInt("id"); rs.getString("nome"); }
*
*
*       - chiudere la connessione
*           statement.close();
*           c.close();
*
*           bisogna chiudere opportunamente il DB
*               c=null;
*               statement=null;
*               try{
*                   ...
*               } catch(SQLException e){
*                   ...
*               } finally{
*                   if( c != null ){
*                       statement.close();
*                       c.close();
*                   }
*               }
*
*
 */

import java.sql.*;

public class DBManager { //delego tutte le eccezioni generate

    public static final String JBDCDriverMySQL = "com.mysql.jdbc.Driver";
    public static final String JBDCURLMySQL = "jdbc:mysql://localhost/dbname?user=user&password=pass";

    protected Statement statement;
    protected Connection connection;

    public DBManager(String Driver, String URL) throws ClassNotFoundException, SQLException {
            Class.forName(Driver);
            connection = DriverManager.getConnection(URL);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);
    }

    //i metodi "passaparola" successdivi consentono di usare i metodi dell'oggetto statement dall'esterno, tramite l'oogetto DBManager
    public ResultSet executeQuery(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    public int executeUpdate(String query) throws SQLException {
        return statement.executeUpdate(query);
    }

    public void close() throws SQLException {
        if(connection != null){
            statement.close();
            connection.close();
        }
    }
}
