public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.isEmpty()) return true;
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            char h = s.charAt(head);
            char t = s.charAt(tail);
            
            if (!Character.isLetterOrDigit(h)) {
                head++;
            }
            else if (!Character.isLetterOrDigit(h)) {
                tail--;
            } else {
                if (Character.toLowerCase(s.charAt(head++)) != Character.toLowerCase(s.charAt(tail++)))
                    return false;
            }
        }
        return true;
    }
}