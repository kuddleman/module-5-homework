package sample;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.stage.*;



public class TravelerGUIController extends Application {
    private FlightManifest flightManifest;
    private TravelerGUIView travelerInputView;

    public TravelerGUIController() {
        flightManifest = new FlightManifest();
        travelerInputView = new TravelerGUIView();

        travelerInputView.setDisplayTravelersAction(this::displayTravelers);
        travelerInputView.setAddTravelerAction(this::addTraveler);
    }

    @Override
    public void start(Stage primaryStage) {
        TravelerGUIController controller = new TravelerGUIController();

        Scene scene = new Scene(controller.travelerInputView.getParent(), 800, 3200, Color.BEIGE);
        primaryStage.setTitle("Traveler Manifest");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void addTraveler(ActionEvent event) {
        System.out.println("ok");
    }

    private void displayTravelers(ActionEvent event) {
        System.out.println("ok");
    }



}
