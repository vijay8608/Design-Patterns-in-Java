package Sort;

import java.util.ArrayList;

public class SortingContext {

    private SortingAlgorithm algorithm;

    public void setSortingAlgorithm(SortingAlgorithm algorithm){
        this.algorithm = algorithm;
    }

    public void sortData(int[] arr){
        algorithm.orderingData(arr);
    }

    public void printSortingType(){
        System.out.println("Sorted using "+ algorithm.className());
    }


}
