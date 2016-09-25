/**
 * Created by Dassa on 19/09/2016.
 */
public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall in = new IncomingPhoneCall("3291034");
        System.out.println(in.toString());
        OutgoingPhoneCall out = new OutgoingPhoneCall("3424654",24.5);
        System.out.println(out.toString());

    }

}
