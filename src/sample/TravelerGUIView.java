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

        nameLabel = new Text("Enter passenger name:");
        nameLabel.setFont(font);
        nameField = new TextField();
        VBox nameBox = new VBox(nameLabel, nameField);
        nameBox.setAlignment(Pos.CENTER);
        nameBox.setSpacing(10);
        primaryBox.getChildren().add(nameBox);

        nationalityLabel = new Text("Enter passenger's nationality:");
        nationalityLabel.setFont(font);
        nationalityField = new TextField();
        VBox nationalityBox = new VBox(nationalityLabel, nationalityField);
        nationalityBox.setAlignment(Pos.CENTER);
        nationalityBox.setSpacing(10);
        primaryBox.getChildren().add(nationalityBox);

        passportLabel = new Text("Enter passenger's passport number:");
        passportLabel.setFont(font);
        passportField = new TextField();
        VBox passportBox = new VBox(passportLabel, passportField);
        passportBox.setAlignment(Pos.CENTER);
        passportBox.setSpacing(10);
        primaryBox.getChildren().add(passportBox);

        flightNumberLabel = new Text("Enter passenger's flight number:");
        flightNumberLabel.setFont(font);
        flightNumberField = new TextField();
        VBox flightNumberBox = new VBox(flightNumberLabel, flightNumberField);
        flightNumberBox.setAlignment(Pos.CENTER);
        flightNumberBox.setSpacing(10);
        primaryBox.getChildren().add(flightNumberBox);

        finalDestinationLabel = new Text("Enter passenger's final destination:");
        finalDestinationLabel.setFont(font);
        finalDestinationField = new TextField();
        VBox finalDestinationBox = new VBox(finalDestinationLabel, finalDestinationField);
        finalDestinationBox.setAlignment(Pos.CENTER);
        finalDestinationBox.setSpacing(10);
        primaryBox.getChildren().add(finalDestinationBox);

        addButton = new Button("Add passenger information to manifest");
        displayButton = new Button("Show all passengers added to manifest");

        VBox buttonBox = new VBox(addButton, displayButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(30);
        primaryBox.getChildren().add(buttonBox);






    }

    public Parent getParent() {
        return primaryBox;
    }





}
