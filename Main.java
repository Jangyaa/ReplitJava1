import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student[] stdArr = new Student[10];

        stdArr[0] = new Student("Jange", 1);
        stdArr[1] = new Student("Ashley", 2);
        stdArr[2] = new Student("Nathan", 3);
        stdArr[3] = new Student("Oggst", 4);
        stdArr[4] = new Student("Michael", 5);
        stdArr[5] = new Student("James", 6);
        stdArr[6] = new Student("Tony", 7);
        stdArr[7] = new Student("Winston", 8);
        stdArr[8] = new Student("Peter", 9);
        stdArr[9] = new Student("Zoink", 10);

        printArr(stdArr);
        System.out.println();

        InsertionSort.knuthShuffle(stdArr);
        printArr(stdArr);
        System.out.println();

        InsertionSort.sort(stdArr, Student.BY_NAME);
        printArr(stdArr);
        System.out.println();

        InsertionSort.sort(stdArr, Student.BY_SECTION);
        printArr(stdArr);
        System.out.println();
    }

    private static void printArr(Student[] arr) {
        for(int i = 0; i < arr.length; i++) { arr[i].print(); }
    }
}