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

	public static void main3(String[] args) {
//		배열복습
//		1. 1부터 4까지 출력해보기
//		2. 1번을 사용해서 11부터 44까지 출력해보기
//		3. 카드섞기. 카드는 총 52장. 섞여서 나오는 카드는 7장 랜덤 출력 
//		4. 주사위를 10번 던져서 나오는 값들을 홀수, 짝수 분류하기
//		4. 주사위를 100번 던져서 나오는 값들을 1-6까지 몇번씩 나왔는지 세어보기. 

//		int [] num = new int[4];
//		
//		for(int i=0; i<num.length; i++) {
//			num[i] = i+1;
//			System.out.print(num[i]);
//		}
//		System.out.println();
//		
//		num[0] += 10;
//		num[1] += 20;
//		num[2] += 30;
//		num[3] += 40;
//		
//		for(int i=0; i<num.length; i++) {
//			System.out.printf("num[%d] = %d\n", i, num[i]);
//		}
//		System.out.println();
//		
//		
//		int[] card = new int[52];
//		int rIndex;
//		int temp;
//		
//		for(int i=0; i<card.length; i++) {
//			card[i] = i+1;
//		}
//		
//		for(int i=0; i<100; i++) {
//			rIndex = (int)(Math.random()*51 +1);
//			temp = card[0];
//			card[0] = card[rIndex];
//			card[rIndex] = temp;
//		}
//		
//		for(int i=0; i<7; i++) {
//			System.out.println(card[i]);
//		}
		
		int [] total = new int[10];
		int evenCnt=0;
		int oddCnt=0;
		
		for(int i=0; i<total.length; i++) {
			int rNum = (int)(Math.random()*6 +1);
			total[i] = rNum;
			System.out.printf("%d ", total[i]);
				if(total[i]%2 == 0) {
					evenCnt++;
				}
				if(total[i]%2 == 1) {
					oddCnt++;
				}
		}

		int [] evenArr = new int[evenCnt];
		int [] oddArr = new int[oddCnt];
		int even = 0;
		int odd = 0 ;
		
		for(int i=0; i<total.length; i++) {
			if(total[i]%2 == 0) {
				evenArr[even] = total[i];
				even++;
			}
			if(total[i]%2 == 1) {
				oddArr[odd] = total[i];
				odd++;
			}		
		}
		System.out.println();
		
		for(int i=0; i<evenArr.length; i++) {
			System.out.printf("even[%d]: %d\n",i, evenArr[i]);
		}
		System.out.println();
		for(int i=0; i<oddArr.length; i++) {
			System.out.printf("odd[%d]: %d\n",i, oddArr[i]);
		}
		System.out.println();
		
		int [] num = new int[100];
		int oneCnt = 0;
		int twoCnt = 0;
		int threeCnt = 0;
		int fourCnt = 0;
		int fiveCnt = 0;
		int sixCnt = 0;
		
		for(int i=0; i<num.length; i++) {
			int rNum = (int)(Math.random()*6 +1);
			num[i] = rNum;
			System.out.print(num[i]);
			
				if(num[i] == 1) {
				oneCnt++;	
				}
				if(num[i] == 2) {
					twoCnt++;	
				}
				if(num[i] == 3) {
					threeCnt++;	
				}
				if(num[i] == 4) {
					fourCnt++;	
				}
				if(num[i] == 5) {
					fiveCnt++;	
				}
				if(num[i] == 6) {
					sixCnt++;	
				}
		}
		System.out.println();
		System.out.printf("1은 [%d]번 출력되었습니다.", oneCnt);
		System.out.printf("2은 [%d]번 출력되었습니다.", twoCnt);
		System.out.printf("3은 [%d]번 출력되었습니다.", threeCnt);
		System.out.printf("4은 [%d]번 출력되었습니다.", fourCnt);
		System.out.printf("5은 [%d]번 출력되었습니다.", fiveCnt);
		System.out.printf("6은 [%d]번 출력되었습니다.", sixCnt);
		
		
	
	}

	public static void main(String[] args) {
//	 int [][] arr = new int [][] {{1,2,3,4,5},{6,7},{8,9}}; //3개의 엘리먼트를 갖는 2차원 배열. 
//	 
//	 for(int i=0; i<arr.length; i++) {
//		 for(int j=0; j<arr[i].length; j++) {
//			 System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
//		 }
//		 System.out.println();
//	 }
	 

//	 Scanner sc = new Scanner(System.in);
//	 
//	 int data=1;
//	 
//	 System.out.print("1차 배열 크기 입력: ");
//	 int fLayer = sc.nextInt();
//	 System.out.print("2차 배열 크기 입력: ");
//	 int sLayer = sc.nextInt();
//
//	 int [][] arr = new int [fLayer][sLayer];
//	 for(int i=0; i<arr.length; i++) {
//		 for(int j=0; j<arr[i].length; j++) {
//			 arr[i][j] = data++;
//		 }
//	 }
//	 System.out.println();
//
//		 for(int i=0; i<arr.length; i++) {
//		 for(int j=0; j<arr[i].length; j++) {
//			 System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
//		 }
//		 System.out.println();
//	 }		 

//	 빙고판 만들기
//	 사용자로부터 가로,세로 크기를 입력 받아 빙고판을 만들고
//	 빙고판의 모든 자리의 값은 중복되지 않는 임의의 값으로 채워보세요.
		 	

//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("가로: ");
//	int fnum = sc.nextInt();
//	sc.nextLine();
//	System.out.print("세로: ");
//	int snum = sc.nextInt();
//	
//	int arr[][] = new int[fnum][snum];
//	int std = 0;
//	
//	for(int i=0; i<arr.length; i++) {
//		for(int j=0; j<arr[i].length; j++) {
//			int rNum = (int)(Math.random()*100);
//			arr [i][j] = rNum + std;
//			std = arr[i][j];
//			System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
//		}
//		System.out.println();
//	}

	}
}


