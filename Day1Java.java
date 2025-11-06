
import java.util.*;

class Searching {

    public Searching() {
        System.out.println("Constructor Calling in he seraching");
    }

    public int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i + 1;
            }
        }
        return -1;
    }

    public int binarySeacrh(int arr[], int target) {
        // Must be in Sorted order;
        int si = 0;
        int ei = arr.length - 1;
        while (si < ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }
}

class Sorting extends Searching {

    public Sorting() {
        System.out.println("Sorting COnstructor Called");
    }

    public void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    //1.bubble sort
    public void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //2.insertion sort
    public void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    //3.selection sort
    public void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

class Day1Java {

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            mergeArr(arr, left, mid, right);
        }
    }

   
    public static void mergeArr(int arr[], int left, int mid, int right) {
        int lSize = mid - left + 1;
        int rSize = right - mid;

        int[] L = new int[lSize];
        int[] R = new int[rSize];

        for (int i = 0; i < lSize; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < rSize; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < lSize && j < rSize) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < lSize) {
            arr[k++] = L[i++];
        }

        while (j < rSize) {
            arr[k++] = R[j++];
        }
    }

    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "even" : "odd";
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int fibonacci(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int countVowels(String str) {
        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean findDuplicate(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int keys : map.keySet()) {
            if (map.get(keys) > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(5));
        System.err.println("Factorail =" + factorial(4));
        System.out.println("Fibonacci = " + fibonacci(4));
        for (int i = 0; i < 5; i++) {
            System.out.print(fibonacci(i) + "     ");
        }
        System.out.println("vowels in String " + countVowels("Akshaey"));
        int arr1[] = {1, 2, 3, 4, 1};
        System.out.println(findDuplicate(arr1));
        Searching s11 = new Searching();
        System.out.println(s11.binarySeacrh(arr1, 8));
        System.out.println(s11.linearSearch(arr1, 4));
        int arr2[] = {2, 4, 6, 1, 0, 5, 9, 6};
        Sorting s1 = new Sorting();
        s1.bubbleSort(arr2);
        s1.printArr(arr2);
        s1.selectionSort(arr2);
        s1.printArr(arr2);
        s1.insertionSort(arr2);
        s1.printArr(arr2);
        mergeSort(arr2, 0, arr2.length-1);
        s1.printArr(arr2);
    }
}
