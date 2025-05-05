interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}

public class SortMvZero {

    public static void moveZeroesToEnd(int[] arr) {
        int index = 0;  // index for placing non-zero elements
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Part A: Move all zeroes to the end");
        int[] arrWithZeroes = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroesToEnd(arrWithZeroes);
        printArray(arrWithZeroes);

        System.out.println("\nPart B: Sort arrays using interface");

        int[] arr1 = {5, 2, 8, 1, 3};
        int[] arr2 = {9, 4, 6, 2, 7};

        Sortable bubbleSort = new BubbleSort();
        Sortable selectionSort = new SelectionSort();

        System.out.print("Bubble Sort: ");
        bubbleSort.sort(arr1);
        printArray(arr1);

        System.out.print("Selection Sort: ");
        selectionSort.sort(arr2);
        printArray(arr2);
    }
}
