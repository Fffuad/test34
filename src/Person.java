public class Person {

    private int id;
    private  String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }



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

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return " Person {" +
                "\n\tid= " + id +
                "\n\tname= " + name +
                "\n\tsurname= " + surname +
                "\n\tage= " + age +
                "\n}";
    }



}
