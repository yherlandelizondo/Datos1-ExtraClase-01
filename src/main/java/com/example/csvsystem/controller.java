package com.example.csvsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

public class controller implements Initializable {

    FileChooser fileChooser = new FileChooser();

    public TableView<Student> infoTable;
    public TableColumn<Student, Double> studentID;
    public TableColumn<Student, String> studentName;
    public TableColumn<Student, String> studentEmail;
    public TableColumn<Student, Double> studentPhone;
    public TableColumn<Student, String> studentNickname;
    public TableColumn<Student, String> studentType;
    public TableColumn<Student, Float> avrgExamNote;
    public TableColumn<Student, Float> avrgQuizNote;
    public TableColumn<Student, Float> avrgHomeworkNote;
    public TableColumn<Student, Float> project1;
    public TableColumn<Student, Float> project2;
    public TableColumn<Student, Float> project3;
    public TableColumn<Student, Float> avrgProjectNote;
    public TableColumn<Student, Float> avrgEQTNote;
    public TableColumn<Student, Float> finalNote;


    @FXML
    private Button fileSelectionBtn;


    @FXML
    void getCsvFile(ActionEvent event) {
        File scv = fileChooser.showOpenDialog(new Stage());

        try {
            Scanner scanner = new Scanner(scv);

            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();

                if (data.startsWith("Carne")){
                    continue;
                }
                else{
                    Array studentsInfo[];
                    String parts[] = data.split(";");
                    new Student(Double.parseDouble(parts[0]),parts[1],parts[2],Double.parseDouble(parts[3]),parts[4],parts[5],Float.parseFloat(parts[6]),Float.parseFloat(parts[7]),Float.parseFloat(parts[8]),Float.parseFloat(parts[9]),Float.parseFloat(parts[10]),Float.parseFloat(parts[11]),Float.parseFloat(parts[11]),Float.parseFloat(parts[11]),Float.parseFloat(parts[11]));

                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File(".\\scv"));

        studentID.setCellValueFactory(new PropertyValueFactory<>("StudentId"));
        studentName.setCellValueFactory(new PropertyValueFactory<>("StudentName"));
        studentEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        studentPhone.setCellValueFactory(new PropertyValueFactory<>("StudentPhone"));
        studentNickname.setCellValueFactory(new PropertyValueFactory<>("StudentNickname"));
        studentType.setCellValueFactory(new PropertyValueFactory<>("StudentType"));
        avrgExamNote.setCellValueFactory(new PropertyValueFactory<>("ExamProm"));
        avrgQuizNote.setCellValueFactory(new PropertyValueFactory<>("QuizProm"));
        avrgHomeworkNote.setCellValueFactory(new PropertyValueFactory<>(""));
        project1.setCellValueFactory(new PropertyValueFactory<>("Project1"));
        project2.setCellValueFactory(new PropertyValueFactory<>("Project2"));
        project3.setCellValueFactory(new PropertyValueFactory<>("Project3"));
        avrgProjectNote.setCellValueFactory(new PropertyValueFactory<>("Project3"));
        avrgEQTNote.setCellValueFactory(new PropertyValueFactory<>("Project3"));
        finalNote.setCellValueFactory(new PropertyValueFactory<>("Project3"));
    }
}
