import java.util.Scanner;

public class checksum
{
    static int checksum(int list[])
    {
        int sum=0;
        for(int x:list)
        {
            sum+=x;
        }
        sum+=sum>>4;
        sum=~sum;
        return sum&0b1111;
    }

    static String binary(int x)
    {
        return String.format("%4s", Integer.toBinaryString(x)).replace(' ', '0');
    }

    public static void main(String args[])
    {
        //Scanner scanner = new Scanner(System.in);

        int list[]={0b0000,0b0100,0b1000,0b1100};

        for(int x:list)
        {
            System.out.println(binary(x));
        }
        System.out.println("checksum: "+binary(checksum.checksum(list)));

        int newList[]={0b0000,0b0100,0b1000,0b1100,checksum.checksum(list)};
        System.out.println("checksum: "+binary(checksum.checksum(newList)));
    }
}
