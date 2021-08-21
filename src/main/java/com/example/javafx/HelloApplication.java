package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;
    Button button;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        button = new Button("Click me");
        button.setOnAction(e -> AlertBox.display("Window", "Awesome user interface"));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane, 300, 250);

        display(window, "Cinema", scene);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void display(Stage stage, String stageTitle, Scene scene) {
        stage.setTitle(stageTitle);
        stage.setScene(scene);
        stage.show();
    }

}
