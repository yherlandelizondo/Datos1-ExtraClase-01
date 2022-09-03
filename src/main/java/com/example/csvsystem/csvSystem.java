package com.example.csvsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * clase principal, la cual hereda de la clase application sus comportamientos y atributos
 * @author Yherland Elizondo Cordero
 */
public class csvSystem extends Application {
    /**
     * Metodo heredado de la clase application, encargado de dar inicio a la interfaz grafica, ademas de configurar ciertos
     * parametros de esta. Ademas se presenta polimorfismo, dado que se hace la modificacion de un metodo heredado de una
     * clase superior, lo cual se ve representado con la soobreescritura de un metodo
     * @param stage *
     * @throws IOException *
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(csvSystem.class.getResource("csvSystem-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("scvSystem");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * clase pirncipal, permite la ejecucion del programa
     * @param args *
     */
    public static void main(String[] args) {
        launch();
    }
}