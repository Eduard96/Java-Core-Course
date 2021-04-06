package lesson3;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, -7, 5, 6, 7, -9};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }

        for(int a : arr) {
            System.out.println(a);
        }
    }
}
