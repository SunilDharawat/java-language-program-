import java.util.Scanner;

public class Arraybyuser {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int size = sc. nextInt();
        String [] names = new String[size];

       for (int i=0;i<size;i++){
           names [i]= sc.next();
       }


        // for loop
        for (int i=0;i<size;i++){
            System.out.println(names[i]);
        }
    }
}
