package Services;

public class PayPalService implements OnlinePaymentService {

	Double resultInterest;
	
	@Override
	public Double paymentFee(Double amount) {
		
		return null;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		
		resultInterest = amount + 0.01 * months;
		return resultInterest;
	
	}

}
