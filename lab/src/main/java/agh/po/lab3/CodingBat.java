
package agh.po.lab3;

public class CodingBat {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        System.out.println(cb.sleepIn(false, false));
        System.out.println(cb.diff21(19));
        System.out.println(cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(cb.helloName("Ola"));
    }
}