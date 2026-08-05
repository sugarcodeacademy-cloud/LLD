package Lambdas;

import java.util.Comparator;

public class LIstComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b){
        if(a%2 == b%2) return b-a;
        else if(a % 2 == 0) return -1;
        else return 1;
    }
}
