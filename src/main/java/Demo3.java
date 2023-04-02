import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0) return result;
        for (int i=0;i<nums.length;i++){
            List<Integer> list=new ArrayList<>();
            if(nums[i]==nums[i+1] && i!=nums.length-1) continue;
            if(nums[i]>0) return result;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum>0){
                    r--;
                }else if(sum<0){
                    l++;
                }else {
                    list.add(nums[l]);
                    list.add(nums[r]);
                    list.add(nums[i]);
                    result.add(list);
                    while(l<r && nums[l]==nums[++l]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }
            }
        }
        return result;
    }
}
