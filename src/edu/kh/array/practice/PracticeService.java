package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

  public void practice1(){
	
	    // 길이가 9인 배열 선언 및 할당
	    int[] arr = new int[9];

	    // 배열의 각 인덱스에 1부터 9까지 순서대로 대입
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = i + 1;
	    }

	    // 배열의 값을 출력
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }

	    // 짝수 번째 인덱스의 합 계산
	    int  sum = 0;
	    for (int i = 0; i < arr.length; i += 2) {
	        sum += arr[i];
	    }

	    // 짝수 번째 인덱스의 합 출력
	    System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	  
  }
  public void practice2() {
	  int[] arr = new int[9];
	 
	  for(int i = 9; i>=1; i--) {
		 arr[i]=i-1;
		
	  }
	  for(int i = 0; i<arr.length; i--) {
		  System.out.print(arr[i]+ " ");
	  }
	  int sum = 0;
	  for(int i = 1; i<=arr.length; i+=2) {
		 sum+=arr[i]; 
	  }

	  System.out.println("홀수 번째 인덱스 합 : "+ sum);
	  
	  
	  
  }
  public void practice3() {
	  System.out.println("양의 정수 : " );
	  Scanner sc = new Scanner(System.in);
	  int input = sc.nextInt();
	  int arr[] = new int[input];
	  for(int i = 0; i<arr.length; i++) {
		 arr[i]+=i+1;}
	  
	  for(int i = 0; i<arr.length; i++) {
		  System.out.print(arr[i] + " ");
		  
	  }  
	  
  }
  public void practice4() {
	  int[] arr = new int[5];
	  Scanner sc = new Scanner(System.in);
	  for(int i =0;i<arr.length;i++ ) {
		  System.out.println("입력" + " " + i + " "+ ":");
		  int input = sc.nextInt();
		  arr[i] = input;
	  }
	
	  System.out.println("검색할 값 : ");
	  int input = sc.nextInt();
	  boolean flag = false;
	  for(int i =0; i<arr.length; i++) {
		  if(arr[i] == input) {
			  System.out.println("인덱스 : "+ i );
			flag = true;
		  }
		  
	}
	if(!flag){System.out.println("일치하는 값이 존재하지 않습니다.");
	  
	}
	  
	  
  }
  public void practice5() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("문자열 : ");
	  String input = sc.nextLine();
	  char[] arr = new char[input.length()]; 
	  for(int i =0; i<arr.length; i++) {
		  arr[i]=input.charAt(i);
	  }
	  System.out.println("문자 : ");
	  char ch = sc.next().charAt(0);
	  
	  for(int i = 0; i<arr.length; i++) {
		  if(arr[i]==ch) {
			//  System.out.
		  }
	  }
	  
  }
  
  public void practice6() {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("정수 : ");
	  int input = sc.nextInt();
	  int[] arr = new int[input];
	  for(int i=0;i<arr.length; i++) {
		 arr[i]=input;
		  System.out.println("배열"+ i +" 번째 인덱스에 넣을 값 :");
	  }
	  int input1 = sc.nextInt();
	  
	  
	 
  }
  
  
  public void practice7() {
	  
	  
  } 
  
}
