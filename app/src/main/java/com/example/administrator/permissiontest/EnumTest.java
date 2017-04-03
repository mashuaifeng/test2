package com.example.administrator.permissiontest;

/**
 * Created by Administrator on 2016/12/28.
 */
public class EnumTest {

    public EnumTest(){}
    public static void main(String[] args){
        Weekday weekday = Weekday.FRI;
      //  System.out.print(weekday.getClass()+"**"+weekday.getDeclaringClass());
       // System.out.print(weekday.ordinal());
      /* Weekday[] arr = Weekday.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        System.out.print(weekday.name());
    }
    public enum Weekday{
        SUN(0),MON,TUE,WED,THU,FRI,SAT;
        private Weekday(){
            System.out.println("hahaha");
        };
        private Weekday(int day){
            System.out.println("888888");
        }
    }
    public enum  TrafficLamp{
        Red(30){
            @Override
            public TrafficLamp next() {
                return Green;
            }
        },Green(45){
            @Override
            public TrafficLamp next() {
                return Yellow;
            }
        },Yellow(5){
            @Override
            public TrafficLamp next() {
                return Red;
            }
        };
        public abstract TrafficLamp  next();
        private int time;
        private TrafficLamp(int time){this.time = time;}
    }
}
