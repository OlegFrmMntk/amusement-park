package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AttractionsWindow {

    public RatingWindow ratingWindow;

    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        Label attraction = new Label("Выберите аттракцион:");


        ComboBox atrractionsComboBox = new ComboBox();
        atrractionsComboBox.setMinWidth(200);

        Label description = new Label("Описание:");
        TextField descriptionInput = new TextField();
        descriptionInput.setMinHeight(100);

        Button findRouteButton = new Button("Постороить маршрут");
        findRouteButton.setMinWidth(200);

        Button buyTicketButton = new Button("Купить билет");
        buyTicketButton.setMinWidth(100);

        Button rateButton = new Button("Оценить");
        rateButton.setMinWidth(100);

        VBox buttons = new VBox(attraction, atrractionsComboBox, description, descriptionInput, findRouteButton,
                new HBox(rateButton, buyTicketButton));

        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Атракционы");
        primaryStage.setScene(new Scene(root, 240, 300));
        primaryStage.show();
    }

    public void login() {

    }

    public void exit() {

    }

}
