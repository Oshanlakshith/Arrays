public class sort1 {
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
}
