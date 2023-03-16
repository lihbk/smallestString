package com.example.smallestString;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmallestStringApplication {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		String pat = "ork";

		System.out.print(SmallestString.findSmallestSubstring(str, pat));
	}

}
