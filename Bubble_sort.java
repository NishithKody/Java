class bubbleSort{
    public static void main(String[] args){
        int[] a = {5,2,1,0,2,4,10};

        int n = a.length;

        for(int i=0; i<n-1; i++){
            for(int j =i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp = a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

        System.out.println("Sorted ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
