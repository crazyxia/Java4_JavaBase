package com.xinan.array;

/*�˳�������ʵ����������е����ֵ����Сֵ��ƽ��ֵ
 * @author crazyxia
 *
 */
public class TestArray02 {
	public static void main(String[] args){
		int[] nums=new int[] { 148, 61, 23, 4, 74, 13, 20 };
		int max=nums[0];
		int min=nums[0];//�������еĵ�һ������ֵ�����ֵ������Сֵ������һ�αȽ�
		double avg=0;
		double sum=0;
		for(int i=0;i<nums.length;i++){
			/*if(nums[i+1]>max){//nums[i+1]>nums[i]���ֱȽϷ�ʽ��������ģ�Ӧ���������еĸ���Ԫ���붨���max��min�Ա�
				max=nums[i+1];
				//System.out.println(nums[i]);
			}
			else{
				max=nums[i];
				//System.out.println(nums[i-1]);
			}���Ϸ���
			*/
			if(nums[i]>max){//���ֵ�Ƚ�
				max=nums[i];
			}
			if(nums[i]<min){//��Сֵ�Ƚ�
				min=nums[i];
			}
			sum=sum+nums[i];
			avg=sum/nums.length;
		}
		System.out.println("��������ֵ"+max);
		System.out.println("�������Сֵ"+min);
		System.out.println("�����ƽ����"+avg);
			
	}
}

