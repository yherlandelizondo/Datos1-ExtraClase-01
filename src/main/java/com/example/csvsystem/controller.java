package com.example.csvsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class controller implements Initializable {

    FileChooser fileChooser = new FileChooser();

    @FXML
    private Button fileSelectionBtn;

    @FXML
    private TableView<?> infoTable;

    @FXML
    void getInfo(MouseEvent event) {
        File scv = fileChooser.showOpenDialog(new Stage());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File("C:\\Users\\Yherland\\Documents\\GitHub\\csvSystem\\scv"));
    }
}
