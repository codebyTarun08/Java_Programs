package Constructor;

// class Parent{
//     public Parent{
//       System.out.println("Parent Constructor");
//     }
// }
// class Child extends Parent{
//     public Child{
//         System.out.println("Child Constructor");
//     }
// }
// class GrandChild extends Child{
//     public GrandChild{
//         System.out.println("Granchild Constructor");
//     }
// }
// class SCconst{
//     public static void main(String[] args) {
//         Parent p=new Parent();
//         Child c=new Child();
//         GrandChild g=new GrandChild();
//     }
// }

class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    public Child() {
        super(); // Call the superclass constructor
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        super(); // Call the superclass constructor
        System.out.println("Grandchild Constructor");
    }
}

public class SCconst {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        GrandChild g = new GrandChild();
    }
}
// Agar hum ek ek baar sabhi class ka object banakar call krengw toh super keyword ki jarurat nhi hogi child class par agar teeno object ko ek saath create krenge toh hume super keyword kA USE KARNA PADEGA