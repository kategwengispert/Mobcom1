package info.kategwengispert.improvedlist;

/**
 * Created by it.admin on 8/19/2017.
 */

public class Animal {


    private String name;
    private int age;
    private int photo;

    public Animal(String name, int age, int photo) {
        this.name = name;
        this.age = age;
        this.photo = photo;
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

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
