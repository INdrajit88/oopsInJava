/**
 * StaticInfo
 */
class Student{
    String name;
    int roll;
    static String schoolName;
    public static void changeSchoolName(String newSchoolName){
        schoolName = newSchoolName;
    }
}
public class StaticInfo {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Inrajit";
        s1.roll = 1;
        Student.schoolName = "DPS";
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(Student.schoolName);
        System.out.println(s1.schoolName);
    }
}
