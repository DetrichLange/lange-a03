package baseline;

public class PaymentCalculator {
    double userBalance;
    double userAPR;
    double userPayment;

    public PaymentCalculator(double userBalance, double userAPR, double userPayment){
        this.userAPR = userAPR;
        this.userPayment = userPayment;
        this.userBalance = userBalance;
    }

    public int calculateMonthsUntilPaidOff(){
    }
}
