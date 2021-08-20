package Learning;

import java.util.Random;

public class CoinToss {

    public String tossACoin(){
        Random random = new Random();
        int toss = Math.abs(random.nextInt()) % 2;
        if (toss == 0){
            return "HEADS";
        }else {
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        CoinToss coinToss = new CoinToss();
        System.out.println(coinToss.tossACoin());
        System.out.println(coinToss.tossACoin());
        System.out.println(coinToss.tossACoin());
        System.out.println(coinToss.tossACoin());
        System.out.println(coinToss.tossACoin());
    }
}
