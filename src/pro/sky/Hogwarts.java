package pro.sky;

import pro.sky.houses.Student;

import java.util.ArrayList;

public class Hogwarts {
    private ArrayList<Student> students = new ArrayList<>();

    public void add(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "students=\n" + students +
                '}';
    }
}
