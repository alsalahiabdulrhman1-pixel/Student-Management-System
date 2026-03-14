import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();

                    Student student = new Student(name, id, course);
                    students.add(student);

                    System.out.println("Student added successfully!");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {

                        for (Student s : students) {
                            s.displayInfo();
                        }

                    }

                    break;

                case 3:

                    System.out.println("Exiting program...");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
