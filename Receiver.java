public class Receiver {
    /**
     * receive
     * @param s
     * @param checksum
     */
    public void receive(String s, int checksum)
    {
        Sender sender = new Sender();
        int generated_checksum = sender.generateChecksum(s);
        // Calculate checksum of received data
        generated_checksum = generateComplement(generated_checksum);
        // Then get its complement, since generated checksum is complemented
        int syndrome = generated_checksum + checksum;
        // Syndrome is addition of the 2 checksums
        syndrome = generateComplement(syndrome);
        // It is complemented
        System.out.println("Syndrome = " + Integer.toHexString(syndrome));
        if (syndrome == 0)
        {
            System.out.println("Data is received without error.");
        }
        else
        {
            System.out.println("There is an error in the received data.");
        }
    }

    /**
     * generateComplement
     * @param checksum
     * @return
     */
    public int generateComplement(int checksum)
    {
        // Generates 15's complement of a hexadecimal value
        checksum = Integer.parseInt("FFFF", 16) - checksum;
        return checksum;
    }
}
