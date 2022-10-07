package basic;

public class CurrencyConverter {
	double[] exchangeRates = new double[] { 63, 58.3, 69, 6, 3, 98.5, 54 };

	void printCurrencies() {
		System.out.println("rupee:" + exchangeRates[0]);
		System.out.println("dirham:" + exchangeRates[1]);
		System.out.println("real:" + exchangeRates[2]);
		System.out.println("chilean_peso:" + exchangeRates[3]);
		System.out.println("mexican_peso:" + exchangeRates[4]);
		System.out.println("_yen:" + exchangeRates[5]);
		System.out.println("$australian:" + exchangeRates[6]);

	}

	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();
	}

}
