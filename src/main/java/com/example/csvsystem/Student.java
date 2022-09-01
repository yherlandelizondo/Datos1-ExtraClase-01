package com.example.csvsystem;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student {
    private SimpleDoubleProperty studentID;
    private SimpleStringProperty studentName;
    private SimpleStringProperty studentEmail;
    private SimpleDoubleProperty studentPhone;
    private SimpleStringProperty studentNickname;
    private SimpleStringProperty studentType;
    private SimpleFloatProperty avrgExamNote;
    private SimpleFloatProperty avrgQuizNote;
    private SimpleFloatProperty avrgHomeworkNote;
    private SimpleFloatProperty project1;
    private SimpleFloatProperty project2;
    private SimpleFloatProperty project3;
    private SimpleFloatProperty avrgProjectNote;
    private SimpleFloatProperty avrgEQTNote;
    private SimpleFloatProperty finalNote;

    public Student(double studentID, String studentName, String studentEmail, double studentPhone, String studentNickname, String studentType, float avrgExamNote, float avrgQuizNote, float avrgHomeworkNote, float project1, float project2, float project3, float avrgProjectNote, float avrgEQTNote, float finalNote) {
        this.studentID = new SimpleDoubleProperty(studentID);
        this.studentName = new SimpleStringProperty(studentName);
        this.studentEmail = new SimpleStringProperty(studentEmail);
        this.studentPhone = new SimpleDoubleProperty(studentPhone);
        this.studentNickname = new SimpleStringProperty(studentNickname);
        this.studentType = new SimpleStringProperty(studentType);
        this.avrgExamNote = new SimpleFloatProperty(avrgExamNote);
        this.avrgQuizNote = new SimpleFloatProperty(avrgQuizNote);
        this.avrgHomeworkNote = new SimpleFloatProperty(avrgHomeworkNote);
        this.project1 = new SimpleFloatProperty(project1);
        this.project2 = new SimpleFloatProperty(project2);
        this.project3 = new SimpleFloatProperty(project3);
        this.avrgProjectNote = new SimpleFloatProperty(avrgProjectNote);
        this.avrgEQTNote = new SimpleFloatProperty(avrgEQTNote);
        this.finalNote = new SimpleFloatProperty(finalNote);
    }

    public double getStudentID() {
        return studentID.get();
    }

    public void setStudentID(double studentID) {
        this.studentID = new SimpleDoubleProperty(studentID);
    }

    public String getStudentName() {
        return studentName.get();
    }

    public void setStudentName(String studentName) {
        this.studentName = new SimpleStringProperty(studentName);
    }

    public String getStudentEmail() {
        return studentEmail.get();
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = new SimpleStringProperty(studentEmail);
    }

    public double getStudentPhone() {
        return studentPhone.get();
    }

    public void setStudentPhone(double studentPhone) {
        this.studentPhone = new SimpleDoubleProperty(studentPhone);
    }

    public String getStudentNickname() {
        return studentNickname.get();
    }

    public void setStudentNickname(String studentNickname) {
        this.studentNickname = new SimpleStringProperty(studentNickname);
    }

    public String getStudentType() {
        return studentType.get();
    }

    public void setStudentType(String studentType) {
        this.studentType = new SimpleStringProperty(studentType);
    }

    public float getAvrgExamNote() {
        return avrgExamNote.get();
    }

    public void setAvrgExamNote(float examProm) {
        this.avrgExamNote = new SimpleFloatProperty(examProm);
    }

    public float getAvrgQuizNote() {
        return avrgQuizNote.get();
    }

    public void setAvrgQuizNote(float quizProm) {
        this.avrgQuizNote = new SimpleFloatProperty(quizProm);
    }

    public float getAvrHomework(){
        return avrgHomeworkNote.get();
    }

    public void setAvrgHomeworkNote(float avrgHomeworkNote){
        this.avrgHomeworkNote = new SimpleFloatProperty(avrgHomeworkNote);
    }

    public float getProject1() {
        return project1.get();
    }

    public void setProject1(float project1) {
        this.project1 = new SimpleFloatProperty(project1);
    }

    public float getProject2() {
        return project2.get();
    }

    public void setProject2(float project2) {
        this.project2 = new SimpleFloatProperty(project2);
    }

    public float getProject3() {
        return project3.get();
    }

    public void setProject3(float project3) {
        this.project3 = new SimpleFloatProperty(project3);
    }

    public float getAvrgProjectNote() {
        return avrgProjectNote.get();
    }

    public void setAvrgProjectNote(float avrgProjectNote) {
        this.avrgProjectNote = new SimpleFloatProperty(avrgProjectNote);
    }

    public float getAvrgEQTNote() {
        return avrgEQTNote.get();
    }

    public void setAvrgEQTNote(float avrgEQTNote) {
        this.avrgEQTNote = new SimpleFloatProperty(avrgEQTNote);
    }

    public float getFinalNote() {
        return finalNote.get();
    }

    public void setFinalNote(float finalNote) {
        this.finalNote = new SimpleFloatProperty(finalNote);
    }
}
