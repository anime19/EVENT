import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[])throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.next());
        for(int t=0;t<T;t++)
        {
            String s=scan.nextLine();
            String S=scan.next(),E=scan.next();
            int L=Integer.parseInt(scan.next()),R=Integer.parseInt(scan.next());
            int f=-1,l=-1,c=0;
            if(S.equals("saturday"))
                f=0;
            else if(S.equals("sunday"))
                f=1;
            else if(S.equals("monday"))
                f=2;
            else if(S.equals("tuesday"))
                f=3;
            else if(S.equals("wednesday"))
                f=4;
            else if(S.equals("thursday"))
                f=5;
            else if(S.equals("friday"))
                f=6;
            if(E.equals("saturday"))
                l=0;
            else if(E.equals("sunday"))
                l=1;
            else if(E.equals("monday"))
                l=2;
            else if(E.equals("tuesday"))
                l=3;
            else if(E.equals("wednesday"))
                l=4;
            else if(E.equals("thursday"))
                l=5;
            else if(E.equals("friday"))
                l=6;
            int x=l-f+1;
            while(x<=R) {
                if ((x >= L) &&( x <= R))
                    c++;
                x+=7;
            }
            if(c==0)
                System.out.println("impossible");
            else if(c==1)
                System.out.println(x-7);
            else
                System.out.println("many");
        }
    }
}

