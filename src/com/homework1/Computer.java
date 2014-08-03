package com.homework1;

public class Computer {
	int ComputerNum = 2344;
	String ComputerName = "Tawhida's Desk TOP";
	
	public void getComputerNum () {
		System.out.println(ComputerNum);
		
	}
	
	public void getComputerName(){
		System.out.println(ComputerName);
	}
	
	public int getTotlaComputerNumber(int Desktop, int Laptop){
		int total = Desktop + Laptop;
		System.out.println(total);
		return total;
	}
	
	}


