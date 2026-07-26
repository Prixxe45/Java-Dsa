package Array;

public class MissingElement {

    public static  int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum += i ;
        }
        int arraySum = 0;
        for(int elem: nums){
            arraySum += elem;
        }
        return sum-arraySum;
    }
  public static void main(String[] args) {
 int[] nums = {9,6,4,2,3,5,7,0,1};
System.out.println(missingNumber(nums));
  }
}
