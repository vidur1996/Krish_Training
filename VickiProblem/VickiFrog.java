import java.util.Scanner;
public class VickiFrog{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("enter the distance Vicki has to travel");
		int distance = sc.nextInt();
		int time = 0;

		if(distance%9==0){
			time = (distance/9)*6;  // for complete cycle 5m + 3m + 1m takes 6 sec
		}else if (distance%9<=5){
			time = (distance/9)*6 + 1; //for complete cycle 5m + 3m + 1m and between 1m to 5m takes (6 + 1) sec
		}else if (distance%9<=8){
			time = (distance/9)*6 + 3; //for complete cycle 5m + 3m + 1m and between 5m to  8m takes (6 + 1 + 2) sec
		}

		System.out.println("Vicki will take "+time+" sec");
	}


}