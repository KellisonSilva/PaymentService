package application;

import Services.OnlinePaymentService;
import Services.PayPalService;

public class Application {

	public static void main(String[] args) {

		OnlinePaymentService service1 = new PayPalService();
		Double resultOne = service1.interest(200.00, 1);

		OnlinePaymentService service2 = new PayPalService();
		Double resultwo = service2.interest(200.00, 2);

		OnlinePaymentService service3 = new PayPalService();
		Double resulthree = service3.interest(200.00, 3);

		
		Double paymentFeeResult1 = service1.paymentFee(resultOne);
		System.out.println(paymentFeeResult1);
	}

}
