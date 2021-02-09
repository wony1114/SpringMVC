package com.example.demo.dwh.domain;



public class MainTest{
	public static void main(String[] args) {
		System.out.println("-------");
		DummyGenerator bs = new DummyGenerator();
		System.out.println(bs.makeUserid());
	}
}