package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class HelloLombok {
	private final String Hello;
	private final int lombok;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloLombok helloLombok = new HelloLombok("헬로", 5);

		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}

}
