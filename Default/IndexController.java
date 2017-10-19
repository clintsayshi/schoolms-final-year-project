package Default;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Sections.ViewRecordsController;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 *
 * @author mcclint
 */
public class IndexController implements Initializable {
  
  public void initSessionID(final LoginManager loginManager, String sessionID) {
    /*sessionLabel.setText(sessionID);
    logoutButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        loginManager.logout();
      }
    });*/
  }
    
    @FXML private JFXButton btnHome;
    @FXML private JFXButton btnAddStudent;
    @FXML private JFXButton btnViewStudent;
    @FXML private JFXButton btnTest;
    @FXML private JFXButton btnTimeTable;
    @FXML private JFXButton btnAddStaff;
    @FXML private JFXButton btnViewStaff;
    @FXML private JFXButton btnLogout;
    @FXML private JFXButton btnClose;
   
    @FXML private AnchorPane Index;
    @FXML private AnchorPane home, addStudent, viewStudent, addStaff, viewStaff,attendance, stats, management, asses;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //JFXRippler fXRippler = new JFXRippler(lblDash);
        //JFXRippler fXRippler2 = new JFXRippler(lblMenu);
        //fXRippler2.setMaskType((JFXRippler.RipplerMask.RECT));
        //sideAnchor.getChildren().add(fXRippler);
        //toolBarRight.getChildren().add(fXRippler2);
        //openMenus();
        
        createPages();
        btnLogout.setOnAction((event) -> {
            showLoginScreen();
        });
       
    }
     public void showLoginScreen() {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
      loader.load();
      LoginController controller = loader.<LoginController>getController();
      
    } catch (IOException ex) {
      Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
    //Load all fxml files to a cache for swapping
    private void createPages() {
        try {
            home = FXMLLoader.load(getClass().getResource("/Sections/Dashboard.fxml"));
            addStudent = FXMLLoader.load(getClass().getResource("/Sections/AddStudent.fxml"));
            viewStudent = FXMLLoader.load(getClass().getResource("/Sections/ViewRecords.fxml"));
            addStaff = FXMLLoader.load(getClass().getResource("/Sections/AddStaff.fxml"));
            viewStaff = FXMLLoader.load(getClass().getResource("/Sections/ViewStaff.fxml"));
            attendance = FXMLLoader.load(getClass().getResource("/Sections/Attendance.fxml"));
            stats = FXMLLoader.load(getClass().getResource("/Sections/Stats.fxml"));
            management = FXMLLoader.load(getClass().getResource("/Sections/Management.fxml"));
            // attendance = FXMLLoader.load(getClass().getResource("/Sections/Attendance.fxml"));
            asses = FXMLLoader.load(getClass().getResource("/Sections/Assessment.fxml"));
            //set up default node on page load
            setNode(home);
        } catch (IOException ex) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void openHome(ActionEvent e){
        setNode(home);
    }
    
    public void openAddStudent(ActionEvent e){
        setNode(addStudent);
    }
    
    public void openListStudent(ActionEvent e){
        setNode(viewStudent);
    }
    
    public void AddStaff(ActionEvent e){
        setNode(addStaff);
    }
    public void viewStaff(ActionEvent e){
        setNode(viewStaff);
    }
    @FXML
    public void openAsses(ActionEvent e){
        setNode(asses);
    }
    
    public void viewStudent(ActionEvent e){
        setNode(asses);
    }
    @FXML
    public void Attendance(){
        setNode(attendance);
    }
    @FXML
    private void Management(ActionEvent e){
        setNode(management);
    }
    @FXML
    private void Stats(ActionEvent ev){
        setNode(stats);
    }
    @FXML
    private void exit(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Attempt To EXIT");
        alert.setHeaderText("Please Master Don't Leave...");
        alert.setContentText("Are you sure you want to EXIT?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            // ... user chose OK
            Platform.exit();
        } else {
            // ... user chose CANCEL or closed the dialog
        }
        
    }
     //Set selected node to a content holder
    private void setNode(Node node) {
        Index.getChildren().clear();
        Index.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

     public void setMainApp(SMSApplication mainApp) {
        // this.mainApp = mainApp;

        // pass the main app to the drawerContentController:
        //ViewRecordsController.setMainApp(mainApp);
    }
}
