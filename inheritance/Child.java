package inheritance;

public class Child extends Parent {

    public String name = "India";

    public Child(){
        super();
    }
    public void display(){
        System.out.println("Child display");
        System.out.println("child display, parent data: "+super.name);
//        System.out.println(super.city);
    }

    public void newFunction(){
        System.out.println("Child display, child name: "+this.name);
    }
}
