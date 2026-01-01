class Solution {
    public int[] plusOne(int[] digits) {

        // Length of the input array
        int n = digits.length;

        // Result array of size n+1 to handle overflow cases like [9,9,9]
        int[] ans = new int[n + 1];

        // Carry initialized to 1 because we are adding one
        int c = 1;

        // Traverse digits from right to left (least significant to most)
        for (int i = n - 1; i >= 0; i--) {

            // Add carry to current digit
            digits[i] += c;

            // If digit becomes greater than 9, it turns into 0
            // and carry remains 1
            if (digits[i] > 9) {
                ans[i + 1] = 0;
            }
            // If digit is <= 9, store it and reset carry to 0
            else {
                c = 0;
                ans[i + 1] = digits[i];
            }
        }

        // If no carry is left, ignore the extra leading zero
        // and return array from index 1 to n
        if (c == 0) {
            return Arrays.copyOfRange(ans, 1, n + 1);
        }
        // If carry is still present, set most significant digit to 1
        // Example: [9] -> [1,0], [9,9] -> [1,0,0]
        else {
            ans[0] = 1;
        }

        // Return the final result
        return ans;
    }
}