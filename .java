package 字符串数组排序;

import java.util.Arrays;

public class 数字字符串排序 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "91 27 46 38 50";
        //把字符串中的数字数据分离开
        String[] strArray = s.split(" ");
        //试验
//        for(int i=0;i<strArray.length;i++)
//        {
//            System.out.println(strArray[i]);
//        }
//        试验成功
        //把分离开的字符串数字数据储存到一个int类型数组中
        int[] arr = new int[strArray.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        //试验
//        for(int i=0;i<arr.length;i++)
//       {
//           System.out.println(arr[i]);
//       }
//        试验成功
        //对Int类型数组进行排序
        Arrays.sort(arr);

        //把排序后的数组连接成一个字符串
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            //判断是否为最后一个数据
            if(i == arr.length-1){
                sb.append(arr[i]);
            }
            else{
                sb.append(arr[i]).append(" ");
            }
        }
        //连接
        String result = sb.toString();

        //输出结果
        System.out.println(result);

    }
}
