package Projects_03_;

import java.util.Scanner;

public class getPopulation {

	/*
	 * Method name is populationOfCountry
	 * 
	 * This method will get 1 String array(countryNames) 1 int array
	 * (countryPopulations) and 1 String (str)
	 * 
	 * countryNames is Country names
	 * 
	 * countryPopulations is Country population
	 * 
	 * if str is contained in the countryNames return the population
	 * 
	 * 
	 * For example:
	 * 
	 * countryNames = {"USA" ,"Mexico" ,"Canada"}
	 * 
	 * countryPopulations = {100000 , 120000 , 130000}
	 * 
	 * str = "Mexico"
	 * 
	 * return should be 120000
	 * 
	 * NOTE : if str is not in the countryNames array return -1
	 */

	/*
	 * Method adi populationOfCountry Bu method 1 String array(countryNames) , 1 int
	 * array (countryPopulations) ve 1 String (str) alacak countryNames ulke
	 * isimleri countryPopulations ulke nufuslari Eger str ulke isimleri iceriyorsa
	 * ulke nufusunu return et Ornegin; countryNames = {"USA" ,"Mexico" ,"Canada"}
	 * countryPopulations = {100000 , 120000 , 130000} str = "Mexico" return 120000
	 * olmali NOT : eger str icin verilen ulke countryNames icinde yoksa return -1
	 * olmali
	 */

	String name;
	long population;
	String language;
	String area;
	String menageStyl;
	String capital;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String Giriniz");

		getPopulation usa = new getPopulation();
		usa.name = "USA";
		usa.population = 320000000;
		usa.language = "English";
		usa.area = "America";
		usa.menageStyl = "Republic";
		usa.capital = "Washington";

		getPopulation mxc = new getPopulation();
		mxc.name = "MEXICO";
		mxc.population = 120000000;
		mxc.language = "Spanish";
		mxc.area = "America";
		mxc.menageStyl = "Republic";
		mxc.capital = "Mexsico City";

		getPopulation cnd = new getPopulation();
		cnd.name = "CANADA";
		cnd.population = 38000000;
		cnd.language = "English";
		cnd.area = "America";
		cnd.menageStyl = "Republic";
		cnd.capital = "Toronto";

		getPopulation tr = new getPopulation();
		tr.name = "TURKEY";
		tr.population = 80000000;
		tr.language = "Turkish";
		tr.area = "Middle East";
		tr.menageStyl = "Republic";
		tr.capital = "Ankara";

		getPopulation fnld = new getPopulation();
		fnld.name = "FINLAND";
		fnld.population = 5500000;
		fnld.language = "Finnish";
		fnld.area = "Europa";
		fnld.menageStyl = "Republic";
		fnld.capital = "Helsinki";

		getPopulation ulke[] = { usa, mxc, cnd, tr, fnld };

		System.out.println(
				"Lutfen hakkinda bilgi almak istediginiz ulkenin ismini giriniz\nUSA\nMEXICO\nCANADA\nTURKEY\nFINLAND\n------------ ");
		String aranan = scan.next();

		getirUlke(aranan, ulke);
		if (getirUlke(aranan, ulke) == -1) {
			System.out.println("Girilen ulke bulunamadi");
		} else {
			yazdir(getirUlke(aranan, ulke), ulke);
		}

		scan.close();
	}

	public static void yazdir(int a, getPopulation[] ulke) {
		System.out.println("        ARANAN ULKE");
		System.out.println("           " + ulke[a].name);
		System.out.println("Ulke          : " + ulke[a].name + "\n" + "Baskenti      : " + ulke[a].capital + "\n"
				+ "Kitasi        : " + ulke[a].area + "\n" + "Dili          : " + ulke[a].language + "\n"
				+ "Nufusu        : " + ulke[a].population + "\n" + "Yonetim sekli : " + ulke[a].menageStyl);

	}

	public static int getirUlke(String s, getPopulation[] ulke) {

		for (int i = 0; i < ulke.length; i++) {
			if (ulke[i].name.equals(s)) {

				return i;
			}

		}
		return -1;
	}

}

/*
 * if (ulke[i].name.equals(s)) { System.out.println("getir ulke if calisti");
 * return i; }
 */

/*
 * for (int a = 0; a < ulke.length; a++) { System.out.println(ulke[a].name +
 * "\n" + ulke[a].capital + "\n" + ulke[a].area + "\n" + ulke[a].language + "\n"
 * + ulke[a].population + "\n" + ulke[a].menageStyl); }
 */