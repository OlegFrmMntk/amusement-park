package View;

import Model.Visitor;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfileWindow {

    public EditProfileWindow editProfileWindow;

    public void show(Visitor visitor) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        Label id = new Label("ID: #" + visitor.getId());
        Label name = new Label("Имя: " + visitor.getName());
        Label birthDate = new Label("Дата рождения: " +
                visitor.getBirth_date().toLocaleString().substring(0, visitor.getBirth_date().toLocaleString().indexOf(',')));
        Label status = new Label("Статус: " + (visitor.isVip() ? "VIP" : "Обычный"));
        VBox info = new VBox(id, name, birthDate, status);

        Label tickets = new Label("Билеты:");
        ComboBox ticketsComboBox = new ComboBox();
        ticketsComboBox.setMinWidth(200);

        Label subscriptions = new Label("Подписки:");
        ComboBox subscriptionsComboBox = new ComboBox();
        subscriptionsComboBox.setMinWidth(200);

        Label recomedations = new Label("Рекомендации:");
        ComboBox recomendationsComboBox = new ComboBox();
        recomendationsComboBox.setMinWidth(200);

        Button editButton = new Button("Редактировать");
        editButton.setMinWidth(200);

        Button deleteButton = new Button("Удалить");
        deleteButton.setMinWidth(100);

        Button exitButton = new Button("Выход");
        exitButton.setMinWidth(100);

        VBox buttons = new VBox(info, tickets, ticketsComboBox, subscriptions, subscriptionsComboBox, recomedations,
                recomendationsComboBox, editButton, new HBox(deleteButton, exitButton));

        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Профиль");
        primaryStage.setScene(new Scene(root, 240, 370));
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
