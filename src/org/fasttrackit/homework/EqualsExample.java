package org.fasttrackit.homework;

import java.util.HashSet;
import java.util.Set;

public class EqualsExample {
    public static void main(String[] args) {
        //read from file first time
        StudentGrade s1 = new StudentGrade("Alex", "CS",10);
        //read from file 2nd time
        StudentGrade s2 = new StudentGrade("Alex", "CS",10);
        StudentGrade s3 = s1;
        System.out.println(s1.equals(s2)); // false before equals;true after equals
        System.out.println(s1.equals(s3));//true

        Set<StudentGrade> grades = new HashSet<>();
        grades.add(s1);
        grades.add(s2);
        System.out.println(grades);


    }
}
