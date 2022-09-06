// Given a signed 32 bit integer X, return x with its digits reversed. 
// If reversing X causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1],
// then return 0. Assume the environment does not allow you to store 64 bit integers(signed or unsigned).
// Input: x = 123
// Output: 321

import java.util.*;

class ReverseInteger {
    public static int reverse(int n) {
        int rev = 0;
        while(n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = reverse(n);
        System.out.println(res);
        sc.close();
    }
}