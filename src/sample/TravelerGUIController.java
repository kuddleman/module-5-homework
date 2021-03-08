package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TravelerGUIController extends Application {
    private FlightManifest flightManifest;
    private TravelerGUIView travelerInputView;

    public TravelerGUIController() {
        flightManifest = new FlightManifest();
        travelerInputView = new TravelerGUIView();
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



}
