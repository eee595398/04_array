package edu.kh.array.practice;

public class PracticeService {

  public void practice1(){
	
	  int[] arr = new int[9];
	  int sum=0;
	  for(int i=0; i<arr.length; i++) {
	     System.out.print(i+1 +" ");
	     
	     sum+=arr[i];
	  }
	  
	 System.out.println("\n짝수 번째 인덱스 합 : " +sum);
	  //public void ex9() {
	    // 길이가 9인 배열 선언 및 할당
	   // int[] arr = new int[9];

	    // 배열의 각 인덱스에 1부터 9까지 순서대로 대입
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = i + 1;
	    }

	    // 배열의 값을 출력
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }

	    // 짝수 번째 인덱스의 합 계산
	    int evenIndexSum = 0;
	    for (int i = 0; i < arr.length; i += 2) {
	        evenIndexSum += arr[i];
	    }

	    // 짝수 번째 인덱스의 합 출력
	    System.out.println("\n짝수 번째 인덱스 합 : " + evenIndexSum);
	  
  }
  
  
  
}
