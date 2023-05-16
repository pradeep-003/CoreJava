package javaCodees;

import java.util.Scanner;
class ArraySearch
{
    int binarySearch(int[] arr, int low , int mid , int high , int key)
    {
        while(low <= high ){
            if (arr[mid] < key){
                low = mid + 1 ;
            } else if (arr[mid] == key) {
                return mid;
            } else{
                high = mid -1 ;
            }
            mid = ( low + high )/2 ;
            if (low > high)
            {
                return -1;
            }
        }
        return -1 ;
    }
}

public class BinarySearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scan.nextInt();
        }

        int middle =  ((numbers.length)-1)/2 ;

        System.out.println("Enter the value you want to find from array : ");

        int search = scan.nextInt();

        ArraySearch a = new ArraySearch();
        int s =  a.binarySearch(numbers , 0 , middle , numbers.length-1 , search);
        if(s == -1){
            System.out.println("value isn't present");
        }else {
            System.out.println("value is present at index : " + s);
        }
    }
}