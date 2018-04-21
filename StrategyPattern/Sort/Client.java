package Sort;

public class Client {

    public static void main(String[] args){

        SortingContext ctx = new SortingContext();

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        for (int i:arr){
            System.out.print(i +" ");
        }

        System.out.println("");

        ctx.setSortingAlgorithm(new HeapSort());

        ctx.sortData(arr);

        ctx.printSortingType();

        for (int i:arr){
            System.out.print(i +" ");
        }



    }

}
