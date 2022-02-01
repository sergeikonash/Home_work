package collection.dto;

import java.util.Random;

public class Student {

    private int id;
    private String name;
    private int age;
    private double grade;
    private boolean olympiadParticipant;

    public Student(int id) {
        this.id = id;
        setName();
        this.name = getName();
        setAge();
        this.age = getAge();
        setGrade();
        this.grade = getGrade();
        setOlympiadParticipant();
        this.olympiadParticipant = getOlympiadParticipant();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public boolean getOlympiadParticipant() {
        return olympiadParticipant;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", OlympiadParticipant=" + olympiadParticipant +
                '}';
    }

    public void setName() {
        String alphabet = "абвгдежзиклмопрстуфхцчшщыэюя";
        int length = alphabet.length();
        int i = (int) (Math.random() * length);
        this.name = alphabet.charAt(i) + "";
    }

    public void setAge() {
        int max = 17;
        int min = 7;
        setAge(max, min);
    }

    public void setAge(int max, int min) {
        max -= min;
        this.age =  (int) (Math.random() * ++max) + min;
    }

    public void setGrade() {
        this.grade = Math.round((Math.random() * 10) * 10) / 10;
    }

    public void setOlympiadParticipant() {
        Random random = new Random();
        olympiadParticipant = random.nextBoolean();
    }
}
