public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int curr = length - 1;
        do {
            digits[curr] = (digits[curr] + 1) % 10;
            curr--;
        }
        while (digits[curr + 1] == 0 && curr >= 0);
        
        if (digits[0] == 0) {
            int[] newDigits = new int[length + 1];
            newDigits[0] = 1;
            for (int i = 0; i < length; i++) {
                newDigits[i + 1] = 0;
            }
            return newDigits;
        }
        return digits;
    }
}