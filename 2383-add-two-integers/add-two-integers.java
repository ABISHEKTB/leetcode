import java.util.Scanner;
class Solution {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println(result);
    }
}