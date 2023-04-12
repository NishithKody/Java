class selectionSort{
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


class bubbleSort{
    public static void main(String args[]){
        int[] a = {10,5,1,0,3,4,6};
        //{5,10,1,0,3,4,6}
        // i
        //    j 
        int n = a.length;

        for(int i=0; i<n-1; i++){
            for(int j =0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
    }
}
