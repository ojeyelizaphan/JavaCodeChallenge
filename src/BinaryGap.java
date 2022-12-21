import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryGap {
    public static int solution(int N){
        //step 1: convert the integer to its binary equivalent
        String binaryString = Integer.toBinaryString(N);

        //step 2: iterate through every character of the string
        List indexList = new ArrayList();
        for (int i = 0; i < binaryString.length(); i++){
            if (binaryString.charAt(i) == '0') continue;
            indexList.add(i);
        }

        //step 3 : finding the difference in 1s
        int longestDifference = 0;
        for (int i = 0; i<indexList.size()-1; i++){
            int indicesDifference = (int) indexList.get(i+1) - (int)indexList.get(i) - 1;
            longestDifference = Math.max(longestDifference,indicesDifference);
        }

        return longestDifference;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int N = scanner.nextInt();
        // Function call
        System.out.println(solution(N));

    }
}
