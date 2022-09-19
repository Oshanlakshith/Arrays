import java.util.*;
class sorting extends sort1{

    public static void main(String args[]){
        int[] xr={99,78,90,12,34,65,43,71,89,29,37,97,61};
        System.out.println(Arrays.toString(xr));//[99,78,90,12,34,65,43,71,89,29,37,97,61]
        sort(xr);
        System.out.println(Arrays.toString(xr));//[12,28,34,37,43.......]

    }
}
