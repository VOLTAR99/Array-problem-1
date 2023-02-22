//Given an array of size n, find the total number of occurrences of given number x.
import java.util.Scanner;

class B{
    static int occurrence(int[] arr, int a){
        int count=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]==a){
                    count++;
                    }
            }
        return count;
        }
}
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        B obj=new B();
        System.out.println("enter the size of the array:");
        int x=sc.nextInt();
        int[] arr1=new int[x];
        System.out.println("Enter the elements :");
        for(int i=0;i<x;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the number for search:");
        int z=sc.nextInt();
        System.out.println("No of times:"+obj.occurrence(arr1,z));
    }
  }

