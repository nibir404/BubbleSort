public class Sort {
   public void bubble(int Arr[]){
        int n = Arr.length;
        int temp=0;
        for (int i = 0 ;i < n;i++){
            for (int j = 1 ; j<n-i;j++){
                if (Arr[j-1]>Arr[j]){
                    temp = Arr[j-1];
                    Arr[j-1]=Arr[j];
                    Arr[j]= temp;
                }
            }
        }
    }
}
