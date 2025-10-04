import java.util.Scanner;

public class SimpleEncryption {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String keyword = scan.nextLine();
        String msg  = scan.nextLine();
        String cleanmsg = "";
        
        for (char c : msg.toCharArray()){
            if (Character.isLetter(c)){
                cleanmsg += c;
            }
        }

        String shiftmsg = "";
        for (int i = 0; i < cleanmsg.length(); i++){
            int shift = keyword.charAt(i % keyword.length()) - 'A';
            char c = cleanmsg.charAt(i);
            char out = (char)((c - 'A' + shift) % 26 + 'A');
            shiftmsg += out;
        }
    
        System.out.println(shiftmsg);
        }
}
