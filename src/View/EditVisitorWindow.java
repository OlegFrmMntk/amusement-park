package View;

import Model.Visitor;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EditVisitorWindow {

    public void show() {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        Label visitor = new Label("Посетитель:");
        ComboBox visitorComboBox = new ComboBox();
        visitorComboBox.setMinWidth(200);

        Label id = new Label("ID:");
        TextField idInput = new TextField();
        idInput.setMinWidth(200);

        Label name = new Label("Имя:");
        TextField nameInput = new TextField();
        nameInput.setMinWidth(200);


        Label birthDate = new Label("Дата рождения:");
        DatePicker birthDatePicker = new DatePicker();
        birthDatePicker.setMinWidth(200);

        Label status = new Label("Статус:");
        ComboBox<String> statusComboBox = new ComboBox<String>();
        statusComboBox.getItems().addAll("VIP", "Обычный");
        statusComboBox.setMinWidth(200);

        Button deleteButton = new Button("Сохранить");
        deleteButton.setMinWidth(100);

        Button exitButton = new Button("Отмена");
        exitButton.setMinWidth(100);

        VBox buttons = new VBox(visitor, visitorComboBox, id, idInput, name, nameInput, birthDate, birthDatePicker,
                status, statusComboBox, new HBox(deleteButton, exitButton));

        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Редактирование посетителей");
        primaryStage.setScene(new Scene(root, 240, 390));
        primaryStage.show();
    }

    public void showEditProfileWindow() {

    }

    public void deleteProfile() {

    }

    public void getTicketsList() {

    }

    public void getSubscriptionsList() {

    }

    public void getRecommendationsList() {

    }

    public void exitFromProfile() {

    }
}
