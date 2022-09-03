package com.example.csvsystem;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * La clase permitira almacenar todos los datos brindados por el usuario en lo que a estudiantes se refiere
 * @author Yherland Elizondo Cordero
 */
public class Student {
    /**
     * atributos de la clase estudiante, tales como sus carnets, nombres y demas
     */
    private SimpleStringProperty studentID;
    private SimpleStringProperty studentName;
    private SimpleStringProperty studentEmail;
    private SimpleStringProperty studentPhone;
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

    /**
     * Esta clase representa el constructor, el cual se encarga de recibir los datos e inicializarlos dentro del objeto.
     * @param studentID Carnet del estudiante
     * @param studentName Nombre completo del estudiante
     * @param studentEmail Correo electronico del estudiante
     * @param studentPhone Telefono del estudiante
     * @param studentNickname Apodo asociado a cada estudiante
     * @param studentType Tipo de estudiante, dependiendo de su tipo requerira un tratamiento diferente de los datos
     * @param avrgExamNote Nota promedio de examenes(Suministrada por el usuario)
     * @param avrgQuizNote Nota promedio de quices(Suministrada por el usuario)
     * @param avrgHomeworkNote Nota promedio de tareas(Suministrada por el usuario)
     * @param project1 Nota del primer proyecto
     * @param project2 Nota del segundo proyecto
     * @param project3 nota del tercer proyecto
     * @param avrgProjectNote nota promedio del proyecto (calculada segun el tipo de estudiante)
     * @param avrgEQTNote nota promedio de examenes, quices y tareas(calculada segun el tipo de estudiante)
     * @param finalNote nota final de cada estudiante
     */
    public Student(
        String studentID, String studentName
        , String studentEmail, String studentPhone
        , String studentNickname, String studentType
        , float avrgExamNote, float avrgQuizNote
        , float avrgHomeworkNote, float project1
        , float project2, float project3
        , float avrgProjectNote, float avrgEQTNote, float finalNote) {

            this.studentID = new SimpleStringProperty(studentID);
            this.studentName = new SimpleStringProperty(studentName);
            this.studentEmail = new SimpleStringProperty(studentEmail);
            this.studentPhone = new SimpleStringProperty(studentPhone);
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

    /**
     * metodo encargado de devolver el carnet del estudiante
     * @return String que contiene el carnet del estudiante
     */
    public String getStudentID() {
        return studentID.get();
    }

    /**
     * metodo encargado de establecer un valor en el carnet de un estudiante
     * @param studentID String ingresado por el usuario el cual contiene el carnet del mismo
     */
    public void setStudentID(String studentID) {
        this.studentID = new SimpleStringProperty(studentID);
    }

    /**
     * metodo encargado de obtener el nombre del estudiante
     * @return String que contine el nombre completo del estudiante
     */
    public String getStudentName() {
        return studentName.get();
    }

    /**
     * metodo encargado de establecer el nombre completo del estudiante
     * @param studentName String ingresado por el usuario el cual corresponde al nombre completo del mismo
     */
    public void setStudentName(String studentName) {
        this.studentName = new SimpleStringProperty(studentName);
    }

    /**
     * metodo encargado de obtener el email de un estudiante
     * @return String que contiene el correo electronico del estudiante
     */
    public String getStudentEmail() {
        return studentEmail.get();
    }

    /**
     * metodo encargado de establecer el correo electronico de un estudiante
     * @param studentEmail String ingresado por el usuario que contiene el correo electronico de un estudiante
     */
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = new SimpleStringProperty(studentEmail);
    }

    /**
     * metodo encargado de obtener el telefono de un estudiante
     * @return String que contiene el telefono del estudiante
     */
    public String getStudentPhone() {
        return studentPhone.get();
    }

