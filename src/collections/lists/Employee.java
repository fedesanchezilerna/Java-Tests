package collections.lists;

class Employee{
    private String name;
    private String surname;
    private int tel;
    private byte age;
    public Employee (String name, String surname, int tel, byte age) {
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.age = age;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }


    //toString()

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", tel=" + tel +
               ", age=" + age +
               '}';
    }

}