package com.citi.java8qa;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpSalDeptWise {
    public static void main(String[] args) {
        List<Employee> employeeList = Stream.of(
                new Employee(10, "shorav", "DEV", 50000),
                new Employee(10, "sharma", "DEV", 60000),
                new Employee(10, "sk", "QA", 70000),
                new Employee(10, "saurav", "QA", 80000),
                new Employee(10, "shaily", "devOps", 90000)).collect(Collectors.toList());

        Comparator<Employee> compareBySal = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> map = employeeList.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDept,
                                Collectors.reducing(BinaryOperator.maxBy(compareBySal))
                        )
                );

        System.out.println(map);
    }
}
