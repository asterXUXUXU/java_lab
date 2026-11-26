class Person {
    protected String name;
    protected String gender;
    protected String birthDate;

    public Person(String name,String gender,String birthDate){
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public void printInfo(){
        System.out.println("姓名：" + name + "，性别：" + gender + "出生日期：" + birthDate);
    }
}

class Teacher extends Person{
    private String school;
    private String teacherId;

    public Teacher(String name,String gender,String birthDate,String school,String teacherId){
        super(name,gender,birthDate);
        this.school = school;
        this.teacherId = teacherId;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("学校：" + school + "，工号：" + teacherId);
    }
}

class Student extends Person{
    private String school;
    private String studentId;
    private String major;
    private String grade;
    private String className;

    public Student(String name,String gender,String birthDate,String school,String studentId,String major,String grade,String className){
        super(name,gender,birthDate);
        this.school = school;
        this.studentId = studentId;
        this.major = major;
        this.grade = grade;
        this.className = className;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("学校：" + school + "，学号：" + studentId + "，专业：" + major + "，年级：" + grade + "，班级：" + className);
    }
}

public class TestPerson {
    public static void main(String[] args){
        Teacher one = new Teacher("张三","男","1999-09-09","广东石油化工学院","T001");
        System.out.println("教师信息");
        one.printInfo();

        Student two = new Student("李四","男","2006-06-06","广东石油化工学院","S001","计算机科学与技术","大二","2班");
        System.out.println("\n学生信息");
        two.printInfo();
    }
}