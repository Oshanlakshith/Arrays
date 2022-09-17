import java.util.Arrays;

public class Array_Searching {
    public static int search(int[]a,int key){
        int index=-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] xr={65,78,90,12,34,65,43,71,89,29,37,97,61};
        System.out.println(Arrays.toString(xr));//[65,78,90,12,34,65,43,71,89,29,37,97,61]

        int index;
        index=search(xr,12);
        System.out.println("Index of 12 : "+index); //3

        index=search(xr,65);
        System.out.println("Index of 65 : "+index); //5

        index=search(xr,99);
        System.out.println("Index of 99 : "+index); //-1
    }

}

