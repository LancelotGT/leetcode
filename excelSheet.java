public class excelSheet {
	public static int titleNumber(String s) {
		int n = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println((int) s.charAt(i));
			n = n + (int) ((s.charAt(i) - 64) * Math.pow(26, s.length() - i - 1));
		}
		return n;
	}

	public static void main(String[] args) {
		// a simple test client
		if (args.length < 1) {
			System.out.println("Usage: java excelSheet str");
		}
		else {
			System.out.println(titleNumber(args[0]));
		}
	}
}