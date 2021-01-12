import java.util.*;
public class R 
{
    public static void main(String []args)
    {
        Scanner kbd = new Scanner(System.in);
        int R1 = kbd.nextInt();
        int s  = kbd.nextInt();
        int R2;
        if((R1 < 1000) && (s < 1000))
        {
            R2 = s * 2 - R1;
            System.out.print(R2);
        }
    }
}