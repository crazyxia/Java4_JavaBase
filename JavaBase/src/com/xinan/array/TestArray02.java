package com.xinan.array;

/*此程序用来实现输出数组中的最大值、最小值和平均值
 * @author crazyxia
 *
 */
public class TestArray02 {
	public static void main(String[] args){
		int[] nums=new int[] { 148, 61, 23, 4, 74, 13, 20 };
		int max=nums[0];
		int min=nums[0];//将数组中的第一个数赋值给最大值或者最小值，减少一次比较
		double avg=0;
		double sum=0;
		for(int i=0;i<nums.length;i++){
			/*if(nums[i+1]>max){//nums[i+1]>nums[i]这种比较方式是有问题的，应该是数组中的各个元素与定义的max或min对比
				max=nums[i+1];
				//System.out.println(nums[i]);
			}
			else{
				max=nums[i];
				//System.out.println(nums[i-1]);
			}以上方法
			*/
			if(nums[i]>max){//最大值比较
				max=nums[i];
			}
			if(nums[i]<min){//最小值比较
				min=nums[i];
			}
			sum=sum+nums[i];
			avg=sum/nums.length;
		}
		System.out.println("数组的最大值"+max);
		System.out.println("数组的最小值"+min);
		System.out.println("数组的平均数"+avg);
			
	}
}

