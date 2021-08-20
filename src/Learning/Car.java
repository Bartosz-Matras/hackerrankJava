package Learning;

public class Car {
    //=====================================
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    //=====================================
    public Car(){

    }

    public Car(int maxSpeed, double weight, boolean isTheCarOn){
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
    }

    //=====================================
    public void printVariables(){
        System.out.println("This is the maxSpeed: " + maxSpeed);
        System.out.println("This is the minSpeed: " + minSpeed);
        System.out.println("This is the weight: " + weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
        System.out.println();
    }

    public void wreckCar(){
        this.condition = 'C';
    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed+1;
    }

    public void getIn(){
        // If there aren't too many people in the car...
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar){
            // then someone can get in
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        }else{
            // otherwise print out the fact the car is full.
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut(){
        // If there's people in the car...
        if (numberOfPeopleInCar > 0){
            // then tell one person to get out
            numberOfPeopleInCar--;
            System.out.println("Someone got out");
        }else{
            // otherwise no one cen get out and we'll print that.
            System.out.println("No one is in the car. Chill out! Number of person in car: " + numberOfPeopleInCar);
        }
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarnOn(){
        // If the car isn't on...
        if (!isTheCarOn){
            // turn it on
            isTheCarOn = true;
            System.out.println("Turn on the car.");
        }else {
            // otherwise print out the fact it's on
            System.out.println("The Car is already on " + isTheCarOn );
        }
    }

    //=====================================
    public static void main(String[] args) {

        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarnOn();
        tommyCar.turnTheCarnOn();



//        System.out.println("Birthday Car: ");
//        Car birthdayPresent = new Car(500, 5000.545, true);
//
//        System.out.println("Birthday Car v1: ");
//        birthdayPresent.printVariables();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas());
//        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
//
//        System.out.println("Birthday Car v2: ");
//        birthdayPresent.printVariables();
//        birthdayPresent.getOut();
//
//        System.out.println("Birthday Car v3: ");
//        birthdayPresent.printVariables();


//        System.out.println("Christmas Car: ");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
//
//
//        System.out.println("Family's Car:");
//        Car familyCar = new Car();
//        familyCar.printVariables();
//
//
//        System.out.println("Alice's Car: ");
//        Car aliceCar = familyCar;
//        familyCar.wreckCar();
//        aliceCar.printVariables();
    }
}
