package org.inwork.Model.Domen;

public class Student extends Person implements Comparable<Student>{
    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id + "name=" + super.getName() + ", age=" + super.getAge()+
                '}';

    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
