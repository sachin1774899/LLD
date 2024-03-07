package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student s = Student.builder()
                .setId(1)
                .setName("sachin")
                .setAge(20)
                .setPsp(90)
                .setPassing_year(2024)
                .setPhoneNumber("9867927812")
                .setUniversityName("Mumbai university")
                .build();
        System.out.println(s);
    }

}
