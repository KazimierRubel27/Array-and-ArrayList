import java.util.ArrayList;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 8, 3 };
        System.out.print("The array is ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println("");
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        double mean = (double) sum / arr.length;

        int smallest = 0;
        for (int number : arr) {
            if (number > smallest)
                ;
            smallest = number;
        }

        int biggest = 0;
        for (int number : arr) {
            if (number > biggest)
                ;
            biggest = number;
        }
        // Shift the array
        int[] shifted = new int[arr.length];
        int shift = 1;

        for (int i = 0; i < arr.length; i++) {

            shifted[(i % arr.length + arr.length + shift) % arr.length] = arr[i];
        }
        // Find the mode
        int mostCommon = arr[0];
        int indexMostCommon = 0;
        for (int t : arr) {
            int count = 0;
            for (int j : arr) {
                if (t == j) {
                    count++;
                }
            }
            if (count > indexMostCommon) {
                mostCommon = t;
                indexMostCommon = count;
            }
        }
        System.out.println("The mode is " + indexMostCommon);
        // Shift the array
        System.out.print("The shifted array is ");
        for (int t : shifted) {
            System.out.print(t + " ");
        }
        System.out.println("");
        System.out.println("The sum is " + sum);
        System.out.println("The mean is " + mean);
        System.out.println("The smallest number is " + smallest);
        System.out.println("The biggest number is " + biggest);
        // Reverse the array
        System.out.print("The array reversed is ");
        int[] newArr = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            newArr[j] = arr[i];
            j++;
        }

        for (int t : newArr) {

            System.out.print(t + "");

        }
        System.out.println("");

        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        // Add 10 random numbers to the list
        for (int i = 0; i < 10; i++) {
            int newNum = (int) (Math.random() * 10);
            numbersList.add(newNum);
        }
        int listSum = 0;
        // Print the list
        System.out.print("The arraylist is");
        System.out.println(numbersList);
        // Sum of the list
        for (int t : numbersList) {
            listSum += t;
        }
        System.out.println("The sum is " + listSum);
        // Mean of the list
        System.out.println("The mean is " + (double) listSum / numbersList.size());
        // Smallest of the list
        int listSmallest = numbersList.get(0);
        for (int t : numbersList) {
            if (t < listSmallest) {
                listSmallest = t;
            }
        }
        System.out.println("The smallest is " + listSmallest);
        // Biggest of the list
        int listBiggest = numbersList.get(0);
        for (int t : numbersList) {
            if (t > listBiggest) {
                listBiggest = t;
            }
        }
        System.out.println("The biggest is " + listBiggest);
        // Not repeating mode
        // Reverse the list
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        for (int i = numbersList.size(); i > 0; i--) {
            reverseList.add(numbersList.get(i - 1));
        }
        System.out.println("The list reversed is " + reverseList);
        // Shift the list over by a variable int
        int userShift = 1;
        ArrayList<Integer> shiftedList = new ArrayList<Integer>();
        for (int i = 0; i < numbersList.size(); i++) {
            shiftedList.add(numbersList.get((i + userShift) % numbersList.size()));
        }
        System.out.println("The shifted list is " + shiftedList);
    }
}