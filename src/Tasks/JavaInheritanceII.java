package Tasks;

public class JavaInheritanceII {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
//        System.out.println("My superclass is: Arithmetic");
//        System.out.println("42 13 20");
        System.out.println(adder.add(12, 30) + " " + adder.add(12, 1) + " " + adder.add(10, 10));
    }
}

class Arithmetic {
    public int add(int a, int b){
        return a+b;
    }
}

class Adder extends Arithmetic{
    @Override
    public int add(int a, int b){
        return a+b;
    }
}