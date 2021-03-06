package sample;


import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;


public class TravelerGUIView {

    private TextField nameField, nationalityField,
                      passportField, flightNumberField, finalDestinationField;

    private Text introText, nameLabel, nationalityLabel,
                 passportLabel, flightNumberLabel, finalDestinationLabel, resultLabel;

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

        resultLabel = new Text("");
        resultLabel.setFont(font);
        resultLabel.setFill(Color.RED);
        resultLabel.setVisible(false);
        result = new TextArea("");
        result.setVisible(false);
        result.setEditable(false);
        VBox resultBox = new VBox(resultLabel, result);
        resultBox.setAlignment(Pos.CENTER);
        resultBox.setSpacing(10);
        primaryBox.getChildren().add(resultBox);

    }

    public Parent getParent() {
        return primaryBox;
    }

    public void setDisplayTravelersAction(EventHandler<ActionEvent> handler) {
        displayButton.setOnAction(handler);
    }

    public void setAddTravelerAction(EventHandler <ActionEvent> handler) {
        addButton.setOnAction(handler);
    }

    public void displayResultText(String label, String output) {
        resultLabel.setVisible(true);
        resultLabel.setText(label);

        result.clear();
        result.setVisible(true);
        result.setText(output);
    }

    public void hideResultText() {
        result.clear();
        result.setVisible(false);
        resultLabel.setVisible(false);
    }

    public void clearInputs() {
        nameField.clear();
        nationalityField.clear();
        passportField.clear();
        flightNumberField.clear();
        finalDestinationField.clear();
    }

    public String getNameField() {
        return nameField.getText();
    }

    public String getNationalityField() {
        return nationalityField.getText();
    }

    public String getPassportField() {
        return passportField.getText();
    }

    public String getFlightNumberField(){
        return flightNumberField.getText();
    }

    public String getFinalDestinationField() {
        return finalDestinationField.getText();
    }





}
