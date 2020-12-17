package Model;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Injector injector = new Injector();
        injector.createParkManagement();
        injector.createUserManagement();
        injector.createUI();

       // Parent root = new Parent(){};
       // primaryStage.setTitle("Hello World");
       // primaryStage.setScene(new Scene(root, 300, 275));
       // primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
