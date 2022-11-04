package org.java.variableex;

public class Variable01 {
	public static void main(String[] args) {


/* 
 여러줄 주석 l
 * 
 * 
 */

//정수형
byte b=10; //->byte형의 변수 b를 선언한다.
       //(정수가 아닌 데이터를 초기화 하면 작동하지 않는다.)
	//변수에 특정 데이터로 초기화 하면, 메모리에 할당된다.

byte b2=1; //byte형의 변수 b2를 선언하고 10으로 초기화 했다.
short s=10; //short형의 변수 s를 선언하고 10으로 초기화 했다.
int i=10; //int형의 변수 i를 선언하고 10으로 초기화 했다.
long l=10; // long형의 변수 l을 선언하고 10으로 초기화 했다.

//실수형

float f=1.1f; //float형의 변수 f를 선언하고 1.1로 초기화 했다.
			  //1.1은 double 자료형이라서, float로 선언하고자 한다면, 1.1f로 선언해야 한다.
double d=1.1;//double형의 변수d를 선언하고 1.1로 초기화 했다.

//문자형
char ch='a'; //char형의 변수 ch를 선언하고 'a'로 초기화했다.
			 //""로 문자를 표시하면 안된다.

//논리형
boolean bool=true;
boolean bool1=false;


//콘솔에 출력
System.out.println("자바의 기본 자료형");
System.out.println(f);
f=1.2f; //중간에 데이터를 재 초기화 할 수 있다.
//byte print
System.out.println(b2);
//short print
System.out.println(s);
//int print
System.out.println(i);
//long print
System.out.println(l);
//double print
System.out.println(d);
//char print
System.out.println(ch);
//boolean print
System.out.println(bool);
//boolean print
System.out.println(bool1);

System.out.println("abd의 값은"+l);//문자열과 변수의 값을 한번에 출력해준다.
//?? +연산자는 문자열과 변수를 이어준다. 그렇다면 서로다른 자료형은??

	
	}
}

