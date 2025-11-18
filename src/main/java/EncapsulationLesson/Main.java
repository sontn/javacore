package EncapsulationLesson;

import lombok.Getter;
import lombok.Setter;

public class Main {
    public static void main(String args[]) {
        Person person = new Person();
        person.setName("Son");
        try {
            person.setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Name :" + person.getName() + " age: " + person.getAge());
    }
}

@Getter
@Setter
class Person {
    private String name;
    //private int age;
    private Integer age;

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Tuoi khong hop le: " + age);
        }
    }
}

//public class Main {
//    public static void main(String args[]) {
//        Person person = new Person();
//        person.name = "Son";
//        person.age = -1;
//        System.out.println("Name :" + person.name + " age: " + person.age);
//
//    }
//}
//
//class Person {
//    String name;
//    int age;
//}