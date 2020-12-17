package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EditProfileWindow {

    public void show() {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        Label name = new Label("Имя: ");
        TextField nameInput = new TextField();
        nameInput.setMaxWidth(200);

        Label birthDate = new Label("Дата рождения: ");
        DatePicker birthDatePicker = new DatePicker();
        birthDatePicker.setMaxWidth(200);

        Button saveButton = new Button("Сохранить");
        saveButton.setMinWidth(100);

        Button exitButton = new Button("Выход");
        exitButton.setMinWidth(100);

        VBox buttons = new VBox(name, nameInput, birthDate, birthDatePicker, new HBox(saveButton, exitButton));

        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Редактирование");
        primaryStage.setScene(new Scene(root, 240, 200));
        primaryStage.show();
    }

    public void editName() {

    }

    public void editDate() {

    }

    public void save() {

    }

    public void exit() {

    }

}
