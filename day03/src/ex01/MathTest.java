package ex01;

//import java.lang.Math;
//import java.lang.System;

//import java.lang.*; // 이문장은 기본적으로 생략되어 있음

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.max(10, 100));
		System.out.println(Math.min(10, 100));
		
		System.out.println(Math.ceil(3.3));
		System.out.println(Math.ceil(-3.3));
		
		System.out.println(Math.floor(-3.3));
		System.out.println(Math.floor(3.3));
		
		System.out.println(Math.round(3.32344));
		System.out.println(Math.round(3.52344));
		
		System.out.println("------------");
//		System.out.println((int)Math.random()*6); // 0만 출력
		System.out.println((int)(Math.random()*6));
		
	}
}
