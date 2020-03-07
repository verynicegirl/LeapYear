package Lesson02;

import java.util.Scanner;

public class Rubles {
    public static void main(String[]args){
            System.out.println("Введите  сумму");
            Scanner sc=new Scanner(System.in);
            int sum= sc.nextInt();
        if(sum == 1 || sum % 10==1 & sum!=11) {
            System.out.println(sum + " " + "рубль");
        }
        else if (sum==2 || sum%10 == 2 && sum!=12);
        else if (sum==3 || sum%10 == 3 && sum != 13);
        else if (sum==4 || sum%10 == 4 && sum != 14){
                System.out.println(sum + " " + "рубля");
        }
        else{
            System.out.println(sum + " " + "рублей");
            }
    }
}
