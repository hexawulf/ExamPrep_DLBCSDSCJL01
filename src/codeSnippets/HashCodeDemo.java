package codeSnippets;
/*
 * This loop calculates the hash code of a string based on its characters.
 * It is the same algorithm used internally by the Java String class.
 *
 * Algorithm:
 *   Start with hash = 0.
 *   For each character in the string:
 *     Multiply the current hash value by 31 (a small prime number)
 *     Add the Unicode value (int) of the current character.
 *
 * Why 31?
 *   - 31 is a prime number and helps in distributing hash values evenly.
 *   - It can be optimized using bit-shifts (31 * x = (x << 5) - x).
 *   - Small enough to avoid integer overflow in most cases.
 *
 * Key property:
 *   hash = s[0]*31ⁿ⁻¹ + s[1]*31ⁿ⁻² + ... + s[n-1]
 *   (done in a loop instead of exponentiation for performance)
 *
 * Note:
 *   The final hash is an int and may be negative due to integer overflow.
 *   Java handles this correctly for hash-based collections like HashMap.
 */

public class HashCodeDemo {

    public static void main(String[] args) {
        String input = "ABC"; // You can change this to test other strings
        printHashCodeSteps(input);
    }

    public static void printHashCodeSteps(String s) {
        int hash = 0;

        System.out.println("Calculating hashCode for: \"" + s + "\"");
        System.out.println("---------------------------------------");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int oldHash = hash;
            hash = 31 * hash + c;

            System.out.printf("Step %d: hash = 31 * %d + '%c' (%d) = %d\n",
                i, oldHash, c, (int) c, hash);
        }

        System.out.println("---------------------------------------");
        System.out.println("Final hashCode: " + hash);
    }
}
