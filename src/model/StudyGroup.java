package model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    Teacher teacher;
    List<User> students = new ArrayList<>();



    public StudyGroup(Teacher teacher, List<User> students) {
        this.teacher = teacher;
        this.students = students;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}

