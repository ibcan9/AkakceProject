package Utility;

public class MyFunc {
    public static void Wait(int Sec){
        try {
            Thread.sleep(Sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
 }