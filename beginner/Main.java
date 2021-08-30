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

	public static void main4(String[] args) {
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

	public static void main(String[] args) {
//		ConstEx c = new ConstEx();
//		ConstEx cc = new ConstEx(100);
//		ConstEEx ccc = new ConstEEx();
//		
//		System.out.println(c.def);
//		System.out.println(cc.def);
//		System.out.println(ccc.def);
		
//		Sum sum = new Sum();
		
//		int ires = sum.ssum(1,2,3);
//		String sres = sum.ssum("가","나");
		
//		System.out.println(ires);
//		System.out.println(sres);

//		int a = 5, b = 6;
//		String s1 = "가", s2 = "나";
//		
//		System.out.println(sum.ssum(a, b));
//		System.out.println(sum.ssum(s1,s2));
		
		/////////////////////
		
//		Car car = new Car(2, "빨간색", "manual");
//		
//		System.out.println("color\t: " + car.color);
//		System.out.println("gear\t: " + car.gearType);
//		System.out.println("door\t: " + car.door);
		
		////////////////////////
		
		Car car1 = new Car("빨간색", "manual", 2, "car1");
		Car car2 = new Car("진주색", "auto", 4, "car2");
		
//		car1.disp("car1");
//		car2.disp("car2");
		
//		KimKangSa kks = new KimKangSa("김강사", 28);
//		KimKangSa kys = new KimKangSa();
//		
//		kks.disp();
//		kys.disp();
		
		/////////////////////////////////////////////
		
//		Cellphone cp1 = new Cellphone(1, "G8", "LG", 80);
//		Cellphone cp2 = new Cellphone(); 
//		Cellphone cp3 = new Cellphone(3, "Note10", "SKT", 100);
//		
//		cp1.disp();
//		cp2.disp();
//		cp3.disp();

		/////////////////////////////////////////////
		
		Mobile m1 = new Mobile("G8", "LGT", 80);
		Mobile m2 = new Mobile("아이폰8", "KT", 85);
		Mobile m3 = new Mobile("Note10", "SKT", 100);

		m1.disp();
		m2.disp();
		m3.disp();
		System.out.println();
		
		Mobile [] marr = new Mobile[] {m1, m2, m3};
		Mobile.disp(marr);
	
	}
}

class Mobile{
	private String name;
	private String telecom;
	private int price;	
	
	public Mobile(){
		
	}
	
	public Mobile(String name){
		this.name = name;
	}
	
	public Mobile(String name, String telecom, int price) {
		this.name = name;
		this.telecom = telecom;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}

	public String getTelecom() {
		return telecom;
	}

	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	 public static void disp(Mobile [] marr) { 
		 System.out.printf("\t%s\t%s\t%s\n", "name", "telecom", "price");
			
		for(int i=0; i<marr.length; i++) {
				
		System.out.printf("[%d]\t", i+1);
		System.out.printf("%s\t", marr[i].getName());
		System.out.printf("%s\t", marr[i].getTelecom());
		System.out.printf("%d만원\n", marr[i].getPrice());
		
		}
	}
	
	public void disp() {
		System.out.println("모   델: " + getName());
		System.out.println("통신사: " + getTelecom());
		System.out.println("가   격: " + getPrice() + "만원");
		System.out.println();
	}
	
}


class Cellphone{
	private int number;
	private String name;
	private String company;
	private int price;

	Cellphone(){
		this(2, "아이폰8", "KT", 85);		
		System.out.println("\tname \ttelecom \tprice");
		
	}
		
	Cellphone(int number, String name, String company, int price){
		this.number = number;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void disp() {
		System.out.printf("[%d] \t%s \t%s \t\t%d만원\n", getNumber(), getName(), getCompany(), getPrice());
	}
		
}

class KimKangSa {
	private String name;
	private int age;
	
	KimKangSa(){
		this("김강오", 38);
	}
	
	KimKangSa(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void disp() {
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge() + "살");
		System.out.println();
	}
}











///선생님 클래스/////

class Car {
	private String color;
	private String gearType;
	private int door;
	
//	Car(){
//		//디폴트 생성자입니다.
//	}
	Car(String color1, String gearType1, int door1, String model) {
		color = color1;
		gearType = gearType1;
		door = door1;
		disp(model);
	}
	
	public void setColor(String color1) {
		color = color1;
	}
	public void setGearType(String gearType1) {
		gearType = gearType1;
	}
	public void setDoor(String door1) {
		gearType = door1;
	}
	public String getColor() {
		return color;
	}
	public String getGearType() {
		return gearType;
	}
	public int getDoor() {
		return door;
	}
	
	public void disp(String model) {
		System.out.printf("[%s의 정보]\n", model);
		System.out.println("color\t:" + getColor());
		System.out.println("gearType\t:" + getGearType());
		System.out.println("door\t:" + getDoor());
		System.out.println();
	}
	
}

//class Car {
//	 int door;
//	String color;
//	String gearType;
//	
//	Car(int d, String c, String g) {
//		door = d;
//		color = c;
//		gearType = g;
//	}	
//}

//class Car {
//	private String color;
//	private String gearType;
//	private int door;
//	
//	public void setColor(String color1) {
//		color = color1;
//	}
//	public void setGearType(String gearType1) {
//		gearType = gearType1;
//	}
//	public void setDoor(int door1) {
//		door = door1;
//	}
//
//	public String getColor() {
//		return color;
//	}
//	public String getGearType() {
//		return gearType;
//	}
//	public int getDoor() {
//		return door;
//	}
//		
//}


class Sum {
	
	int ssum(int a, int b) {
		int res;
		res = a + b;
		return res;
	}
	
	int ssum(int a, int b, int c) {
		int res;
		res = a + b + c;
		return res;
	}
	
	String ssum(String a, String b) {
		String res; 
		res = a + "," + b;
		return res;
	}
}

class ConstEx {
	int def;
	
	ConstEx(){
		def = 20;
	}
	
	ConstEx(int deff) {
		def = deff;
	}
	
	
}

class ConstEEx {
	int def;	
}



