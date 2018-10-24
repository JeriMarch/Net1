import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jm_CS on 10/24/18.
 */
public class ErrorDetection {

    public static void main (String[] args){

        int i;

        //ArrayList<Integer> input = new ArrayList<>();
        //Integer[] input = new Integer[32];
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>(scanner.nextInt());

        System.out.println("Enter binary value in bits in a multiple of 4: ");



    }

    static class ChecksumSenderNaught {

        public int generateChecksum() {

        }

        public int validateChecksum(String inputString) {
            Scanner scanner = new Scanner(System.in);
            String list[];

            int i;
            int store;
            int checksum = 0;
            String value = new String();

            for (i=0; i<inputString.length() - 4; i = i+4) {
                store = (int) (inputString.charAt((i)));
                value= Integer.toString(store);

                store = (int) (inputString.charAt((i+1)));
            }

//            for (i = 0; i < input.size(); i++) {
//                input.add(scanner.nextInt());
//                System.out.print(input);
//
//
//            }

            //System.exit(0);


//            if ((input.size() % 4) == 0) {  //if number of characters can be divided by for, loop
//                System.out.print(input);
//
//                //else if the number of characters is not a multiple of 4, add zeroes
//            } //else

            //System.exit(0);

        }

    }


}
