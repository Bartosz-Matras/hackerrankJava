package Learning2;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double TOO_HOT = 185;
    public static final double TOO_COLD = 160;

    public static void drinkHotChocolate(double cocaTemp) throws TooHotException, TooColdException{
        if (cocaTemp >= TOO_HOT){
            throw new TooHotException();
        }else if (cocaTemp <= TOO_COLD){
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        double currentCocoTemp = 170;
        try {
            drinkHotChocolate(currentCocoTemp);
            System.out.println("That cocoa was good!");
        }catch (TooHotException e){
            System.out.println("That's too hot!");
        }catch (TooColdException e){
            System.out.println("That's too cold!");
        }

        int i = 10;
        while (i > 5){
            System.out.println(i);
            i--;
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("And it's gone.");
    }
}
