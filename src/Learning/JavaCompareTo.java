package Learning;

import java.util.Arrays;
import java.util.Collections;

public class JavaCompareTo {
    public static void main(String[] args) {
        Pracownik[] pracowniks = new Pracownik[3];
        pracowniks[0] = new Pracownik(1000);
        pracowniks[1] = new Pracownik(3000);
        pracowniks[2] = new Pracownik(2000);

//        System.out.println(pracowniks[0].getWynagrodzenie());
        System.out.println(pracowniks[0].compareTo(pracowniks[1]));

        System.out.println("Przed posortowaniem: ");
        for (Pracownik p : pracowniks){
            System.out.println(p.getWynagrodzenie());
        }

        Arrays.sort(pracowniks);

        System.out.println("Po sortowaniu: ");
        for (Pracownik p : pracowniks){
            System.out.println(p.getWynagrodzenie());
        }

        Arrays.sort(pracowniks, Collections.reverseOrder());

        System.out.println("Po sortowaniu(od tyłu/malejąca): ");
        for (Pracownik p : pracowniks){
            System.out.println(p.getWynagrodzenie());
        }
    }
}


class Pracownik implements Comparable {
    private double wynagrodzenie;

    Pracownik(){

    }
    Pracownik(double wynagrodzenie){
        this.wynagrodzenie = wynagrodzenie;
    }
    public double getWynagrodzenie(){
        return this.wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik p = (Pracownik) o;
//        return Double.compare(this.wynagrodzenie, p.wynagrodzenie);

        if (this.wynagrodzenie < p.wynagrodzenie){
            return -1;
        }

        if (this.wynagrodzenie > p.wynagrodzenie){
            return 1;
        }

        return 0;
    }
}