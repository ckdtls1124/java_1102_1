package org.study.oop;

public class CarBasicInfo {
	
//	Attributes, fields
	public String carName;
	public int carPrice;
	public String carColor;
	public int carDisplacement;
	public int carYear;
	
//	기본생성자 -> 생략하면 자동으로 생성
	
	
	
//	Instance Method -> new를 이용하여 객체를 생성하지 않으면 사용할 수 없다.
	public void carBasicInfo() {
		System.out.println("이름: "+carName);
		System.out.println("가격: "+carPrice);
		System.out.println("색상: "+carColor);
		System.out.println("배기량: "+carDisplacement);
		System.out.println("연식: "+carYear);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
