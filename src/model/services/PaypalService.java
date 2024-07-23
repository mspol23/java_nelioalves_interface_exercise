package model.services;

public class PaypalService implements OnlinePaymentService {
	
	public Double paymentFee(Double amount) {
		
		return amount += amount * 0.1;
	
}
