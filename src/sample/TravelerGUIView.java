package sample;


import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public class TravelerGUIView {

    private TextField nameField, nationalityField,
                      passportField, flightNumberField, finalDestinationField;

    private Text introText, nameLabel, nationalityLabel,
                 passportLabel, flightNumberLabel, finalDestinationLabel;

    private TextArea result;

    private Button addButton, displayButton;

    private VBox primaryBox;

    private final static Font font = Font.font("Helvetica", 20);

    public TravelerGUIView() {
        System.setProperty("glass.accessible.force", "false");
        primaryBox = new VBox();
        primaryBox.setAlignment(Pos.CENTER);
        primaryBox.setSpacing(10);
        primaryBox.setStyle("-fx-background-color: null");

        introText = new Text("This is your Flight Manifest\n " +
                               "Please enter the following information for each passenger:"
                            );
        introText.setFont(font);
        VBox introBox = new VBox(introText);
        introBox.setAlignment(Pos.CENTER);
        introBox.setSpacing(5);
        primaryBox.getChildren().add(introBox);

    }

    public Parent getParent() {
        return primaryBox;
    }





}
