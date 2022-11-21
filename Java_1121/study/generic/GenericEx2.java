package org.study.generic;

	
	class Gen1{
		private int num;
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num=num;
		}
	}
	
	class Gen2{
		private String num;

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}	
	}
	
	
//	Generic Type class
	class Gen3<T>{
		private T num;

		public T getNum() {
			return num;
		}

		public void setNum(T num) {
			this.num = num;
		}
	}
	
public class GenericEx2 {
	public static void main(String[] args) {
		
		Gen1 a1=new Gen1();
		a1.setNum(444);
		a1.getNum();
		
		Gen2 a2=new Gen2();
		a2.setNum("dfsafsda");
		a2.getNum();
		
//		Primitive types aren't allowed.
		Gen3<Integer> a3=new Gen3<Integer>();
		a3.setNum(243242);
		System.out.println(a3.getNum());
		
		Gen3<Float> a4=new Gen3<Float>();
		a4.setNum(0.3424f);
		System.out.println(a4.getNum());
		
		
		if (a4.getNum() instanceof Float) {
			System.out.println("this is String");
		}else {
			System.out.println("no it's not");
		}
	}
	
}
