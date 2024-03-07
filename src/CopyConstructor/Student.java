package CopyConstructor;

public class Student {
    int id;
    String name;
    String batchName;
    int passing_year;

    public Student(){

    }

    public Student(int sid,
                   String sname,
                   String sbatchName,
                   int spassing_year){
        this.id = sid;
        this.name = sname;
        this.batchName = sbatchName;
        this.passing_year = spassing_year;
    }

    public Student(Student stu){
        this.id = stu.id +1;
        this.batchName = stu.batchName;
        this.passing_year = stu.passing_year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batchName='" + batchName + '\'' +
                ", passing_year=" + passing_year +
                '}';
    }
}
