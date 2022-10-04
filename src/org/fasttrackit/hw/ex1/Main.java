package org.fasttrackit.hw.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("files", "grades.txt"));
        List<StudentGrade> grades = new ArrayList<>();
        for(String line : lines){
            grades.add(readStudentGradeFromLine(line));
        }
        System.out.println(grades);

        Classroom classroom = new Classroom(grades);
        System.out.println("All grades for Computer Science - " + classroom.getGradesForDiscipline("Computer Science"));
        System.out.println("Grades for Gasparo Sava - " + classroom.getGradesForStudent("Gasparo Sava"));
        System.out.println(classroom.getMaxGrade("Mathematics"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("Mathematics"));
        System.out.println(classroom.getWorstGrade("Computer Science"));

        ReportGenerator raport = new ReportGenerator(grades);
        raport.generateReport();

    }
    private static StudentGrade readStudentGradeFromLine(String line) {
        String[] components = line.split("\\|");
        return new StudentGrade(components[0], components[1], Integer.parseInt(components[2]));
    }
}
