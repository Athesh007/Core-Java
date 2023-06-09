package oops_concepts;

class swapping {
    public static void main(String[] args) {
        int a = 15;
        int b = 30;
        swap obj = new swap();
        System.out.println("\nInitial Values");
        System.out.println("A:" + a + "  B:" + b);
        System.out.println("\nTry swapping in same class");
        localswapper(a, b);
        System.out.println("A:" + a + "  B:" + b);
        System.out.println("\nTry swapping in different class");
        obj.swapping(a, b);
        System.out.println("A:" + a + "  B:" + b);
    }

    static void localswapper(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class swap {
    void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
