/*將陣列的數字由大到小排序*/

class Solution {
    public int[] sortDesc(int[] c) {
        int n = c.length;
        
        for (int i = 0; i < n - 1; i++) {           // 幾輪 ; n-1:因為要用 j+1，所以不能跑到最後一格
            for (int j = 0; j < n - 1 - i; j++) {   // 每輪掃多遠 ; j < n - 1 - i:避開後面牌號的數字，減少時間浪費
                
                if (c[j] < c[j + 1]) {  // 大到小
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
                
            }
        }  
        return c;
    }
}


/* 
//Arrays.sort(c)
import java.util.Arrays;
Arrays.sort(c);   // 由小到大排序

//由大到小排序
Arrays.sort(c);

for (int i = 0; i < c.length / 2; i++) {
    int temp = c[i];
    c[i] = c[c.length - 1 - i];
    c[c.length - 1 - i] = temp;
}
//時間複雜度：O(n log n)
//Java 內建高度優化（通常是 QuickSort / TimSort）
//實務使用標準解
*/
