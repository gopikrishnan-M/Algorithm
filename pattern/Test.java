package pattern;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={7,6,3,5,6,0};
       for(int i=0;i<arr.length;i++){
           int last=arr.length-1-i;
           int maxind=Maxfind(arr,last);
           int temp=arr[maxind];
           arr[maxind]=arr[last];
           arr[last]=temp;
       }
        System.out.println(Arrays.toString(arr));
    }
   public static int Maxfind(int[] arr,int last){
        int res=0;
        for(int i=1;i<=last;i++){
            res=arr[res]<arr[i]?i:res;
        }
       System.out.println(res);
        return res;
   }
}
