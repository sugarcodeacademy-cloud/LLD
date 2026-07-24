package MergeSortMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService ex;
    Sorter(List<Integer> arrayToSort, ExecutorService ex){
        this.arrayToSort = arrayToSort;
        this.ex = ex;
    }
//    Sorter(List<Integer> arrayToSort){
//        this.arrayToSort = arrayToSort;
//    }



    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }
        int mid = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        for(int i =0; i< mid; i++){
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i =mid; i< arrayToSort.size(); i++){
            rightArray.add(arrayToSort.get(i));
        }

//        ExecutorService ex = Executors.newCachedThreadPool();
        Sorter task1 = new Sorter(leftArray, ex);
        Sorter task2 = new Sorter(rightArray, ex);

        Future<List<Integer>> sortedLeftArray =ex.submit(task1);
        Future<List<Integer>> sortedRightArray =ex.submit(task2);


        leftArray = sortedLeftArray.get();
        rightArray = sortedRightArray.get();

//        merge the left Arr and right Arr

        List<Integer> mergedArray = new ArrayList<>();

        int i=0, j=0;
        while(i < leftArray.size() && j < rightArray.size()){
            if(leftArray.get(i) < rightArray.get(j)){
                mergedArray.add(leftArray.get(i));
                i++;
            }
            else{
                mergedArray.add(rightArray.get(j));
                j++;
            }
        }
        while(i < leftArray.size()){
            mergedArray.add(leftArray.get(i));
            i++;
        }
        while(j < rightArray.size()){
            mergedArray.add(rightArray.get(j));
            j++;
        }

        return mergedArray;

    }
}
