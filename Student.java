public class Student {

    private String name;

    private String studentNumber;



    public Student(String name, String studentNumber) {

        this.name = name;

        this.studentNumber = studentNumber;

    }

    

    public String getName() {

        return this.name;

    }

    

    public String getStudentNumber() {

        return this.studentNumber;

    }

    

    public String toString() {

        return this.name + ": (" + this.studentNumber + ")";

    }

}

// =========== Here's the Main.java ============
// This one contains all the magic! ;)

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true) {
            System.out.print("name: ");
            String name = Reader.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
            System.out.print("studentnumber: ");
            String studentnumber = Reader.nextLine();
            list.add(new Student(name,studentnumber));  // Builds an ArrayList of objects
            }
        }

        for (Student stu : list) {
            System.out.println(stu);  // Output the content of the ArrayList
        }

        System.out.print("Give search term:");
        String search = Reader.nextLine();	// A rudimentary search engine
        
        for (Student searched : list) {
            if (searched.getName().contains(search)) {   // Checks each object's name
                System.out.print(searched);	 	 // and sees if it contains the search term
            }
        }

    }
}