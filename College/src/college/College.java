package college;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

class College {

    String collegename;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Student> Students = new ArrayList<>();

    public ArrayList<Department> createDepartment() throws IOException, ParseException {
        boolean flag = false;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            Department department = new Department();
            while (flag == false) {
                System.out.println("enter Department");

                department.departmentname = in.readLine();
                {
                    if (department.departmentname.length() <= 50) {
                        departments.add(department);
                        Students = department.createStudent();
                    } else {
                        {

                            System.out.println("invalid Enter again");

                        }
                    }
                }
            }

        }
        return departments;
    }

    public static void main(String as[]) throws IOException, ParseException {
        boolean flag = false;
        ArrayList<Department> departments = new ArrayList<>();
        College college = new College();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter College name");
        while (flag == false) {
            college.collegename = in.readLine();

            if (college.collegename.length() <= 50) {
                Department department = new Department();
                departments = college.createDepartment();

            } else {

                System.out.println("enter valid Collegename");
            }
        }

    }
}
