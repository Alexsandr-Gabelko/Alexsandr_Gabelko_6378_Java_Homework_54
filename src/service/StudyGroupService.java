package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudyGroupService extends DataService {

    List<StudyGroup> studyGroupList = new ArrayList<>();


    public List<StudyGroup> createStudyGroup(Teacher teacher, List<Student> students) {

        Teacher teacher1 = new Teacher("Борисов", "Иосив", "Анатольевич",
                LocalDate.of(2007, 12, 3), 1);
        StudyGroup studyGroup1 = new StudyGroup(teacher1, getAllStudent());
        studyGroupList.add(studyGroup1);
        return studyGroupList;

    }


}

