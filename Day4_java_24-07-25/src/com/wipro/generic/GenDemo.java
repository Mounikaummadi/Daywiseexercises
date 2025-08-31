package com.wipro.generic;

public class GenDemo <T> {

	private T t;

	public GenDemo(T t) {
		this.t=t;
	
	}
	public T getData() {
		return t;
	}
	@Override
	public String toString() {
		return "GenDemo [t=" + t + ", getData()=" + getData() + "]";
	}
	
	

}
