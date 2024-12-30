package com.maythinktech.learn;

/**
 * ClassName: ArratTest
 * Package: com.maythinktech.learn
 * Description:
 *
 * @Author ddf
 * @Create 2024/12/30 10:53
 * @Version 1.0
 */
public class ArratTest {
    public static void main(String[] args) {
        //1.动态创建数组
        int[] arr=new int[10];
        //2.通过循环给数组元素负赋值
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*(99-10+1))+10;
            System.out.println(arr[i]+"\t");
        }
        //3.1 求最大值
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最大值为："+max);

        //3.2 求最小值
        int min=arr[1];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("最小值为："+min);

        //3.3 求总和
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("总和为："+sum);

        //3.4 求平均值
        int avg=sum/arr.length;


        System.out.println("平均值为："+avg);

        int[] scores={5,4,6,8,9,0,1,2,7,3};
        int sum1=0;
        int max1=scores[0];
        int min1=scores[0];
        for(int i=0;i<scores.length;i++){
            sum1+=scores[i];
            if(max<scores[i]){
                max=scores[i];
            }
            if(min>scores[i]){
                min=scores[i];
            }
        }
       int avg1= (sum1-max1-min1)/(scores.length-2);
        System.out.println("去掉最高分和最低分之后，平均分为："+avg1);
    }
}
