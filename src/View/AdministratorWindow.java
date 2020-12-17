package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdministratorWindow extends Application {

    public EditVisitorWindow editVisitorWindow;
   // public EditAttractionsWindow editAttractionsWindow;
   // public EditRestPlacesWindow editRestPlacesWindow;
   // public editDiscountsWindow editDiscountsWindow;
   // public PredictionWindow predictionWindow;
   // public BudgetWindow budgetWindow;

    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 20, 20));

        Button reportButton = new Button("Просмотр отчетности");
        reportButton.setMinWidth(200);

        Button editVisitorsButton = new Button("Редактировать посетителей");
        editVisitorsButton.setMinWidth(200);

        Button editAttractionsButton = new Button("Редактировать аттракционы");
        editAttractionsButton.setMinWidth(200);

        Button editRestPlacesButton = new Button("Редактирование мест отдыха");
        editRestPlacesButton.setMinWidth(200);

        Button editDiscountsButton = new Button("Редактирование скидок");
        editDiscountsButton.setMinWidth(200);

        Button predictionsButton = new Button("Прогнозы");
        predictionsButton.setMinWidth(200);

        Button exitButton = new Button("Выход");
        exitButton.setMinWidth(200);

        VBox buttons = new VBox(reportButton, editVisitorsButton, editAttractionsButton, editRestPlacesButton,
                editDiscountsButton, predictionsButton, exitButton);

        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Администратор");
        primaryStage.setScene(new Scene(root, 240, 280));
        primaryStage.show();
    }

    public void editDiscounts() {

    }

    public void editAttractions() {

    }

    public void editRestPlaces() {

    }

    public void predictions() {

    }

    public void report() {

    }

    public void exit() {

    }

    @Override
    public void start(Stage stage) throws Exception {
        show();
    }
}
