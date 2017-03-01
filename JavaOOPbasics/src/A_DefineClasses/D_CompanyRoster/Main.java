package A_DefineClasses.D_CompanyRoster;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        LinkedHashMap<String, List<Employee>> departments = new LinkedHashMap<>();

        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = reader.readLine().split(" ");

            String name = input[0];
            Double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = new Employee(name,salary,position,department);

            if (input.length == 5){
                if(Character.isDigit(input[4].charAt(0))){
                    int age = Integer.parseInt(input[4]);
                    employee.setAge(age);
                } else{
                    String email = input[4];
                    employee.setEmail(email);
                }
            }else if(input.length==6){
                String email = input[4];
                employee.setEmail(email);
                int age = Integer.parseInt(input[5]);
                employee.setAge(age);
            }
            if (!departments.containsKey(department)){

                departments.put(department,new ArrayList<>());
                departments.get(department).add(employee);
            }else {
                departments.get(department).add(employee);
            }
        }

        Double minSalary=Double.MIN_VALUE;
        String maxDepartment = "";
        for (String department : departments.keySet()) {
            Double totalSalaries = 0d;
            List<Employee> employees = departments.get(department);

            for (Employee employee : employees) {
                totalSalaries += employee.getSalary();
            }
            Double averageSalary = totalSalaries/employees.size();
            if (averageSalary > minSalary){
                minSalary = averageSalary;
                maxDepartment = department;
            }
        }

        System.out.printf("Highest Average Salary: %1$s%n", maxDepartment );
        departments.get(maxDepartment).sort(Comparator.comparing(Employee::getSalary).reversed());
        departments.get(maxDepartment).forEach(e ->
                System.out.printf("%1$s %2$.2f %3$s %4$d%n",e.getName(),e.getSalary(),e.getEmail(),e.getAge()));
    }
}

