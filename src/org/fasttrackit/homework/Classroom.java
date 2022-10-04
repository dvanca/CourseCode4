package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private final List<StudentGrade> grades;

    public Classroom(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade studentGrade : grades) {
            if (discipline == null || studentGrade.getDiscipline().equals(discipline)) {
                result.add(studentGrade.getGrade());
            }
        }
        return result;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGrade = null;
        for (StudentGrade grade : grades) {
            if ((discipline == null) || (grade.getDiscipline().equals(discipline)) && (maxGrade == null || grade.getGrade() > maxGrade.getGrade())) {
                maxGrade = grade;
            }
        }
        return maxGrade;
    }

    public Integer getAverageGrade(String discipline){
        List<Integer> gradesForDiscipline = getGradesForDiscipline(discipline);
        int sum =0;
        for(Integer grade : gradesForDiscipline){
            sum += grade;
        }
        int floorAverage = (int) Math.floor(sum) / gradesForDiscipline.size(); // 2.3 => 2    2.9 =>2
        int ceilAverage =  (int) Math.ceil(sum) / gradesForDiscipline.size();// 2.3=>3      2.9=>3
        int roundAverage = (int) Math.round(sum) / gradesForDiscipline.size();// 2.3 =>2     2.9=>3

        return roundAverage;
    }

}
