package com.sun.java.util.jar.pack;
/**
 * Java允许在定义中包含类型参数，这种定义被称为泛型
 * 作为类型参数的类型必须为一个类类型，不能为int，double或char这样的基本类型
 * 可以定义带类型参数的类，类型参数包含在类定义头部类名后的尖括号中。
 * 但在构造器头部不适用类型参数
 * 
 * */


public class Sample<T> {
	private T data;
	public Sample(){	//构造器头部不需要再尖括号中包含类型参数
		data = null;
	}
	public void setData(T newvalueT){
		data = newvalueT;
	}
	public T getData(){
		return data;
	}
}
