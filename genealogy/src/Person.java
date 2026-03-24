import java.time.LocalDate;

public class Person {
    private String name, last_name;
    private LocalDate birthDayDate;

    public Person(String name,
                  String last_name,
                  LocalDate birthDayDate) {
        this.name = name;
        this.birthDayDate = birthDayDate;
        this.last_name = last_name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthDayDate=" + birthDayDate +
                '}';
    }
}
