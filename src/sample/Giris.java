package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class Giris implements Initializable {

    ObservableList<String> abonesecim = FXCollections.observableArrayList();


    @FXML
    private Button giris;

    @FXML
    private Label kayit_ol_label;

    @FXML
    private PasswordField sifre_gir;

    @FXML
    private TextField kullanici_adi_gir;

    @FXML
    private Label yanlis_sifre;

    @FXML
    private ChoiceBox<String> abone_tur;

    @FXML
    private PasswordField sifre_kayit;

    @FXML
    private Button kayit_ol;

    @FXML
    private TextField kullanici_kayit;

    @FXML
    private Button admin_giris;

    @FXML
    private TextField admin_id;

    @FXML
    private Label admin_label;
    @FXML
    private TextField ulke_kayit;

    @FXML
    private void secimKutu() {
        abonesecim.removeAll(abonesecim);
        String a="Premium";
        String b="Normal";
        abonesecim.addAll(a,b);

        abone_tur.getItems().addAll(abonesecim);
    }

    public void girisButtonOnAction(ActionEvent actionEvent) throws IOException {
        girisOnay();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        secimKutu();
    }

    public void admingirisButtonOnAction(){


              admin_label.setText("Hosgeldiniz Admin");

    }

    public void kayitOlButonOnAction(ActionEvent event){
            newUser();
        }



    public void newUser() {
        Database connectNow = new Database();

        Connection connectNowDB = connectNow.getConnection();

        String kullaniciAdi = kullanici_kayit.getText();
        String sifre = sifre_kayit.getText();
        String ulke = ulke_kayit.getText();
        String sub = abone_tur.toString();

        String sql = "INSERT INTO users(user_Name, pass,country,sub) VALUES ('";
        String values = kullaniciAdi + "','" + sifre + "','" + ulke + "','"+sub+"')";

        String newUserQuery = sql +values;

        try {
            Statement statement = connectNowDB.createStatement();
            statement.executeUpdate(newUserQuery);
            kayit_ol_label.setText("Yeni kullanici eklendi.");


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }



    public void girisOnay(){
        Database connectNo = new Database();

        Connection connectDB = connectNo.getConnection();

        String girisKontrol = "SELECT count(1) FROM kullanici_hesap WHERE kullanici_Ad = '"+ kullanici_adi_gir.getText() + "' AND sifre ='"+sifre_gir.getText()+"'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(girisKontrol);

            while(queryResult.next()){

                if(queryResult.getInt(1)== 1){
                    yanlis_sifre.setText("Basari İle Gerceklesti!");
                }else{

                    yanlis_sifre.setText("Yanlis Giris");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

    }
}
