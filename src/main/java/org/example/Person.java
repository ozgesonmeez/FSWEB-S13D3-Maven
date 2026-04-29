package org.example;
//Person Sınıfı
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age ;
    private String address;
    private String gender;
    private boolean isMarried;


    public Person(String firstName, String lastName , int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName , int age,String address, String gender, boolean isMarried){
        this(firstName,lastName,age);
        this.address = address;
        this.gender = gender;
        this.isMarried = isMarried;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args){
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
    }
}

