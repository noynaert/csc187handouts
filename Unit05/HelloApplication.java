package com.example.fxcolors;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Color Demo in FX");

        VBox pane = new VBox();
        Scene mainScene = new Scene(pane, 600, 300);

        Label defaultLabel = new Label("Boring label");
        pane.getChildren().add(defaultLabel);

        //make a Red Label and add it to the pane
        Label redLabel = new Label("Red");
        redLabel.setTextFill(Color.rgb(0xFF,0x00,0x00));
        pane.getChildren().add(redLabel);

        //Add some other Colors
        addLabel(pane, "Green", "#00FF00");
        addLabel(pane, "Blue in hex", 0, 0, 0xff);
        addLabel(pane, "Blue in Decimal",0,0,255);
        addLabel(pane, "Half the Blue", 0,0, 0x80);
        addLabel(pane, "White", 0xfF,0xfF,0xff);
        addLabel(pane,"purple",0xff, 0x00, 0xff);
        addLabel(pane, "Bob", "#abcdef");
        stage.setScene(mainScene);
        stage.show();
    }

    public static void addLabel(VBox pane, String message, int red, int green, int blue){
        Label label = new Label(message);
        label.setTextFill(Color.rgb(red, green, blue));
        pane.getChildren().add(label);

    }
    public static void addLabel(VBox pane, String message, String hexColor){
        Label label = new Label(message);
        label.setTextFill(Color.web(hexColor));
        pane.getChildren().add(label);

    }
    public static void main(String[] args) {
        launch();
    }
}
