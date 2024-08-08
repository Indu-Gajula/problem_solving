package org.example.sorting.comparator_comparable;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class Test{
public static void main(String[] args) {

    Student s1 = new Student("indu", 25,1);
    Student s2 = new Student("name",23,3);
    Student s3 = new Student("name2",22,2);

    List<Student> list = new ArrayList<>(List.of(s1, s2, s3));

    Collections.sort(list);
    System.out.println(list);

    list.sort(new SortByAge());
    System.out.println(list);

    // directly writing class anonymous inner class
    list.sort(Comparator.comparingInt(Student::getId));
    System.out.println(list);


}
}