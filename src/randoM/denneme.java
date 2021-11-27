package randoM;

public class denneme {

	public static void main(String[] args) {
		String[][] arr = { { "A", "B", "C" }, { "D", "E" } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
				if (arr[i][j].equals("B")) {
					System.out.println("Flag1");
					continue;
				} // if sonu
				System.out.println("Flag2");
			} // j foru sonu
			System.out.println("Flag3");
			continue;

		} // i foru sonu

	}// main sonu

}// class sonu
