import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotation {
    public static int[] solution(int[] A, int K){
        //step one: for loop to make the rotations
        for (int i = 0; i < K; i++){
            //step two:loop through the array
            int lastElement = A[A.length-1];
            for (int j = A.length-2; j >= 0; j--){
               A[j+1] = A[j];
            }
            A[0] = lastElement;
        }

        return A;
    }

    public static void main(String[] args)
    {
        int[] B = {1, 2, 3, 4};
        int[] A = solution(B, 4);
        System.out.println(Arrays.toString(A));

    }
}
