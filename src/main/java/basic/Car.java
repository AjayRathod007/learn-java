package basic;

public class Car {
	public double getSalePrice(String makeAndModel, int yearManufactured, double milesDriven, int airBagsCount,
			boolean hasAbs, boolean hasEbd, boolean hasRearViewCamera, boolean hasSunRoof, boolean hasAutoAc,
			boolean hasAccidentHistory) {

		double salePrice = getPrice(makeAndModel, yearManufactured);
		int currentYear = 2019;
		int ageOfCar = currentYear - yearManufactured + 1;
		System.out.println("age of car:" + ageOfCar);
		if (ageOfCar <= 10) {
			double price = salePrice * ageOfCar * 0.05;
			salePrice = salePrice - price;
		} else {
			return salePrice * 0.1;
		}
		System.out.println("salePrice after depriciation" + salePrice);
		if (!(airBagsCount <= 2 && hasAbs  && hasEbd)) {
			salePrice = salePrice - 1000;
		}
		
		System.out.println("salePrice after accounting for security features:" + salePrice);
		if (hasRearViewCamera == true && (hasSunRoof || hasAutoAc)) {
			salePrice = salePrice + 500;
		} 
		
		System.out.println("salePrice after accounting comfort features" + salePrice);
		if (hasAccidentHistory) {
			salePrice = salePrice - 500;
		}
		System.out.println("salePrice after accounting the accident" + salePrice);
		double expectedMilesDriven = ageOfCar * 10000.0;
		double additionalMiles = milesDriven - expectedMilesDriven;
		if (additionalMiles > 1000 && additionalMiles <= 10000) {
			salePrice = salePrice - 500;
		}
		if (additionalMiles > 10000 && additionalMiles <= 30000) {
			salePrice = salePrice - 1000;
		}
		if (additionalMiles > 30000) {
			salePrice = salePrice - 1500;
		}
		System.out.println("salePrice after accounting milesDriven" + salePrice);
		return salePrice;
	}

	private double getPrice(String makeAndModel, int yearManufactured) {
		if (makeAndModel.equalsIgnoreCase("Ford ecosport")) {
			return 20000.0;
		} else if (makeAndModel.equalsIgnoreCase("Honda city")) {
			return 30000.0;

		} else if (makeAndModel.equalsIgnoreCase("Toyota")) {
			return 40000.0;

		}
		return 50000.0;
	}

	public static void main(String[] args) {
		Car car = new Car();
		double salesPrice = car.getSalePrice("Ford ecosport", 2018, 20000.0, 2, true, false, true, false, false, true);

	}
}
