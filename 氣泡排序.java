/*將陣列的數字由大到小排序*/

class Solution {
    public int[] sortDesc(int[] c) {
        int n = c.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                
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
