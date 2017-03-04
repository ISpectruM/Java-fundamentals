package C_Inheritance.C_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] studentTokens = reader.readLine().trim().split("\\s+");
        String studentFirstName = studentTokens[0];
        String studentLastName = studentTokens[1];
        String facultyNumber = studentTokens[2];

        String[] workerTokens = reader.readLine().trim().split("\\s+");
        String workerFirstName = workerTokens[0];
        String workerLastName = workerTokens[1];
        double weekSalary = Double.parseDouble(workerTokens[2]);
        double workHours = Double.parseDouble(workerTokens[3]);

        try {
            Student student = new Student(studentFirstName,studentLastName,facultyNumber);
            Worker worker = new Worker(workerFirstName,workerLastName,weekSalary,workHours);
            System.out.println(student.toString());
            System.out.println(worker.toString());
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
