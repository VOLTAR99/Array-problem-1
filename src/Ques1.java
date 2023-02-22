//Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a
//pair in the array whose absolute difference is exactly x.(n>1)


import java.util.Scanner;
class A{
    static String difference(int[] arr, int a){
        String ans="no";
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]==a){
                    ans="yes";
                    break;
                }
            }
        }
        return ans;
    }
}
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A b=new A();
        System.out.println("enter the size of the array:");
        int x=sc.nextInt();
        int[] arr1=new int[x];
        System.out.println("Enter the elements and elements should be in sorted manner:");
        for(int i=0;i<x;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the element whom difference is to be checked:");
        int c=sc.nextInt();
        System.out.println("Availability:"+b.difference(arr1,c));
    }
}
