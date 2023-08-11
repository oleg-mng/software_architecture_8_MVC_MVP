package org.inwork;

import org.inwork.Controller.Controller;
import org.inwork.Model.Domen.Student;
import org.inwork.Model.Model;
import org.inwork.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Denzel", 43, 1);
        Student student2 = new Student("Christian", 35, 2);
        Student student3 = new Student("Gerard", 68, 3);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Model model = new Model(students);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.update();

        view.setControl(controller);
        view.remoteCallbackController();

    }
}