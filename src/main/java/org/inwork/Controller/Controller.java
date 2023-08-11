package org.inwork.Controller;

import org.inwork.Model.Domen.Student;
import org.inwork.Model.Model;
import org.inwork.View.View;

import java.util.List;

public class Controller {
    private Model model;
    private View view;

    private List<Student> students;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private boolean test(List<Student> stud){
        if(stud.size() > 0){
            return true;
        }
        else return false;

    }

    public void update() {
        //MVC
        view.printAllStudent(model.getAllStudents());


        //MVP
        students = model.getAllStudents();
        if (test(students)){
            view.printAllStudent(students);
        }
        else {
            System.out.println("Модель недоступна");
        }

    }
}
