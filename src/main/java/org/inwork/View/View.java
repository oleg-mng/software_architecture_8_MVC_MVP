package org.inwork.View;

import org.inwork.Controller.Controller;
import org.inwork.Model.Domen.Student;

import java.util.List;

public class View {
    private Controller control;

    public void setControl(Controller control){
        this.control = control;
    }
    public void remoteCallbackController(){
        control.update();
    }
    public void printAllStudent(List<Student> students) {
        System.out.println("______Список студентов________");
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
