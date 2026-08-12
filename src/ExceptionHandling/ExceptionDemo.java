package ExceptionHandling;

public class ExceptionDemo {

    public static int fibonacci(int N){
//        if(N <= 1)  return N;
        return fibonacci(N-1)+ fibonacci(N-2); //create stackOverflow error, system will be crashed cannot handle in try catch
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21
    public static void main(String[] args) {
        //1. Arithematic Exception
//        int result = 10/0;

        //2.NullPointer Exception
//        String s = null;
//        s.length();
//
        //3.Array Index Out of Bound Exception
//        int[] arr = {1,2,3};
//        System.out.println(arr[5]);


        System.out.println(fibonacci(5));

    }



}
