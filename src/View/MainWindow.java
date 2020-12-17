package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow {

    public UserWindow userWindow;
    public AdministratorWindow administratorWindow;

    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        Label login = new Label("Имя пользователя:");
        TextField loginInput = new TextField();

        Label password = new Label("Пароль:");
        TextField passwordInput = new TextField();

        Button loginButton = new Button("Вход");
        loginButton.setMinWidth(100);

        Button exitButton = new Button("Выход");
        exitButton.setMinWidth(100);

        Button registrationButton = new Button("Регистрация");
        registrationButton.setMinWidth(200);

        VBox buttons = new VBox(login, loginInput, password, passwordInput, new HBox(loginButton, exitButton), registrationButton);
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Главное окно");
        primaryStage.setScene(new Scene(root, 240, 260));
        primaryStage.show();
    }

    public void login() {

    }

    public void exit() {

    }

}
