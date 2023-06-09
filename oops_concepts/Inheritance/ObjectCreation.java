package oops_concepts.Inheritance;

class Parent
{
    Parent()
    {
       System.out.println("Super class Constructor"); 
       System.out.println("Super class object hashcode:"+this.hashCode());
    }
}
class Child extends Parent
{
    Child(){
        System.out.println("Sub Class Constructor");
        System.out.println("Sub class object Hashcode:"+this.hashCode());
    }
}
class ObjectCreation
{
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
