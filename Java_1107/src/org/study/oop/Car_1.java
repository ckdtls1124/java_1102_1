package org.study.oop;

public class Car_1 {
	public static void main(String[] args) {
		
		CarBasicInfo car_1=new CarBasicInfo();
		car_1.carName="첫번째 자동자";
		car_1.carPrice=4900000;
		car_1.carColor="Red";
		car_1.carDisplacement=4500;
		car_1.carYear=1994;
		
		
		CarBumper car_1_bumper=new CarBumper();
		car_1_bumper.carBumperName="첫번째 자동차 범퍼";
		car_1_bumper.carBumperPrice=200;
		
		CarHandle car_1_handle=new CarHandle();
		car_1_handle.carHandleName="첫번째 자동차 핸들";
		car_1_handle.carHandlePrice=20;
		
		CarChain car_1_chain=new CarChain();
		car_1_chain.carChainName="첫번째 자동차 체인";
		car_1_chain.carChainPrice=40;
		
//		각 클래스에 속성을 입력하고 메서드 실시
		car_1.carBasicInfo();
		car_1_bumper.carBumperInfo();
		car_1_handle.carHandleInfo();
		car_1_chain.carChainInfo();
		
		
	}
}
