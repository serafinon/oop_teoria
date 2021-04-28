package M9;

import java.sql.*;

//questa classe instanzia il DBManager e offre metodi di base per la gestione dei DB

public class DBBasics {
    protected DBManager db;

    //risolvo solo le eccezioni generate dalla creazione dell'oggetto db della classe DBManager
    public DBBasics() throws SQLException {
        try {
            db = new DBManager(DBManager.JBDCDriverMySQL, DBManager.JBDCURLMySQL);
            db.executeQuery("SELECT * FROM book");
        }catch(SQLException e) {
            db.executeUpdate("DROP TABLE IF EXIST book");
            db.executeUpdate("CREATE book(id INTEGER PRIMARY KEY, title VARCHAR(40), author VARCHAR(30), pages INTEGER )");
            db.executeUpdate("INSERT INTO book (id, title, author, pages) VALUES(1, 'ciccio', 'Gulliver Rossi', 36)");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public void testSelect() throws SQLException {
        ResultSet rs = db.executeQuery("SELECT * FROM book LIMIT 100");
        while(rs.next()){
            this.printRow(rs);
        }
    }

    public void testUpdate() throws SQLException{
        db.executeUpdate("UPDATE book SET title=''");
    }

    private void printRow(ResultSet resultSet) throws SQLException {
        System.out.println(resultSet.getString("title")+" "+resultSet.getString("author"));
    }
}

