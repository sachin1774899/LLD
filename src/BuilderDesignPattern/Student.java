package BuilderDesignPattern;

import BuilderDesignPattern.Exceptions.InvalidAgeException;
import BuilderDesignPattern.Exceptions.InvalidNamesException;
import BuilderDesignPattern.Exceptions.InvalidYearException;

public class Student {
    private int id;
    private String name;
    private int passing_year;
    private int psp;
    private int age;
    private String phoneNumber;
    private String universityName;

    private Student(int id, String name, int passing_year, int psp, int age, String phoneNumber, String universityName) {
        this.id = id;
        this.name = name;
        this.passing_year = passing_year;
        this.psp = psp;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passing_year=" + passing_year +
                ", psp=" + psp +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int id;
        private String name;
        private int passing_year;
        private int psp;
        private int age;
        private String phoneNumber;
        private String universityName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassing_year(int passing_year) {
            this.passing_year = passing_year;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        private void validate(){
            if(this.passing_year > 2023){
                throw new InvalidYearException();
            }
            if(this.age < 18){
                throw new InvalidAgeException();
            }
            if(this.name==null){
                throw new InvalidNamesException();
            }
        }
        public Student build(){
            validate();
            return new Student(this.id, this.name, this.passing_year,this.psp, this.age, this.phoneNumber,this.universityName);
        }
    }
}
