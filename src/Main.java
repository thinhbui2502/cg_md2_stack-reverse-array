
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Đảo ngược số nguyên
        Stack<Integer> reverseNumber = new Stack<>();
        int[] arrayNumbers = {3, 5, 6, 9};
        for (int value : arrayNumbers) {
            reverseNumber.push(value);
        }
        int i = 0;
        while (!reverseNumber.isEmpty()) {
            arrayNumbers[i] = reverseNumber.pop();
            i++;
        }
        System.out.println(Arrays.toString(arrayNumbers));

        //Đảo ngược chuỗi
        Stack<String> reverseString = new Stack<>();
        String inputString = "hastalavista";
        String[] arrayString = inputString.split("");
        for (String value : arrayString) {
            reverseString.push(value);
        }
        int index = 0;
        while (!reverseString.isEmpty()) {
            arrayString[index] = reverseString.pop();
            index++;
        }
        System.out.println(Arrays.toString(arrayString));
    }
}
