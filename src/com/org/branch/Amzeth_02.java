package com.org.branch;

public class Amzeth_02 {

	public static void main(String[] args) {

		int a = 153, i = 0, j = 0, sum = 0, temp = a;
		while (a > 0) {
			i = a % 10;
			sum = sum + (i * i * i);
			a = a / 10;
		}

		if (temp == sum) {
			System.out.println("Armstrong Number");
		}

		else {
			System.out.println("Not an Armstrong Number");
		}

	}

	public void selectDropdown() {
		System.out.println("User A created successfully");
	}

	public void launchBrowser() {
		System.out.println("User A created successfully");
	}

	public void selectDropDown() {
		System.out.println(" Select DropDown");
	}

	public void selectDrop() {
		System.out.println("Select Drop");
	}

}
