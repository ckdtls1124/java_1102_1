package org.study.oop;

public class CarBasic {

	private String carName;
	private int carYear;
	private int carCoin;
	public static final String CARPROJECT="CAR2022";

	//	build constructor
	public CarBasic() {
		System.out.println(CARPROJECT);
	}

	//	only needs 2 attributes to setter
	public CarBasic(String name) {
		System.out.println(CARPROJECT);
		this.carName=name;
	}

	//	only needs 1 attributes to setter
	public CarBasic(String name, int year) {
		System.out.println(CARPROJECT);
		this.carName=name;
		this.carYear=year;
	}

	//	only needs 0 attributes to setter
	public CarBasic(String name, int year, int coin) {
		System.out.println(CARPROJECT);
		this.carName=name;
		this.carYear=year;
		this.carCoin=coin;
	}




	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public int getCarCoin() {
		return carCoin;
	}
	public void setCarCoin(int carCoin) {
		this.carCoin = carCoin;
	}

}
