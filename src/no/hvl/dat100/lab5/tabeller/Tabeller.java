package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		int i = 0;
		for (int v : tabell) {
			i++;
			System.out.print(v);
			if (i != tabell.length) {
				System.out.print(",");
			}
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		int i = 0;
		String prnt = "[";
		for (int v : tabell) {
			i++;
			prnt += v;
			if (i != tabell.length) {
				prnt += ",";
			}
		}
		prnt += "]";

		return prnt;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	public static int summerWhile(int[] tabell) {
		int sum = 0;
		int counter = 0;
		while (counter < tabell.length) {
			sum += tabell[counter];
			counter++;
		}
		return sum;
	}

	public static int summerForEach(int[] tabell) {

		int sum = 0;
		for (int v : tabell) {
			sum += v;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean lik = false;
		for (int v : tabell) {
			if (v == tall) {
				lik = true;
			}
		}
		return lik;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				pos = i;
				break;
			}
		}
		return pos;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] newArray = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			newArray[i] = tabell[tabell.length - i - 1];
		}
		return newArray;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int i = 0;
		int[] newArray = new int[tabell1.length + tabell2.length];
		for (; i < tabell1.length; i++) {
			newArray[i] = tabell1[i];
		}
		for (; i < tabell1.length + tabell2.length; i++) {
			newArray[i] = tabell2[i - tabell1.length];
		}
		return newArray;
	}
}
