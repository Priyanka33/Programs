package college;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

public class Department {

    String departmentname;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Student> createStudent() throws IOException, ParseException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            System.out.println("enter Student name");
            student.studentname = in.readLine();
            System.out.println("Enter DoB");
            student.dob = Integer.parseInt(in.readLine());
            System.out.println("enter Email");
            student.email = in.readLine();
            students.add(student);
        }
        return students;

    }

}
