import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Arr[] = new int[5];
        System.out.println("input your elements ");
        for (int i=0; i<Arr.length;i++){
            Arr[i] = input.nextInt();
        }
        Sort s =new  Sort();
        s.bubble(Arr);

        for (int i= 0 ; i<Arr.length ;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}