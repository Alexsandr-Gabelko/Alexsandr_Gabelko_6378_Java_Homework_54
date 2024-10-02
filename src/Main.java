import controller.Controller;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        Controller controller = new Controller();
        controller.createStudent("Василий", "Иванов", "Иванович",
                LocalDate.of(2007, 12, 3));
        controller.createStudent("Иван", "Иванов", "Иванович",
                LocalDate.of(2007, 12, 3));
        controller.createStudent("Петр", "Иванов", "Иванович",
                LocalDate.of(2007, 12, 3));
        controller.createStudent("Сергей", "Иванов", "Иванович",
                LocalDate.of(2007, 12, 3));
        controller.createStudent("Василий", "Петров", "Иванович",
                LocalDate.of(2007, 12, 3));
        controller.createStudent("Иван", "Петров", "Иванович",
                LocalDate.of(2007, 12, 3));
        controller.createStudent("Петр", "Петров", "Иванович",
                LocalDate.of(2007, 12, 3));

        controller.getAllStudents();
        controller.getStudyGroup();

    }
}