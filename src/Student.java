public class Student extends Person {

    private String course;

    public Student(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Course: " + course);
        System.out.println("-----------------------");
    }
}
