package Learning2;

public class Dog extends Animals{

    public Dog(){
        super(15);
        System.out.println("A dog has been created!");
    }

    public void ruff(){
        System.out.println("The dog says ruff");
    }

    public void run(){
        System.out.println("A dog is running");
    }

    @Override
    public void sleep(){
        System.out.println("A dog is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("An dog is eating!");
    }
}
