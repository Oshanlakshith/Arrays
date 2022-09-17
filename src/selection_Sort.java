import java.util.*;
class selection_Sort{
    public static void sort(int[] a){
        int max=a[0];
        int index=0;
        for(int j=1; j<a.length; j++){
            if(a[j]>max){
                max=a[j];
                index=j;
            }
        }
        a[index]=a[a.length-1];
        a[a.length-1]=max;

        max=a[0];
        index=0;
        for(int j=1; j<a.length-1; j++){
            if(a[j]>max){
                max=a[j];
                index=j;
            }
        }
        a[index]=a[a.length-2];
        a[a.length-2]=max;
    }
    public static void main(String args[]) {
        int[] xr = {99, 44, 22, 66, 33, 88, 55, 77, 0, 11};
        System.out.println(Arrays.toString(xr));
        sort(xr);
        System.out.println(Arrays.toString(xr));

    }
    }
