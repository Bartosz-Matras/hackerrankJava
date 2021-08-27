package Learning2;

public class Cat extends Animals{


    public Cat() {
        super(7);
        System.out.println("A cat has been created!");
    }

    public void meow(){
        System.out.println("A cat meows!");
    }

    public void prance(){
        System.out.println("A cat is prancing");
    }

    @Override
    public void sleep(){
        System.out.println("A cat is sleeping");
    }


    @Override
    public void eat() {
        System.out.println("The cat is eating!");
    }
}
