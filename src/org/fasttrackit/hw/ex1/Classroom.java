package org.fasttrackit.hw.ex1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<StudentGrade> grades;

    public Classroom(List<StudentGrade> grades){
            this.grades = new ArrayList<>(grades);

    }


   public List<Integer> getGradesForDiscipline(String discipline) {
      List<Integer> gradesList = new ArrayList<>();
      for (StudentGrade student : grades) {
         if (student.getDiscipline().equals(discipline)) {
           gradesList.add(student.getGrade());
            }
        }
        return gradesList;
    }

    public List<Integer> getGradesForStudent(String student){
        List<Integer> studentGradesList = new ArrayList<>();
        for(StudentGrade students : grades){
            if(students.getName().equals(student)){
                studentGradesList.add(students.getGrade());
            }
        }
        return studentGradesList;
    }

    public StudentGrade getMaxGrade(String discipline){
        StudentGrade studentMaxGrade = null;
        int maxgrade = 1;
        for(StudentGrade student : grades){
            if( student.getDiscipline().equals(discipline) && student.getGrade()> maxgrade){
                maxgrade = student.getGrade();
                studentMaxGrade = student;
            }
        }
        return studentMaxGrade;
    }

    public StudentGrade getMaxGrade(){
        StudentGrade studentWithMaxGrade = null;
        int maxgrade = 1;
        for(StudentGrade student : grades){
            if(student.getGrade()>maxgrade){
                maxgrade = student.getGrade();
                studentWithMaxGrade = student;
            }
        }
        return studentWithMaxGrade;
    }

    public Double getAverageGrade(String discipline){
        double averagegrade=0;
        int i=0;
        for(StudentGrade student : grades){
            if(student.getDiscipline().equals(discipline)){
                i=i+1;
                averagegrade = averagegrade + student.getGrade();
            }
        }
        averagegrade = averagegrade / i;
        return averagegrade;
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

    public StudentGrade getWorstGrade(String discipline){
        StudentGrade worstGradeStudent = null;
        int worstGrade=100;
        for(StudentGrade student : grades){
            if(student.getDiscipline().equals(discipline) && worstGrade > student.getGrade()){
                worstGrade = student.getGrade();
                worstGradeStudent = student;
            }
        }
        return worstGradeStudent;
    }



    @Override
    public String toString() {
        return "org.fasttrackit.hw.ex1.Classroom{" +
                "grades=" + grades +
                '}';
    }
}
