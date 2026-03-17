public class Person {
    protected String name;
    public String surname;
    public Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public enum Gender {
        MALE,
        FEMALE

    }
}