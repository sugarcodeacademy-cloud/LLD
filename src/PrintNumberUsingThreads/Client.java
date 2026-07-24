package PrintNumberUsingThreads;

public class Client {
    public static void main(String[] args) {
        for(int i=1; i<= 1000; i++){
            PrintNumber p = new PrintNumber(i);
            Thread t = new Thread(p);
            t.start();
        }

    }
}

