package com.michael.exceptiondemo;


/**
 * 你可以灵活地选择注释代码来看运行效果
 * 
 * 
 * */
public class Person {

	private int age;
	
	public Person(){
		
	}
	
	public int getAge() {
		return age;
	}
	

//	/**
//	 * 运行时异常，会导致程序的奔溃
//	 * 
//	 * */
//	public void setAge(int age) {
//		
//		if(age < 0)
//		{
//			throw new RuntimeException("Sorry ，the age of person can not be a negative number");
//		}
//		this.age = age;
//	}
//	
//	/**
//	 * 运行时异常，会导致程序的奔溃，但是我们一般不这样做，一般采用的是RuntimeException
//	 * 
//	 * */
//	public void setAge(int age) {
//		
//		if(age < 0)
//		{
//			throw new Error("Sorry ，the age of person can not be a negative number");
//		}
//		this.age = age;
//	}
//	
//	/**
//	 * 一个checkedException,它不会导致你的程序奔溃，但是你需要对这个异常进行处理，处理有两种方式，
//	 * 
//	 * 一种是直接在本方法中进行try catch
//	 * 
//	 * 
//	 * */
//	public void setAge(int age) {
//		
//		if(age < 0)
//		{
//			
//			try {
//				throw new Exception("Sorry ，the age of person can not be a negative number");
//			} catch (Exception e) {
//				e.printStackTrace();
//				//这里还需要对异常进行处理.....
//			}
//		}
//		this.age = age;
//	}
	
	
	/**
	 * 一个checkedException,它不会导致你的程序奔溃，但是你需要对这个异常进行处理，处理有两种方式，
	 * 一种是将这个异常抛到调用这个方法的地方去处理.
	 * 这个时候你需要在你的方法后加上 throws Exception
	 * 
	 * 
	 * */
	public void setAge(int age) throws Exception{
		
		if(age < 0)
		{
			throw new Exception("Sorry ，the age of person can not be a negative number");
		}
		this.age = age;
	}
	
//	/**
//	 * 这种做法是不推荐的，虽然可以，但是你会发现，由于Throwable是Error和Exception的父类，
//	 * 也就是说，如果发生错误了，你甚至都不知道这个错误是Error还是Exception，这肯定不是我们使用异常处理想达到的目的
//	 * 
//	 * */
//	public void setAge(int age){
//		
//		if(age < 0)
//		{
//			try {
//				throw new Throwable("Sorry ，the age of person can not be a negative number");
//			} catch (Throwable e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		this.age = age;
//	}
//	
//	public void setAge(int age) throws Throwable{
//		if(age < 0){
//			throw new Throwable("Sorry ，the age of person can not be a negative number");
//		}
//		this.age = age;
//	}
}
