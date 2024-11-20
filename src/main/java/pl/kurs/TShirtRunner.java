package pl.kurs;

import java.util.Arrays;
import java.util.Scanner;

public class TShirtRunner {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt("Lacoste",Size.EXTRA_SMALL);
        System.out.println(Size.EXTRA_SMALL == Size.EXTRA_SMALL);
        System.out.println(Size.EXTRA_SMALL.getAbbreviation());

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rozmiar koszulki");
//        String tShirtSize = scanner.nextLine();
//        Size size = Size.valueOf(tShirtSize);
//        System.out.println(size);

        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.EXTRA_LARGE.compareTo(Size.MEDIUM));
        System.out.println(Size.MEDIUM.compareTo(Size.EXTRA_LARGE));

        Size[] sizes = Size.values();
        System.out.println(Arrays.toString(sizes));
        Size.EXTRA_SMALL.printSomething();
        Size.LARGE.printSomething();


    }
}
