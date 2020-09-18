package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		System.out.println("[ ");
		for (int[] patrise : matrise) {
			System.out.print("[");
			for (int v : patrise) {
				System.out.print(v + " ");
			}
			System.out.println("]");
		}
		System.out.println(" ]");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String arrayString = "";
		for (int[] patrise : matrise) {
			for (int v : patrise) {
				arrayString += v + " ";
			}
			arrayString += "\n";
		}
		return arrayString;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise;
		nyMatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			nyMatrise = new int[matrise.length][matrise[i].length];
		}

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					lik = false;
				}
			}
		}
		return lik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] nyMatrise;
		nyMatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			nyMatrise = new int[matrise.length][matrise[i].length];
		}
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[j][i];
			}
		}
		return nyMatrise;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// antar at tabell a er like stor som b
		int[][] nyMatrise;
		nyMatrise = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			nyMatrise = new int[a.length][a[i].length];
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				nyMatrise[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
			}
		}
		return nyMatrise;

	}
}
