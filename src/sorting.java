import java.util.*;
class sorting{
    public static void sort(int[] a){
        for(int j=0; j<a.length-1; j++){
            for(int i=0;i<a.length-1; i++){
                if(a[i]>a[i+1]){
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] xr={99,78,90,12,34,65,43,71,89,29,37,97,61};
        System.out.println(Arrays.toString(xr));//[99,78,90,12,34,65,43,71,89,29,37,97,61]
        sort(xr);
        System.out.println(Arrays.toString(xr));//[12,28,34,37,43.......]

    }
}
