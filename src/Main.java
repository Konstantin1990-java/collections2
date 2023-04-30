import java.util.*;

public class Main {
    private static final List<Integer> nums1 = new ArrayList<>(List.of(23, 14, 1, 45, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        for (int i : nums1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("******************");
    }

    public static void task2() {
        Collections.sort(nums1);
        int temp = Integer.MIN_VALUE;
        for (int i : nums1) {
            if (i % 2 == 0 && i != temp) {
                System.out.println(i);
                temp = i;
            }
        }
        System.out.println("******************");
    }

    public static void task3() {
        Set<String> strings = new HashSet<>(words);
        System.out.println(strings);
        System.out.println("************");
    }

    public static void task4() {
        Set<String> strings = new HashSet<>(words);
        System.out.println(words.size()-strings.size());
        System.out.println("******************");
    }
}