package Lesson03;

public class Anumeration {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
        for (int i = 5; 0 < i && i < array.length; i--) {
            System.out.println(i);
        }
    }
}
