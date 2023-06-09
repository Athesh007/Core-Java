package oops_concepts;

class Rectangle{
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return 2*(height+width);
    }
}
public class rec {
    public static void main(String[]args){
        Rectangle rectangle=new Rectangle(20,40);
        System.out.println("The area is "+rectangle.getArea());
        System.out.println("The peremeter is "+rectangle.getPerimeter());
    }
}
