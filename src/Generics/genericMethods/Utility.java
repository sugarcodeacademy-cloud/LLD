package Generics.genericMethods;

public class Utility {

    public static <T> void printArray(T[] array){
        for(T item : array) {
            System.out.print(item + " ");
        }

    }
    public static <T> T getFirst(T[] array){
        if (array == null || array.length == 0){
            return null;
        }
        return array[0];
    }

    public static <T, V> Pair<T, V> makePair(T first, V second){
        return new Pair<>(first, second);
    }

    public static <T> T getDeafult(){
        return null;
    }

}

//<T> -- declare the type parameter
//T(second one) - return type
//T[] array - the parameter type
