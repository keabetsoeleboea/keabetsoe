package countries;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class FXMLDocumentController implements Initializable {
    @FXML
    private Button lesotho;
    @FXML
    private Rectangle rect1;
    @FXML
    private Rectangle rect2;
    @FXML
    private Rectangle rect3;
    

    HashMap<Integer, String> countries = new HashMap<>();
    
    @FXML
    void LESOTHOBUTTON(ActionEvent event) {
        rect1.setFill(Color.BLUE);
        rect2.setFill(Color.WHITE);
        rect3.setFill(Color.GREEN);
    } 
     @FXML
    void ESPANOL(ActionEvent event) {
        rect1.setFill(Color.RED);
        rect2.setFill(Color.YELLOW);
        rect3.setFill(Color.RED);
    }
     @FXML
    void MALAWI(ActionEvent event) {

        rect1.setFill(Color.BLACK);
        rect2.setFill(Color.RED);
        rect3.setFill(Color.GREEN);
    }
      @FXML
    void BOTSWANA(ActionEvent event) {

        rect1.setFill(Color.SKYBLUE);
        rect2.setFill(Color.BLACK);
        rect3.setFill(Color.SKYBLUE);
    }
     @FXML
    void MOZAMBIQUE(ActionEvent event) {

        rect1.setFill(Color.GREEN);
        rect2.setFill(Color.BLACK);
        rect3.setFill(Color.YELLOW);
    }
    @FXML
    void CLEAR(ActionEvent event) {
        rect1.setFill(null);
        rect2.setFill(null);
        rect3.setFill(null);
    }
    @FXML
    void EXIT(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
