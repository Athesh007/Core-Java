package oops_concepts;

class Box_details {
    double width;
    double height;
    double depth;

    Box_details(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

}

class Box {
    public static void main(String args[]) {

        Box_details obj1 = new Box_details(3,5,10);

        Box_details obj2 = new Box_details(10,15,20);
        System.out.println("Vol of Box1:" + obj1.volume());
        System.out.println("Vol of Box2:" + obj2.volume());
    }
}
