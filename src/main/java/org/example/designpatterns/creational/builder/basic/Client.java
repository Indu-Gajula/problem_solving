package org.example.designpatterns.creational.builder.basic;

public class Client {
    public static void main(String[] args) throws Exception {
        Builder builder = new Builder();
        builder.setAge(19);
        builder.setEmail("abc@gmail.com");
        builder.setName("indu");
        builder.setPhoneNumber("8909765464");
        Student student = new Student(builder);

        System.out.println("DEBUG");

    }
}
