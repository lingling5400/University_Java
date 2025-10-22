public class 數a陣列數字出現幾次 {
  public static void main(String[] args) {
    int i,j;
		int[]a= {13,12,6,8,4,13,2,11,8,13,2,12};
		int[]b= {1,1,1,1,1,1,1,1,1,1,1,1};       //b[] 是用來 記錄每個元素「是否已經被計算過」以及「出現了幾次」 的輔助陣列→「計數用」＋「標記用」的。
		for(i=0;i<=10;i++)        //a的list當前
			for(j=i+1;j<=11;j++)  //a的list下一位
			{
				if(b[j]==1&&a[i]==a[j]) //
				{
					b[i]=b[i]+1;        //把「第一次出現的」那個元素的計數加1
					b[j]=0;             // 把重複的那個位置標記為已經計算過
				}
			}	
		for(i=0;i<=11;i++)
		{if(b[i]!=0)
			System.out.println(a[i]+"出現"+b[i]+"次");}
  }
}

/*
	印出:
    13出現3次
	12出現2次
	6出現1次
	8出現2次
	4出現1次
	2出現2次
	11出現1次
 */

 /*
chat gpt(114/10/20)
更進階的方法：用 Map（HashMap 或 LinkedHashMap）
基本概念:
Map 就像一個「字典」或「表格」：
Key：數字（或任何你要統計的值）
Value：這個數字出現的次數


import java.util.*;

public class 數a陣列數字出現幾次 {
  public static void main(String[] args) {
    	int[] a = {13,12,6,8,4,13,2,11,8,13,2,12};
			
    Map<Integer, Integer> countMap = new LinkedHashMap<>();  // LinkedHashMap 會保持原始出現順序

    for (int num : a) {
      countMap.put(num, countMap.getOrDefault(num, 0) + 1);    // 取出目前的數字，如果不存在就預設為0，再加1
    }

    // 印出結果
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
      System.out.println(entry.getKey() + " 出現 " + entry.getValue() + " 次");
    }
  }
}

 */
