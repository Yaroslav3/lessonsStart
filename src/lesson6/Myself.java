package lesson6;

/**
 * Created by Ярик on 26.10.2017.
 */
public class Myself {
    private String name;
    private int age;
    private String surName;


    public Myself(String name, int age, String surName) {
        this.name = name;
        this.age = age;
        this.surName = surName;

    }

    Myself(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    @Override
    public String toString() {
        return "Myself{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", programmingSchool='" + surName + '\'' +
                '}';
    }
}
