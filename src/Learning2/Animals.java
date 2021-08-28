package Learning2;

public abstract class Animals {

    private int age;

    public Animals(int age){
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("An animal is sleeping");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog  = new Dog();
        Cat cat = new Cat();

        dog.setAge(13);
        System.out.println(dog.getAge());

        dog.eat();
        cat.eat();

        dog.sleep();
        cat.sleep();


    }
}


