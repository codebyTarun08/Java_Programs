package Constructor;

class Student{
    String name;
    int age;

    Student(){
        System.out.println("DEFAULT CONSTRUCTOR");
        name="Tarun";
        age=18;
    }
    Student(String n,int a){
        System.out.println("Parameterised CONSTRUCTOR");
        name=n;
        age=a;
    }
    Student(Student st){
        System.out.println("Copy CONSTRUCTOR");
        name=st.name;
        age=st.age;
    }
}
public class Types {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);

        Student s2=new Student("Aakash",20);
        System.out.println(s2.name);
        System.out.println(s2.age);

        Student s3=new Student(s1);
        System.out.println(s3.name);
        System.out.println(s3.age);

    }
} 
