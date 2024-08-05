package encapsulation;

/*
    Encapsulation: Wrapping up of data under a single entity.
    This property is also called POJO (Plain Old Java Object).
    Technically:
        1. variables should be private, they shouldn't be accessed by any other class.
        2. methods should be public
        3. toString() -> string representation

    - Setters have void return type
    - Getters have different return type
*/

class Teacher {
    private int teacher_id;
    private String teacher_name;
    private String subject;
    private float salary;
    private Address address;

    // Methods
    // Getters and Setters
    public int getTeacher_id() {
        return teacher_id;
    }
    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }
    public String getTeacher_name() {
        return teacher_name;
    }
    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    // toString Method
    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    // Personalized Method
    public void displayTeacherId() {
        System.out.println(teacher_id + " " + teacher_name + " ");
    }
}

public class MainApplication {
    public static void main(String[] args) {
        Address address = new Address();
        address.setFno(123);
        address.setPinCode(411014);
        address.setHouseName("B12");
        address.setArea("Viman Nagar");
        address.setCity("Pune");
        address.setState("MH");

        Teacher teacher = new Teacher();

        // Setters
        teacher.setTeacher_id(1);
        teacher.setTeacher_name("Salman Khan");
        teacher.setSubject("Acting");
        teacher.setSalary(12345f);

        teacher.setAddress(address);

        // Getters
        System.out.println("==================== WAY1 ====================");
        System.out.println("Teacher details are: ");
        System.out.println("Teacher id: " + teacher.getTeacher_id());
        System.out.println("Teacher name: " + teacher.getTeacher_name());
        System.out.println("Teacher subject: " + teacher.getSubject());
        System.out.println("Teacher salary: " + teacher.getSalary());
        System.out.println("Teacher salary: " + teacher.getAddress());

        System.out.println("==================== WAY2 ====================");
        System.out.println("Teacher details using object: " + teacher);

        System.out.println("==================== WAY3 ====================");
        teacher.displayTeacherId();
    }
}
