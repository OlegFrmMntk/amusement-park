package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class RatingWindow {


    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        Label comment = new Label("Комментарий:");
        TextField commentInput = new TextField();
        commentInput.setMinHeight(100);


        RadioButton rate1 = new RadioButton("1");
        RadioButton rate2 = new RadioButton("2");
        RadioButton rate3 = new RadioButton("3");
        RadioButton rate4 = new RadioButton("4");
        RadioButton rate5 = new RadioButton("5");

        HBox rates = new HBox(rate1, rate2, rate3, rate4, rate5);
        rates.setSpacing(20);

        Button enterButton = new Button("Ввод");
        enterButton.setMinWidth(130);

        Button exitButton = new Button("Выход");
        exitButton.setMinWidth(130);

        VBox buttons = new VBox(comment, commentInput, rates, new HBox(enterButton, exitButton));
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Оценка");
        primaryStage.setScene(new Scene(root, 300, 260));
        primaryStage.show();
    }

    public void commentOn() {

    }

    public void rate() {

    }

    public void exit() {

    }

}
