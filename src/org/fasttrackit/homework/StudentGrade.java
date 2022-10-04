package org.fasttrackit.homework;

import java.util.Objects;

public class StudentGrade {
    private final String name;
    private final String discipline;
    private final int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;

    }

    public int getGrade() {
        return grade;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade that = (StudentGrade) o;
        return grade == that.grade && Objects.equals(name, that.name) && Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, discipline, grade);
    }
}
