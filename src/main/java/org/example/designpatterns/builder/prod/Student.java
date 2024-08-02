package org.example.designpatterns.builder.prod;


public class Student {

    String name;
    String email;
    int age;
    String phoneNumber;

    private Student(Builder builder) throws Exception {

        this.age = builder.age;
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;

    }

    public static Builder getBuilder(){
        return new Builder();
    }


    static class Builder{
        String name;
        String email;
        int age;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }


        public Student build() throws Exception {
            if(this.age < 18){
                throw new Exception("age cannot be less than 18");
            }
            return new Student(this);
        }

    }


}
