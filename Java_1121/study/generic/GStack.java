package org.study.generic;

public class GStack<T> {
	
	public int index;
	public Object[] oStack;
	
	public GStack() {
		index=0;
		oStack=new Object[10];
	}
	
	public void push(T element) {
		if (index==10) {
			return;
		}
		
		oStack[index]=element;
		
		index++;
	}
	
	public T pop() {
		if (index==0) {
			return null;
		}
		
		index--;
		return (T) oStack[index];
		
	}
}