    /**
     * metodo encargado de establecer el telefono de un estudiante
     * @param studentPhone string que contiene el numero de telefono de un estudiante
     */
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = new SimpleStringProperty(studentPhone);
    }

    /**
     * metodo encargado de obtener el apodo de un estudiante
     * @return String que contiene el apodo de un estudiante
     */
    public String getStudentNickname() {
        return studentNickname.get();
    }

    /**
     * metodo encargado de establecer el apodo de un estudiante
     * @param studentNickname String ingresado por el usuario el cual contiene el apodo de un estudiante
     */
    public void setStudentNickname(String studentNickname) {
        this.studentNickname = new SimpleStringProperty(studentNickname);
    }

    /**
     *metodo encargado de obtener el tipo de un estudiante
     * @return string que contiene el tipo de un estudiante
     */
    public String getStudentType() {
        return studentType.get();
    }

    /**
     *metodo encargado de establecer el tipo a un estudiante
     * @param studentType string ingresado por el usuario que contine el tipo de estudiante
     */
    public void setStudentType(String studentType) {
        this.studentType = new SimpleStringProperty(studentType);
    }

    /**
     *metodo encargado de obtener el promedio de examenes de un estudiate
     * @return valor flotante el cual contiene el promedio de las notas de examen
     */
    public float getAvrgExamNote() {
        return avrgExamNote.get();
    }

    /**
     *metodo encargado de establecer el promedio de las notas en los examenes
     * @param examProm valor flotante ingresado por el usuario el cual corresponde al promedio de examenes
     */
    public void setAvrgExamNote(float examProm) {
        this.avrgExamNote = new SimpleFloatProperty(examProm);
    }

    /**
     *metodo encargado de obtener el promedio de quices
     * @return valor flotante el cual contiene el promedio de las notas de quices
     */
    public float getAvrgQuizNote() {
        return avrgQuizNote.get();
    }

    /**
     *metodo encargado de establecer el promedio de los quices
     * @param quizProm valor ingresado por el usuario el cual corresponde al promedio de quices
     */
    public void setAvrgQuizNote(float quizProm) {
        this.avrgQuizNote = new SimpleFloatProperty(quizProm);
    }

    /**
     *metodo encargado de obtener el promedio de las tareas
     * @return valor flotante el cual contiene el promedio de las notas de tareas
     */
    public float getAvrHomeWorkNote(){
        return avrgHomeworkNote.get();
    }

    /**
     *metodo encargado de establecer el promedio de las tareas
     * @param avrgHomeworkNote valor flotante ingresado por el usario el cual corresponde al promedio de las tareas
     */
    public void setAvrgHomeworkNote(float avrgHomeworkNote){
        this.avrgHomeworkNote = new SimpleFloatProperty(avrgHomeworkNote);
    }

    /**
     *metodo encargado de obtener la nota del proyecto #1
     * @return valor flotante que corresponde a la nota del primer proyecto
     */
    public float getProject1() {
        return project1.get();
    }

    /**
     *metodo encargado de establecer la nota del proyecto numero 1
     * @param project1 valor ingresado por el usuario el cual corresponde a la nota del primer proyecto
     */
    public void setProject1(float project1) {
        this.project1 = new SimpleFloatProperty(project1);
    }

    /**
     *metodo encargado de obtener la nota del proyecto #2
     * @return
     */
    public float getProject2() {
        return project2.get();
    }

    /**
     *metodo encargado de establecer la nota del proyecto numero 2
     * @param project2 valor ingresado por el usuario el cual corresponde a la nota del segundo proyecto
     */
    public void setProject2(float project2) {
        this.project2 = new SimpleFloatProperty(project2);
    }

    /**
     *metodo encargado de obtener la nota del proyecto #3
     * @return
     */
    public float getProject3() {
        return project3.get();
    }

    /**
     *metodo encargado de establecer la nota del proyecto numero 3
     * @param project3 valor ingresado por el usuario el cual corresponde a la nota del tercer proyecto
     */
    public void setProject3(float project3) {
        this.project3 = new SimpleFloatProperty(project3);
    }

    /**
     *metodo encargado de obtener la nota promedio de los proyectos
     * @return valor flotante el cual corresponde al promedio de los proyectos
     */
    public float getAvrgProjectNote() {
        return avrgProjectNote.get();
    }

    /**
     *metodo encargado de establecer la nota promedio de los proyectos
     * @param avrgProjectNote valor flotante ingresado por el usuario el cual corresponde al promedio de los proyectos
     */
    public void setAvrgProjectNote(float avrgProjectNote) {
        this.avrgProjectNote = new SimpleFloatProperty(avrgProjectNote);
    }

    /**
     *metodo encargado de obtener el promedio de examenes, quices y tareas
     * @return valor flotante el cual corresponde a la nota promedio de examenes, quices y tareas
     */
    public float getAvrgEQTNote() {
        return avrgEQTNote.get();
    }

    /**
     *metodo encargado de establecer la nota promedio de examenes, quices y tareas
     * @param avrgEQTNote valor flotante ingresado por el usuario el cual corresponde a la nota promedio de examnenes, quices y tareas
     */
    public void setAvrgEQTNote(float avrgEQTNote) {
        this.avrgEQTNote = new SimpleFloatProperty(avrgEQTNote);
    }

    /**
     *metodo encargado de obtener la nota final
     * @return valor flotante que corresponde a la nota final de un estudiante
     */
    public float getFinalNote() {
        return finalNote.get();
    }

    /**
     *metodo encargado de establecer la nota final de un estudiante
     * @param finalNote valor ingresado por el usuario el cual corresponde a la nota final
     */
    public void setFinalNote(float finalNote) {
        this.finalNote = new SimpleFloatProperty(finalNote);
    }
}
