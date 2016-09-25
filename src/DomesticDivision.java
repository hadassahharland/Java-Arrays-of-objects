/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class DomesticDivision extends Division {
    protected String state;

    public DomesticDivision(String division, String accountNo, String state) {
        super(division, accountNo);
        this.state = state;
    }
    @Override
    public void display() {
        System.out.println("The Division " + division + "(Account number " + accountNo + ") is located in " + state);


    }
}
