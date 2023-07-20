package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
  
	// 얕은 복사(shallow) 
	// -> 주소를 복사하여 서로 다른 두 변수가 
	//하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사방법
	public void shallowCopy() {
		int[] arr = {1,2,3,4,5};
		
		//얕은 복사 진행
		int[] copyArr = arr; // 주소만 복사 
		
		//배열 값 변경
		System.out.println("변경 전 ");
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("copy : "+Arrays.toString(copyArr));
		
		// 얕은 복사한 배열의 값을 변경해보자
		copyArr[2] = 99;
		
	}
	
}
