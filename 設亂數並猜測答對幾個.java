import java.util.*;

public class 設亂數並猜測答對幾個 {

	public static void main(String[] args) {

		int i,j,sum=0;
		Scanner keyin=new Scanner(System.in);
		Random c=new Random();
		int[]a=new int[6];      //放隨機六個亂數（可能重複，若要模擬樂透需再檢查是否重複）
		int[]b=new int[6];      //放猜的六個數字
		for(i=0;i<=5;i++)
			a[i]=c.nextInt(49)+1;         //將亂數導入a陣列 (產生1~49之間的隨機數)
		System.out.println("輸入6個數:");      //請使用者猜測6個數字
		for(i=0;i<=5;i++)                
		b[i]=keyin.nextInt();                   //將使用者輸入導入b陣列
		for(i=0;i<=5;i++)                       //逐個比對，控制b陣列
			{for(j=0;j<=5;j++)                  //逐個比對，控制a陣列
			{if(b[i]==a[j])
				sum=sum+1;}
			}	
		System.out.println("總共猜對"+sum+"個");
		keyin.close();
	}

}
/* 

補充1:
如果想用 List（可變大小），可以這樣寫：
   	import java.util.ArrayList;
	import java.util.List;
	List<Integer> a = new ArrayList<>();

補充2:
小補充（進階說明）：
若目標是模擬「樂透」：
需避免 a[] 內出現重複值；
可用 Set<Integer> 或 List<Integer> + 檢查機制；
可加入排序、顯示隨機數、或檢查輸入範圍。

補充3:
c.nextInt(49)
為隨機產生一個整數，範圍是從 0 到 48（包含0，不包含49，沒+1差很多

*/


/* 
補充2延伸:
import java.util.*;

public class 樂透亂數用Set {

    public static void main(String[] args) {
        Random c = new Random();
        Set<Integer> a = new HashSet<>(); // 放亂數，Set 會自動避免重複
        
        // 產生 6 個不重複的亂數 (1~49)
        while (a.size() < 6) {
            a.add(c.nextInt(49) + 1);
        }

        System.out.println("樂透號碼：" + a);

        // 使用者輸入
        Scanner keyin = new Scanner(System.in);
        Set<Integer> b = new HashSet<>();
        System.out.println("請輸入6個猜測數字：");
        while (b.size() < 6) {
            int num = keyin.nextInt();
            if (num < 1 || num > 49) {
                System.out.println("請輸入 1~49 之間的數字");
            } else {
                b.add(num);
            }
        }

        // 計算猜對幾個
        int correct = 0;
        for (int n : b) {                  //逐一取出 b 集合中的每個數字，暫存在變數 n 裡
            if (a.contains(n)) correct++;  //如果集合 a 裡面有包含元素 n，等於使用者猜對=>變數correct 加 1。
        }

        System.out.println("開獎號碼：" + a);
        System.out.println("你猜的號碼：" + b);
        System.out.println("總共猜對 " + correct + " 個");

        keyin.close();
    }
}
*/
