package org.example;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Employee(int id,
                       String name,
                       String college) {
    // this code is Group by College Name,the code implement in main method
}

public class Day01 {
    public static void main(String[] args) {
        List<Employee> employeeList=List.of(
                new Employee(101,"sarat","KIIT"),
                new Employee(102,"raj","IIT"),
                new Employee(103,"happy","NIT"),
                new Employee(104,"rohit","KIIT"),
                new Employee(105,"sumanta","NIT"),
                new Employee(106,"pratyush","IIT")
                );
        // this implement by GroupingBy function
        Map<String,List<Employee>> collect =
                employeeList.stream().collect(Collectors.groupingBy(emp -> emp.college()));
        collect.forEach((college,emp)->{
            System.out.println("clg-"+college);
            emp.forEach(e -> System.out.println("id-"+e.id()+" -- "+e.name()));
            System.out.println("----------------------------");
        });

    }

}
