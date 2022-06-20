import java.util.Arrays;

public class palindrome {
    public static void main(String args[]) {
        int x = -1234567899;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        // 1ST TRY
        // even it is right asnwer but the approach is wrong
        // for negative number should be false for example
        // -121 with 121-
        // but my approach maintain the negative value only reverse the number
        // -121 to -121
        // since Negative numbers are not palindromic

        // String xString = String.valueOf(Math.abs(x));
        // String[] xStringArr = xString.split("", 0);
        // String y = "";
        // long z = 0;
        // int n = xStringArr.length;

        // for (int i = n - 1; i > -1; i--) {
        // if (x != z) {
        // y = y + xStringArr[i];
        // z = Long.parseLong(y);
        // }
        // }
        // return x == z;

        // 2ND TRY
        // take too long time because of conversion from int to string
        // then from string to to string array
        // then string to int

        // String xString = String.valueOf(x);
        // String[] xStringArr = xString.split("", 0);
        // String y = "";
        // long z = 0;
        // int n = xStringArr.length;

        // if (x < 0)
        // return false;

        // for (int i = n - 1; i > -1; i--) {
        // y = y + xStringArr[i];
        // z = Long.parseLong(y);
        // }
        // return x == z;

        // Vote answer
        // Learn new way to reverse number using modulus %
        // work only for number
        int reverse = 0, temp = x;
        if (x < 0) // this condition only for Palindrome
            return false;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println(reverse);
        return reverse == x;
    }
}
