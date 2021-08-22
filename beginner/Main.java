package beginner;

public class Main {

	public static void main1(String[] args) {
		//		int [] arr = new int[4];
		//
//				for(int i=0; i<arr.length; i++) {
//				arr[i] = i+1;		
//			}
//				for(int i=0; i<arr.length; i++) {
//					System.out.printf("arr[%d] = %d\n", i, arr[i]);
//				}
//				System.out.println();
		//	
//				arr[0] = arr[0] + 10;
//				arr[1] += 20;
//				arr[2] += 30;
//				
//				for(int i=0; i<arr.length; i++) {
//					System.out.printf("arr[%d] = %d\n", i, arr[i]);
//				}
//				System.out.println();

//				int [] card = new int [52];
//				
//				for(int i=0; i<card.length; i++) {
//					card [i] = i+1;
//				}
		//	
//				int rIndex=0;
//				int temp;
//				for(int i=0; i<100; i++) {
//					rIndex = (int)(Math.random()*51 +1);	
//					temp = card[0];
//					card[0] = card[rIndex];
//					card[rIndex] = temp;
		//
//				}
//				for(int i=0; i<7; i++) {
//					System.out.print(card[i] + " ");
//				}
			  
				//주사위 10번을 던진 결과를 , 짝수와 홀수를 구분해서 출력해 보세요. 
				//주사위를 100번 던져서 각 눈금이 나온 횟수를 세어 보세요. 
				
//				int even=0;
//				int odd=0;
//				
//				int [] totalArr = new int[10];
//				
//				for(int count=0; count<10; count++) {
//					int rNum = (int)(Math.random()*6 +1);			
//					totalArr[count] = rNum;
//					
//					System.out.printf("%d " ,rNum);
//					
//						if(rNum%2 == 0) {					
//							even++;		
//						}
//						if(rNum%2 != 0) {
//							odd++;
//						}		
//				}
//				
//				int [] evenArr = new int[even];
//				int [] oddArr = new int[odd];
//				
//				int oddCnt = 0;
//				int evenCnt = 0;
//				
//				for(int i=0; i < totalArr.length; i++) {
//					
//					if((totalArr[i]%2) == 0) {
//						
//						evenArr[evenCnt] = totalArr[i];
//						evenCnt++;
//					}
		//
//					if((totalArr[i]%2) == 1) {
//						
//						oddArr[oddCnt] = totalArr[i];
//						oddCnt++;
//					}
//				}
		//
//				System.out.println();
//				System.out.print("짝수: \n");
//				for(int i=0; i < evenArr.length; i++) {
//					System.out.printf("%d " , evenArr[i]);
//				}
//				System.out.println("\n홀수: ");
//				for(int i=0; i < oddArr.length; i++) {
//					System.out.printf("%d " , oddArr[i]);
//				}
			
//				int	[] total = new int[100];
//				
//				int oneCnt=0;
//				int twoCnt=0;
//				int thrCnt=0;
//				int fouCnt=0;
//				int fivCnt=0;
//				int sixCnt=0;
		//
//				for(int i=0; i< total.length; i++) {
//					int rNum = (int)(Math.random()*6 +1);
//					total [i] = rNum;
//						
//					if(total[i] == 1) {
//						oneCnt++;
//					}
//					
//					if(total[i] == 2) {
//						twoCnt++;
//					}
//					
//					if(total[i] == 3) {
//						thrCnt++;
//					}
//					
//					if(total[i] == 4) {
//						fouCnt++;
//					}
//					
//					if(total[i] == 5) {
//						fivCnt++;
//					}
		//
//					if(total[i] == 6) {
//						sixCnt++;
//					}		
//					
//				}
//				System.out.printf("1은 %d번\n", oneCnt);		
//				System.out.printf("2는 %d번\n", twoCnt);		
//				System.out.printf("3은 %d번\n", thrCnt);			
//				System.out.printf("4는 %d번\n", fouCnt);	
//				System.out.printf("5는 %d번\n", fivCnt);	
//				System.out.printf("6은 %d번\n", sixCnt);	
//				

				
				
		//-------------------------------------------------------------------------------------------------------------------------------------
				
				int	[] total = new int[100];
				int one = 0;
				int two=0;
				int three=0;
				int four=0;
				int five=0;
				int six=0;
				
				for(int i=0; i< total.length; i++) {
					int rNum = (int)(Math.random()*6 +1);
					
					if(rNum == 1) {
						one += rNum;
					}else if(rNum == 2) {
						two += rNum;				
					}else if(rNum == 3) {
						three += rNum;				
					}else if(rNum == 4) {
						four += rNum;			
					}else if(rNum == 5) {
						five += rNum;		
					}else if(rNum == 6) {
						six += rNum;
					}
				}
				
				System.out.println("1은 : " + one/1);		
				System.out.println("2는 : " + two/2);		
				System.out.println("3은 : " + three/3);			
				System.out.println("4는 : " + four/4);	
				System.out.println("5는 : " +  five/5);	
				System.out.println("6은 : " + six/6);	

	}

