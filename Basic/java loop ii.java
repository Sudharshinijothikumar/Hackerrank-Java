import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c=a;
            int p=1;
            for(int j=0;j<n;j++){
            
            c+=p*b;
            System.out.print(c+" ");
            p*=2;
        }
        System.out.println();
        }
        in.close();
    }
}
