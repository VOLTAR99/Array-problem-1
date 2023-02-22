//Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//missing number from the first N integers. There are no duplicates in the list.
import java.util.Arrays;
import java.util.Scanner;
class C{

    static int missing(int[] arr,int N){
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }

        return ans;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        System.out.println("enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a-1];
        System.out.println("enter the elements:");
        for(int i=0;i<a-1;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        C obj =new C();
        int u= arr.length;
        System.out.println("Missing element:"+obj.missing(arr,u));

    }
}
