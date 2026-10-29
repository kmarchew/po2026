package agh.po.lab3;
import java.util.Arrays;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb=new CodingBat();

        System.out.println("monkeyTrouble(true, true) → true: " + cb.monkeyTrouble(true, true));
        System.out.println("monkeyTrouble(false, false) → true: " + cb.monkeyTrouble(false, false));
        System.out.println("monkeyTrouble(true, false) → false: " + cb.monkeyTrouble(true, false));

        System.out.println("sumDouble(1, 2) → 3: " + cb.sumDouble(1, 2));
        System.out.println("sumDouble(3, 2) → 5: " + cb.sumDouble(3, 2));
        System.out.println("sumDouble(2, 2) → 8: " + cb.sumDouble(2, 2));

        System.out.println("twoChar(\"java\", 0) → \"ja\": " + cb.twoChar("java", 0));
        System.out.println("twoChar(\"java\", 2) → \"va\": " + cb.twoChar("java", 2));
        System.out.println("twoChar(\"java\", 3) → \"ja\": " + cb.twoChar("java", 3));

        int[] wynik1 = cb.frontPiece(new int[]{1, 2, 3});
        System.out.println("frontPiece([1, 2, 3]) -> " + Arrays.toString(wynik1));

        int[] wynik2 = cb.frontPiece(new int[]{1, 2});
        System.out.println("frontPiece([1, 2]) -> " + Arrays.toString(wynik2));

        int[] wynik3 = cb.frontPiece(new int[]{1});
        System.out.println("frontPiece([1]) -> " + Arrays.toString(wynik3));

    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        else if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }

    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        return new int[] { nums[0], nums[1] };
    }




}
