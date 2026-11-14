class Solution {
    public void rotate(int[][] arr) {
        for(int i = 1; i<arr.length; i++){
            for (int j = 0; j<i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int p = 0;p<arr.length; p++){
            int stcol = 0, endcol = arr[0].length-1;
            while(stcol<endcol){
                int vap = arr[p][stcol];
arr[p][stcol] = arr[p][endcol];
arr[p][endcol] = vap;
stcol++;
endcol--;
            }
        }
      
    }
}