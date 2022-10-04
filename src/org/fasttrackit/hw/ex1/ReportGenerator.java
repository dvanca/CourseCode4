package org.fasttrackit.hw.ex1;

import org.fasttrackit.hw.ex1.StudentGrade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    List<StudentGrade> grades;

    public ReportGenerator(List<StudentGrade> grades){
        this.grades = grades;
    }

    public void generateReport() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"));
        String s = String.valueOf(getMaxGrade());
        writer.write(s);
        writer.newLine();
        String s2 = String.valueOf(getAverageGrade());
        writer.write("Average mark is " + s2);
        writer.newLine();
        String s3 = String.valueOf(getWorstGrade());
        writer.write(s3);
        writer.close();

    }
    public String getMaxGrade(){
        StudentGrade studentWithMaxGrade = null;
        int maxgrade = 1;
        for(StudentGrade student : grades){
            if(student.getGrade()>maxgrade){
                maxgrade = student.getGrade();
                studentWithMaxGrade = student;
            }
        }
        return studentWithMaxGrade.getName() +" "+ maxgrade;
    }

    public Double getAverageGrade(){
        double averagegrade=0;
        int i=0;
        for(StudentGrade student : grades){
            averagegrade = averagegrade + student.getGrade();
        }
        averagegrade = averagegrade / grades.size();
        return averagegrade;
    }

    public String getWorstGrade(){
        StudentGrade worstGradeStudent = null;
        int worstGrade=100;
        for(StudentGrade student : grades){
            if( worstGrade > student.getGrade()){
                worstGrade = student.getGrade();
                worstGradeStudent = student;
            }
        }
        return worstGradeStudent.getName() + " " + worstGrade;
    }

    @Override
    public String toString() {
        return "ReportGenerator{" +
                "grades=" + grades +
                '}';
    }
}


