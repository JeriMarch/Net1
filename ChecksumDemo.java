import java.util.Scanner;

/**
 * Created by jm_CS on 10/22/18.
 */
public class ChecksumDemo
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string input:");
        String input = scan.next();
        Sender sender = new Sender();
        Sender.Receiver reveiver = new Sender.Receiver();
        int checksum = sender.generateChecksum(input);
// Call the method to create the checksum
        System.out.println("The checksum generated is = "
                + Integer.toHexString(checksum));
        System.out.println("Enter the data to be sent:");
        input = scan.next();
        System.out.println("Enter the checksum to be sent:");
        checksum = Integer.parseInt((scan.next()), 16);
// User inputs data as hexadecimal value but it will be stored as a
// decimal value unless it is converted into hexadecimal first.
        reveiver.receive(input, checksum);
        scan.close();
    }




}