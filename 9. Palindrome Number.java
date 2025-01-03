class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative, it can't be a palindrome
        if (x < 0) {
            return false;
        }
        
        // Reverse the number
        int original = x;
        int reversed = 0;
        
        while (x > 0) {
            int lastDigit = x % 10;  // Get the last digit
            reversed = reversed * 10 + lastDigit;  // Add it to the reversed number
            x /= 10;  // Remove the last digit
        }
        
        // Check if the original number is the same as the reversed number
        return original == reversed;
    }
}
