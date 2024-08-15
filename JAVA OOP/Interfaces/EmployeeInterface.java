interface Information{
    void printInfo();
}
class EmployeeInfo implements Information{
    String name;
    String department;
    int age;

    public void setInformation(String n,String dep,int a){
       name=n;
       department=dep;
       age=a;
    }
    public void printInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Department: "+ department);
        System.out.println("Age: "+ age);
    }
}
public class EmployeeInterface {
    public static void main(String[] args) {
        EmployeeInfo em=new EmployeeInfo();
        em.setInformation("Nitin", "Finance", 26);
        em.printInfo();
    }
}
