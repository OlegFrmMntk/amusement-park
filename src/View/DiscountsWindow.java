package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DiscountsWindow {

    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        Label subscription = new Label("Выберите абонемент:");


        ComboBox subscriptionsComboBox = new ComboBox();
        subscriptionsComboBox.setMinWidth(200);

        Label description = new Label("Описание:");
        TextField descriptionInput = new TextField();
        descriptionInput.setMinHeight(100);

        Button buySubscriptionButton = new Button("Купить");
        buySubscriptionButton.setMinWidth(100);

        Button rateButton = new Button("Выйти");
        rateButton.setMinWidth(100);

        VBox buttons = new VBox(subscription, subscriptionsComboBox, description, descriptionInput,
                new HBox(rateButton, buySubscriptionButton));

        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Абонементы");
        primaryStage.setScene(new Scene(root, 240, 270));
        primaryStage.show();
    }

    public void login() {

    }

    public void exit() {

    }
}
