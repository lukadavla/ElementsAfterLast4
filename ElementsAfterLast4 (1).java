import java.util.Arrays;

public class ElementsAfterLast4 {
    public static void main(String[] args) {
        int[] array = {4, 1, 4, 2};
        int[] result = elementsAfterLast4(array)
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] elementsAfteLast4(int[] nums) {
        int last4Index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                last4Index = i;
            }
        }

        if (last4Index != -1 && last4Index < nums.length - 1) {
            return Arrays.copyOfRange(nums, last4Index + 1, nums.length);
        } else {
            return new int[0];
        }
    }
}
