package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserWindow {

    public AttractionsWindow attractionsWindow;
    public RestPlacesWindow restPlacesWindow;
    public ProfileWindow profileWindow;
    public DiscountsWindow discountsWindow;

    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(50, 20, 50, 20));

        Button privateOfficeButton = new Button("Личный кабинет");
        privateOfficeButton.setMinWidth(200);

        Button attractionsButton = new Button("Аттракционы");
        attractionsButton.setMinWidth(200);

        Button restPlacesButton = new Button("Места отдыха");
        restPlacesButton.setMinWidth(200);

        Button discountsButton = new Button("Скидки");
        discountsButton.setMinWidth(200);

        Button exitButton = new Button("Выход");
        exitButton.setMinWidth(200);

        VBox buttons = new VBox(privateOfficeButton, attractionsButton, restPlacesButton, discountsButton, exitButton);
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Окно пользователя");
        primaryStage.setScene(new Scene(root, 240, 260));
        primaryStage.show();
    }

    public void privateOffice() {

    }

    public void attractions() {

    }

    public void restPlaces() {

    }

    public void discounts() {

    }

    public void exit() {

    }

}
