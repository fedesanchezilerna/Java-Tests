package clases;

public class Student {

    // Attributes
    private String name;
    private byte age;
    private String id;
    private String state = "Sleeping";

    // Constructor
    public Student() {
    }

    public Student(String name, byte age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Methods

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Other Methods

    public String sayHi() {
        return "Hello my name is " + name +
               " I am " + age +
               " y/o and my ID is " + id;
    }

    public String studying(String subject) {
        this.state = "Studying";
        return "I am studying " + subject;
    }

    public String sleeping() {
        if (!state.equals("Sleeping")) {
            setState("Sleeping");
        } else {
            return "I am already sleep...";
        }

        return "Night night zzz";
    }
}
