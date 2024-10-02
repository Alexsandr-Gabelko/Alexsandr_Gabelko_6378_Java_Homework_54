package controller;

import model.*;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final StudentView studentView = new StudentView();
    private final DataService service = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    //List<User> userList = new ArrayList<>();


    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        service.create(firstName, secondName, patronymic, dateOfBirth, Type.STUDENT);
    }

    public void getAllStudents() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            System.out.println(student);
        }
    }

    public void getStudyGroup() {


        List<User> userList = service.getAllStudent();
//        for (User user : userList) {
//            Student student = (Student) user;
//            System.out.println(student);
//            List<StudyGroup> studyGroups = studyGroupService.getStudyGroup();

//            System.out.println(studyGroups);
//        }
        List<Student> students = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                Student student = (Student) user;
                students.add(student);
            }
        }
        Teacher teacher1 = new Teacher("Борисов", "Иосив", "Анатольевич",
                LocalDate.of(2007, 12, 3), 1);
        List<StudyGroup> studyGroups = studyGroupService.createStudyGroup(teacher1, students);
        System.out.println(studyGroups);
    }
}