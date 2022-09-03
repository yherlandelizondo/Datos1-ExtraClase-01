package com.example.csvsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.lang.Math;

import java.util.ArrayList;

/**
 * clase que permitira el almacenaje de diferentes objetos, especificamente estudiantes
 * @author Yherland Elizondo Cordero
 */
public class studentList {
    private ObservableList<Student> students;

    /**
     * metodo que se encarga de almacenar los estudiantes en un array, ademas se puede evidencia la encapsulacion, dado que
     * se almacenan estudiantes, sin embargo se ocultan sus atributos y comportamientos.
     */
    public studentList() {
        this.students = FXCollections.observableArrayList();
    }

    /**
     * clase que permite anadir un estudiante a la clase Student, reciviendo todos los parametros necesarios, ademas en cierto
     * punto se puede represetar la abstaccion, dado que este objeto no representa con precision a un estudiante en la vida real
     * @param studentID Carnet del estudiante
     * @param studentName Nombre completo del estudiante
     * @param email Correo electronico del estudiante
     * @param phone Telefono del estudiante
     * @param nickname Apodo asociado a cada estudiante
     * @param type Tipo de estudiante, dependiendo de su tipo requerira un tratamiento diferente de los datos
     * @param avrExam Nota promedio de examenes(Suministrada por el usuario)
     * @param avrQuiz Nota promedio de quices(Suministrada por el usuario)
     * @param avrHomeWorks Nota promedio de tareas(Suministrada por el usuario)
     * @param project1 Nota del primer proyecto
     * @param project2 Nota del segundo proyecto
     * @param project3 Nota del tercer proyecto
     */
    public void addStudent(
            String studentID, String studentName
            , String email, String phone
            , String nickname, String type
            , float avrExam, float avrQuiz
            , float avrHomeWorks, float project1
            , float project2, float project3){

        float[] finals= this.calculateFinals(type, avrExam, avrQuiz, avrHomeWorks, project1, project2, project3);
        /**
         * instanciamiento a la clase Student
         */
        this.students.add(
                new Student(studentID, studentName
                , email, phone
                , nickname, type
                , avrExam, avrQuiz
                , avrHomeWorks,project1
                , project2, project3
                , finals[0], finals[1], finals[2]));
    }

    /**
     * metodo el cual permite calcular las notas y promedios finales dependiendo del tipo de estudiante con el cual se
     * esta tratando, ademas se da la sobrecarga, dado que con el mismo metodo se pueden realizar difentes acciones
     * dependiendo de los parametros recibidos, en este caso el tipo de estudiante.
     * @param type Tipo de estudiante, dependiendo de su tipo requerira un tratamiento diferente de los datos
     * @param avrExam Nota promedio de examenes(Suministrada por el usuario)
     * @param avrQuiz Nota promedio de quices(Suministrada por el usuario)
     * @param avrHomeWorks Nota promedio de tareas(Suministrada por el usuario)
     * @param project1 Nota del primer proyecto
     * @param project2 Nota del segundo proyecto
     * @param project3 Nota del tercer proyecto
     * @return array con las notas finales almacenadas
     */
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

    /**
     * metodo que obtiene la lista de estudiantes contenida
     * @return estudiantes contenidos
     */
    public ObservableList<Student> getStudents() {
        return students;
    }
}
