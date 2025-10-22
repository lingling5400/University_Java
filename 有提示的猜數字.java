 import java.util.*;
import java.util.Scanner;

public class 有提示的猜數字 {

	public static void main(String[] args) {
		
		int ans,guess;
		Scanner keyin=new Scanner(System.in);
		Random c=new Random();
		ans=c.nextInt(100);      //0~99
		System.out.print("請輸入數字:");
		guess=keyin.nextInt();
		while (guess!=ans)
		{if(guess>ans)
			System.out.println("太大");
		else
			System.out.println("太小");
		guess=keyin.nextInt();}
		System.out.println("猜對,數字為:"+ans);
		keyin.close();
	}
}
