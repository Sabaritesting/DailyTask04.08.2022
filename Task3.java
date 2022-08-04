package Task7;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 2; i < 100; i++) {

	            if (is_Prime(i) && is_Prime(i + 2)) {
	                System.out.printf("(%d, %d)\n", i, i + 2);
	            }
	}

}

	private static boolean is_Prime(int i) {
		// TODO Auto-generated method stub
		 if (i < 2) return false;

	        int n = 0;
			for (int i1 = 2; i1 <= n / 2; i1++) {

	            if (i1 % n == 0) return false;
	        }
		return true;
	}
}