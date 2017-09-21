import java.util.*;

public class pe5 {
    public static  void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine( );
        Scanner st = new Scanner(s);
        long sum = 0;
        int flag=0;
        try {
            while(st.hasNext())
            {
                sum += st.nextInt();
            }
        }
        catch (InputMismatchException obj)
        {
            System.out.println("INPUT ERROR: NON NUMERIC CHARACTER FOUND!");
            flag=1;
        }
        if(flag==0)
            System.out.println(sum);
        
        in.close();
        st.close();
    }

}