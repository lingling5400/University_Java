import java.util.*;
public class 樂透對獎 {

	public static void main(String[] args) {
		
		int i,j,sum=0,sum2=0;
		Scanner keyin=new Scanner(System.in);
		Random c=new Random();
		int[]a=new int[7];
		int[]b=new int[6];
		for(i=0;i<=6;i++)
			a[i]=c.nextInt(49)+1;
		
		System.out.println("輸入6個數:");
		for(i=0;i<=5;i++)
		b[i]=keyin.nextInt();
		
		for(i=0;i<=5;i++)
			{for(j=0;j<=5;j++)
			{if(b[i]==a[j])
				sum=sum+1;}}
		
		for(i=0;i<=5;i++)
		{if(b[i]==a[6])
			sum2=sum2+1;}
		System.out.println("總共猜對"+sum+"個");
		if(sum==3&&sum2==1)
			System.out.println("對中3個+特別號,獎金5000");
		else if(sum==3)
			System.out.println("對中3個,獎金1000");
		else if(sum==4&&sum2==1)
			System.out.println("對中4個+特別號,獎金50000");
		else if(sum==4)
				System.out.println("對中4個,獎金20000");
		else if(sum==5&&sum2==1)
			System.out.println("對5個+特別號,獎金500000");
		else if(sum==5)
			System.out.println("對中5個,獎金200000");
		else if(sum==6)
			System.out.println("對中6個,獎金50000000");
		else
			System.out.println("對中0個,獎金0");
     		
		keyin.close();
	}

}
