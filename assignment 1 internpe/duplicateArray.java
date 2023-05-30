import java.util.HashSet;

public class duplicateArray {
    public static Integer duplicateArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5};
        Integer duplicate =duplicateArray(arr);
        System.out.println("Duplicate: " + duplicate);
    }
}