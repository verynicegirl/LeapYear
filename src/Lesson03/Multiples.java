package Lesson03;

public class Multiples {
    public static void main(String[] args) {
        int[] multiples = new int[100];
        int p = 1;
        int x = 0;
        multiples[x] = p;
        if (p % 13 == 0) {
            System.out.println(p);
        }
        p++;
        x++;
        if (p % 17 == 0) {
            System.out.println(p);
        }
        p++;
        x++;
        do {
            p++;
        }
        while (x <= 100);
    }
}
