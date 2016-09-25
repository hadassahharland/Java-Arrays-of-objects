import javax.swing.*;

import static java.lang.Double.parseDouble;

/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class PhoneCallArray {
    static PhoneCall[] phoneCalls = new PhoneCall[10];

    public static void main(String[] args) {
        buildArray();
        displayArray();
    }

    private static void displayArray() {
        for (int x = 0; x < phoneCalls.length; x++){
            System.out.println(phoneCalls[x].toString());
        }
    }

    private static void buildArray() {
        char inOrOut;
        String number;
        double callTime;
        for (int x = 0; x < phoneCalls.length; x++) {
            inOrOut = getDirection();
            number = JOptionPane.showInputDialog("Input phone number");
            if (inOrOut == 'i') {
                phoneCalls[x] = new IncomingPhoneCall(number);
            }
            else if (inOrOut == 'o') {
                String callTimeString = JOptionPane.showInputDialog("Input call length");
                callTime = parseDouble(callTimeString);
                phoneCalls[x] = new OutgoingPhoneCall(number, callTime);
            }
        }
    }

    public static char getDirection() {
        String inOrOut;
        inOrOut = JOptionPane.showInputDialog("Enter direction of call: [i]n or [o]ut");
        return inOrOut.charAt(0);
    }
}