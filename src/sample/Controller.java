/**
 * Sample Skeleton for 'startWindow.fxml' Controller Class
 */

package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;


public class Controller {


    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;


    //TextField spotting_picking_cost
    @FXML // fx:id="spt1Field"
    private TextField spt1Field; // Value injected by FXMLLoader

    @FXML // fx:id="spt2Field"
    private TextField spt2Field; // Value injected by FXMLLoader

    @FXML // fx:id="tableall"
    private TreeTableView<?> tableall; // Value injected by FXMLLoader

    @FXML // fx:id="sp1"
    private TreeTableColumn<?, ?> sp1; // Value injected by FXMLLoader

    @FXML // fx:id="sp2"
    private TreeTableColumn<?, ?> sp2; // Value injected by FXMLLoader

    @FXML // fx:id="sp3_5"
    private TreeTableColumn<?, ?> sp3_5; // Value injected by FXMLLoader

    @FXML // fx:id="sp6_10"
    private TreeTableColumn<?, ?> sp6_10; // Value injected by FXMLLoader

    @FXML // fx:id="sp11_25"
    private TreeTableColumn<?, ?> sp11_25; // Value injected by FXMLLoader

    @FXML // fx:id="sp51_100"
    private TreeTableColumn<?, ?> sp51_100; // Value injected by FXMLLoader

    @FXML // fx:id="sp26_50"
    private TreeTableColumn<?, ?> sp26_50; // Value injected by FXMLLoader

    @FXML // fx:id="spCoast"
    private Button spCoast; // Value injected by FXMLLoader


    @FXML // fx:id="swField"
    private TextField swField; // Value injected by FXMLLoader

    @FXML // fx:id="tuField"
    private TextField tuField; // Value injected by FXMLLoader

    @FXML // fx:id="weigField"
    private TextField weigField; // Value injected by FXMLLoader


    @FXML // fx:id="coastAll"
    private Button coastAll; // Value injected by FXMLLoader


    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize ( ) {
        int z = 1;
        spCoast.setOnAction( event -> {

        } );


        assert spt1Field != null : "fx:id=\"spt1Field\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert spt2Field != null : "fx:id=\"spt2Field\" was not injected: check your FXML file 'startWindow.fxml'.";

        assert spCoast != null : "fx:id=\"spCoast\" was not injected: check your FXML file 'startWindow.fxml'.";

        assert tableall != null : "fx:id=\"tableall\" was not injected: check your FXML file 'startWindow.fxml'.";

        assert sp1 != null : "fx:id=\"sp1\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert sp2 != null : "fx:id=\"sp2\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert sp3_5 != null : "fx:id=\"sp3_5\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert sp6_10 != null : "fx:id=\"sp6_10\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert sp11_25 != null : "fx:id=\"sp11_25\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert sp26_50 != null : "fx:id=\"sp26_50\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert sp51_100 != null : "fx:id=\"sp51_100\" was not injected: check your FXML file 'startWindow.fxml'.";

        assert swField != null : "fx:id=\"swField\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert tuField != null : "fx:id=\"tuField\" was not injected: check your FXML file 'startWindow.fxml'.";
        assert weigField != null : "fx:id=\"weigField\" was not injected: check your FXML file 'startWindow.fxml'.";

        assert coastAll != null : "fx:id=\"coastAll\" was not injected: check your FXML file 'startWindow.fxml'.";
    }
}
