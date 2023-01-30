package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Example {
	public Example() {
		System.out.println("Example :: Constructor");
		System.out.println("constructor ended");
	}
}
