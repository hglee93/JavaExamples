package completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExam01 {

    public CompletableFuture task;
    
    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void log(String s) {

    }

    public CompletableFuture asyncTest() {
        //TODO
        return null;
    }

    public static void main(String[] args) {
        
    }
}