	public static void main2(String[] args) {
//		int[] arr = new int[4];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.printf("arr[%d] = %d\n", i, arr[i]);
//		}
//		System.out.println();
//		
//		arr[0] = arr[0] + 10;
//		arr[1] += 20;
//		arr[2] += 30;
//		arr[3] += 40;
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.printf("arr[%d] = %d\n", i, arr[i]);
//		}
//		System.out.println();
		
		/////////////////////////////////////////////////////
		
//		int [] card = new int[52];
//		
//		for(int i=0; i<card.length; i++) {
//			card [i] = i+1;
//		}
//		
//		int rIndex=0;
//		int temp;
//		for(int i=0; i<100; i++) {
//			rIndex = (int)(Math.random()*51 +1);
//			temp = card[0];
//			card[0] = card[rIndex]; 
//			card[rIndex] = temp;	
//		}
//		
//		for(int i=0; i<7; i++) { 
//			System.out.println(card[i]+" ");
//		}
		
		////////////////////////////////////////////////////
		
//		int even=0;
//		int odd=0;
//		int [] totalArr = new int[10]; 
//		
//		for(int i=0; i<totalArr.length; i++) {
//			int rNum = (int)(Math.random()*6 +1);
//			totalArr[i] = rNum;
//			
//			System.out.printf("%d ", rNum);
//			
//			if(rNum%2 == 0) {
//				even++;
//			}
//			if(rNum%2 == 1) {
//				odd++;
//			}
//		}
//		
//		int [] evenArr = new int[even];
//		int [] oddArr = new int[odd];
//		int evenCnt =0;
//		int oddCnt =0;
//		
//		for(int i=0; i<totalArr.length; i++) {
//			if(totalArr[i]%2 == 0) {
//				evenArr[evenCnt] = totalArr[i];
//				evenCnt++;
//			}
//			if(totalArr[i]%2 == 1) {
//				oddArr[oddCnt] = totalArr[i];
//				oddCnt++;
//			}
// 		}
//		System.out.println();
//		
//		System.out.println("짝수:");
//		for(int i=0; i<evenArr.length; i++) {
//			System.out.printf("%d ", evenArr[i]);
//		}
//		System.out.println();
//		
//		System.out.println("홀수:");
//		for(int i=0; i<oddArr.length; i++) {
//			System.out.printf("%d ", oddArr[i]);
//		}
//		System.out.println();
		
		////////////////////////////////////////////////////
		
		int [] total = new int[100];
		int oneCnt=0;
		int twoCnt=0;
		int threeCnt=0;
		int fourCnt=0;
		int fiveCnt=0;
		int sixCnt=0;
		
		for(int i=0; i<total.length; i++) {
			int rNum = (int)(Math.random()*6 +1);
			total[i] = rNum;
			
			if(total[i] == 1) {
				oneCnt++;
			}
			if(total[i] == 2) {
				twoCnt++;
			}
			if(total[i] == 3) {
				threeCnt++;
			}
			if(total[i] == 4) {
				fourCnt++;
			}
			if(total[i] == 5) {
				fiveCnt++;
			}
			if(total[i] == 6) {
				sixCnt++;
			}	
		}
		System.out.printf("1: %d번\n", oneCnt);
		System.out.printf("2: %d번\n", twoCnt);
		System.out.printf("3: %d번\n", threeCnt);
		System.out.printf("4: %d번\n", fourCnt);
		System.out.printf("5: %d번\n", fiveCnt);
		System.out.printf("6: %d번\n", sixCnt);
		
		System.out.println();
		int ttCnt = oneCnt + twoCnt + threeCnt + fourCnt + fiveCnt + sixCnt;
		System.out.printf("총: %d번\n", ttCnt);
	}

	public static void main(String[] args) {
//		배열복습
//		1. 1부터 4까지 출력해보기
//		2. 1번을 사용해서 11부터 44까지 출력해보기
//		3. 카드섞기. 카드는 총 52장. 섞여서 나오는 카드는 7장 랜덤 출력 
//		3. 주사위를 10번 던져서 나오는 값들을 홀수, 짝수 분류하기
//		4. 주사위를 100번 던져서 나오는 값들을 1-6까지 몇번씩 나왔는지 세어보기. 

	
	}
}
