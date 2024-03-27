import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Person {
    private String name;
    private Date dateOfBirth;

    public Person(String name, String dateOfBirth) throws ParseException {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.dateOfBirth = dateFormat.parse(dateOfBirth);
    }

    public void displayPersonName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        Date currentDate = new Date();
        long ageInMillis = currentDate.getTime() - dateOfBirth.getTime();
        long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Age: " + ageInYears + " years");
    }
}

class Employee extends Person {
     String empId;
     double salary;

    public Employee(String name, String dateOfBirth, String empId, double salary) throws ParseException {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;
    }

}

 class Test {
    public static void main(String[] args) throws ParseException {
        Person person = new Person("John Doe", "1990-05-15");
        person.displayPersonName();
        person.displayAge();

}
 }
