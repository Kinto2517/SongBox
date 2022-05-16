package sample;


import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public Connection databaseLink;

    public Connection getConnection(){
        String databaseIsim = "demo";
        String databaseKullanici = "root";
        String databaseSifre ="";
        String url = "jdbc:mysql//localhost:3307/"+databaseIsim;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseKullanici,databaseSifre);
            System.out.println("Baglandi");

        }catch (Exception e){
            System.out.println("OLMADI" +
                    "");
            e.printStackTrace();
            e.getCause();
        }

   return databaseLink;
    }

}
