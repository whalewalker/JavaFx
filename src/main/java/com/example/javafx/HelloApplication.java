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
    Scene content1, content2;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;

        Label label1 = new Label("Welcome to cinema");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(content2));

        VBox vBox = new VBox(20);
        layoutSetUp(vBox, button1, label1);
        content1 = new Scene(vBox, 200, 200);

        Button button2 = new Button("This scene look weird, go back to scene 1");
        button2.setOnAction(e -> window.setScene(content1));

        StackPane pane = new StackPane();
        layoutSetUp(pane, button2);
        content2 = new Scene(pane, 600, 300);

        display(window, "Cinema", content1);

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void display(Stage stage, String stageTitle, Scene scene) {
        stage.setTitle(stageTitle);
        stage.setScene(scene);
        stage.show();
    }

    public void eventSetup(Stage stage, Scene scene, Button button) {
        button.setOnAction(e -> stage.setScene(scene));
    }

    public void layoutSetUp(VBox pane, Button btn, Label label) {
        pane.getChildren().addAll(label, btn);
    }

    public void layoutSetUp(StackPane pane, Button btn) {
        pane.getChildren().addAll(btn);
    }
}
