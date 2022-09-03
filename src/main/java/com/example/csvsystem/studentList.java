package com.example.csvsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.lang.Math;

import java.util.ArrayList;

public class studentList {
    private ObservableList<Student> students;

    public studentList() {
        this.students = FXCollections.observableArrayList();
    }

    public void addStudent(
            String studentID, String studentName
            , String email, String phone
            , String nickname, String type
            , float avrExam, float avrQuiz
            , float avrHomeWorks, float project1
            , float project2, float project3){

        float[] finals= this.calculateFinals(type, avrExam, avrQuiz, avrHomeWorks, project1, project2, project3);

        this.students.add(
                new Student(studentID, studentName
                , email, phone
                , nickname, type
                , avrExam, avrQuiz
                , avrHomeWorks,project1
                , project2, project3
                , finals[0], finals[1], finals[2]));
    }
    private float[] calculateFinals(
        String type, float avrExam
        , float avrQuiz, float avrHomeWorks
        , float project1, float project2, float project3 ){

        float avrProjects, avrEQT, finalNote;
        float[] finals = new float[3];

        if(type.equals("A")){
            avrProjects = 0;
            avrEQT = ((avrExam + avrQuiz + avrHomeWorks)/3);
            finalNote = (((project1 + project2 + project3)/3) + avrExam + avrHomeWorks + avrQuiz)/4;
            finals[0] = Math.round(avrProjects);
            finals[1] = Math.round(avrEQT);
            finals[2] = Math.round(finalNote);

        } else if (type.equals("B")){
            avrProjects = ((project1 + project2 + project3)/3);
            avrEQT = 0;
            finalNote = (avrProjects + avrExam + avrHomeWorks + avrQuiz)/4;
            finals[0] = Math.round(avrProjects);
            finals[1] = Math.round(avrEQT);
            finals[2] = Math.round(finalNote);
        }

        return finals;
    }

    public ObservableList<Student> getStudents() {
        return students;
    }
}
