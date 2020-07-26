package com.wipro.javapractice;

public class UserCodeJava {

	static void method(String s1) {

		String out = "";
		String[] str1 = s1.split(" ");

	
		for (int i = 0; i < str1.length; i++) {
			if (i != str1.length - 1) {
				out += str1[i] + " ";
			} else {
				String s = str1[str1.length - 1];
				for (int j = s.length() - 1; j > 0; j--) {
					if (Character.isAlphabetic(s.charAt(j - 1))) {
						out += s.substring(0, j + 1);
						break;

					}
				}
			}
		}
		System.out.println(out.trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method("What went wrong????");
		method("I just!!! can!!! not!!! believe!!! it!!!");
		method("Oh my goodness!");
		method("I just cannot believe it.");
	}

}
