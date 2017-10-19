package Default;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Manager.PrintReport;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import Manager.SetupTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import data.PrintReports;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

/**
 * FXML Controller class
 * @author mcclint
 * */
public class LoginController implements Initializable{
  @FXML private JFXTextField usernameLogin;
  @FXML private JFXPasswordField passwordLogin;
  @FXML private JFXButton LoginBtn;
  @FXML private JFXComboBox<String> userType;
  @FXML private Hyperlink forgotPassword;
  @FXML private ImageView imgProgress;
  // Login Details
  private String type;
  private String username;
  private String password;
  private Connection connector;
  private PreparedStatement finder;
  private ResultSet rs;
  private int counter =1;
  
  public void initialize() {
      
  }
  
  public void initManager(final LoginManager loginManager) {
   
    LoginBtn.setOnAction((event) -> {
        imgProgress.setVisible(true);
        LoginBtn.setVisible(false);
        forgotPassword.setVisible(false);
        
        String sessionID = authorize();
        System.out.println(sessionID);
        if(sessionID != null) {
          loginManager.authenticated(sessionID);
            System.out.println("I just called authenticated Method.");
        }else{
            JOptionPane.showMessageDialog(null, "Incorrent User Name or Password", "Wrong Credentials", JOptionPane.ERROR_MESSAGE);
                imgProgress.setVisible(false);
                LoginBtn.setVisible(true);
                forgotPassword.setVisible(true);
        }
    });
  }
    /**
     * Check authorization credentials.
     * If accepted, return a sessionID for the authorized session
     * otherwise, return null.
     */   
    private String authorize() {
      // 
      username = usernameLogin.getText();
      password = passwordLogin.getText();
      type = userType.getSelectionModel().getSelectedItem();
        System.out.println(type);
      String sql = "";
      if(type.equalsIgnoreCase("admin")){
         sql = " Select * from admins where adminindex='"+username+"' and asscode='"+password+"'";
      }
      else{
         sql = " Select * from staffacc where stname='"+username+"' and password='"+password+"'";
      }
      
     try {
         System.out.println("connecting to db");
          rs = db.getConnect().createStatement().executeQuery(sql);
          counter = 0;
          while(rs.next()){
              counter = counter + 1;
              System.out.println("here to DB");
          }
      } catch (SQLException ex) {
          Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
      }
      return counter == 1 ? generateSessionID() : null;
    }

    private static int sessionID = 0;

    private String generateSessionID() {
      sessionID++;
        System.out.println("I made it here");
      return type;
    }
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        imgProgress.setVisible(false);
        initUserType(userType);
        LoginBtn.disableProperty().bind(userType.valueProperty().isNotNull().and
        (usernameLogin.textProperty().isNotEmpty()).and
        (passwordLogin.textProperty().isNotEmpty()).not());
        // handleValidation();
        /*LoginBtn.setOnAction((event) -> {
            try {
                // --- Show Jasper Report on click-----
                new PrintReport().showReport();
            } catch (ClassNotFoundException | JRException | SQLException e1) {
                e1.printStackTrace();
            }
        });*/
        forgotPassword.setOnAction((event) -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Forgot Password");
            alert.setHeaderText("If you forgot your Username or Password...");
            alert.setContentText("Contact Administrator to reset your login credentials");

            alert.showAndWait();
            
        });
    }
    
    public static void initUserType(JFXComboBox<String> ComboBox){ 
        ComboBox.getItems().add("Admin");
        ComboBox.getItems().add("Principal");
        ComboBox.getItems().add("Clerk");
        ComboBox.getItems().add("Teacher");
    }
    
    private void handleValidation() {
        RequiredFieldValidator fieldValidator = new RequiredFieldValidator();
        fieldValidator.setMessage("Input required");
        fieldValidator.setIcon(new FontAwesomeIconView(FontAwesomeIcon.TIMES));
        usernameLogin.getValidators().add(fieldValidator);
        usernameLogin.focusedProperty().addListener((ObservableValue<? extends Boolean> o, Boolean oldVal, Boolean newVal) -> {
            if (!newVal) {
                usernameLogin.validate();
            }
        });
        RequiredFieldValidator fieldValidator2 = new RequiredFieldValidator();
        fieldValidator2.setMessage("Input required");
        fieldValidator2.setIcon(new FontAwesomeIconView(FontAwesomeIcon.TIMES));
        passwordLogin.getValidators().add(fieldValidator2);
        passwordLogin.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if (!newValue) {
                passwordLogin.validate();
            }
        });
        RequiredFieldValidator fieldValidator3 = new RequiredFieldValidator();
        fieldValidator2.setMessage("Input required");
        fieldValidator2.setIcon(new FontAwesomeIconView(FontAwesomeIcon.TIMES));
        
    }
}
