
import java.util.Scanner;

public class DecimalToBinary {
    public static void toBinary(int N) {
        int[] binaryArray = new int[100];
        int index = 0;

        while (N > 0) {
            binaryArray[index++] = N % 2;
            N = N / 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binaryArray[i]);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int N = scanner.nextInt();

        toBinary(N);
    }
}

//    public static String convertArrayToString(int[] binaryArray) {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < binaryArray.length; i++) {
//            stringBuilder.append(binaryArray[i]);
//        }
//
//        String binaryString = stringBuilder.toString();
//
//        return binaryString;
//    }
//}
