package com.company;
//объявляю класс
class Interval{
    int sec;
    int min;
    int hour;
    Interval (int h,int m, int s){
        hour = h;
        min = m;
        sec = s;
    }
    public int calcSec(){
        return hour*3600 + min*60 + sec;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Interval{" +
                "sec=" + sec +
                ", min=" + min +
                ", hour=" + hour +
                '}';
    }
}

//присваиваю секунды


//непосредственно программа
public class countInterval{
    public static void main(String[]args){
        Interval sharp = new Interval(3, 12, 56);{
            System.out.println ("Общее количество секунд равно" + " " + sharp)
        }
    }
}