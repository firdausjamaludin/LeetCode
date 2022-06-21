import java.util.Arrays;

public class RomantoInterger {
    public static void main(String args[]) {
        String s = "IIIIIIIIIIIIIIII";
        String s1 = "LVIII";
        String s2 = "MCMXCIV";

        System.out.println("Final answer " + romanToInt(s));

    }

    public static int romanToInt(String s) {
        int[] nums = new int[s.length()];
        int sum = 0;
        if (s.length() < 1 || s.length() > 15) {
            return sum;
        }
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M': {
                    if ((i - 1) > -1 && (s.charAt(i - 1) == 'C')) {
                        nums[i] = 800;
                        break;
                    } else {
                        nums[i] = 1000;
                        break;
                    }
                }
                case 'D':
                    if ((i - 1) > -1 && (s.charAt(i - 1) == 'C')) {
                        nums[i] = 300;
                        break;
                    } else {
                        nums[i] = 500;
                        break;
                    }
                case 'C':
                    if ((i - 1) > -1 && (s.charAt(i - 1) == 'X')) {
                        nums[i] = 80;
                        break;
                    } else {
                        nums[i] = 100;
                        break;
                    }
                case 'L':
                    if ((i - 1) > -1 && (s.charAt(i - 1) == 'X')) {
                        nums[i] = 30;
                        break;
                    } else {
                        nums[i] = 50;
                        break;
                    }
                case 'X':
                    if ((i - 1) > -1 && (s.charAt(i - 1) == 'I')) {
                        nums[i] = 8;
                        break;
                    } else {
                        nums[i] = 10;
                        break;
                    }
                case 'V':
                    if ((i - 1) > -1 && (s.charAt(i - 1) == 'I')) {
                        nums[i] = 3;
                        break;
                    } else {
                        nums[i] = 5;
                        break;
                    }
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        for (int j : nums) {
            sum = sum + j;
        }
        if (sum >= 1 && sum <= 3999) {
            return sum;
        } else {
            return 0;
        }
    }
}
