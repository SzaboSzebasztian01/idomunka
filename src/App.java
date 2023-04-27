/*
 * File: App.java
 * Author: Szabó Szebasztián
 * Copyright: 2023, Szebi:)
 * Group: SZOFT-I-1-N
 * Date: 2023-04-27
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

import controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainView;
public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        MainController mainController = new MainController();
        MainView mainPanel = mainController.getMainPanel();

        Scene scene = new Scene(mainPanel, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
    
}