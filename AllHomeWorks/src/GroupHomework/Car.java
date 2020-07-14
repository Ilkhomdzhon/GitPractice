package GroupHomework;

public abstract class Car {
		
	
	double carPrice;
		String color;
		Car(double carPrice, String color) {
			this.carPrice = carPrice;
			this.color = color;
		}
		public abstract double calculateSalePrice();
	
}
 class Sedan extends Car {
		int length;
		Sedan(double carPrice, String color, int length) {
			super(carPrice, color);
			this.length = length;
		}
		@Override
		public double calculateSalePrice() {
			double salePrice;
			if (length > 20) {
				salePrice = carPrice + (carPrice * 0.05);
			} else {
				salePrice = carPrice + (carPrice * 0.10);
			}
			System.out.print("Sedan sale price is ");
			return salePrice;
		}
	
 }
	class Truck extends Car {
		int weight;
		Truck(double carPrice, String color, int weight) {
			super(carPrice, color);
			this.weight = weight;
		}
		@Override
		public double calculateSalePrice() {
			double salePrice;
			if (weight > 2000) {
				salePrice = carPrice + (carPrice * 0.10);
			} else {
				salePrice = carPrice + (carPrice * 0.20);
			}
			System.out.print("Truck sale price is ");
			return salePrice;
		}
	}

	
	
	
