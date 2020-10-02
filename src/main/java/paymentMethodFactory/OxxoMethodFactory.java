package paymentMethodFactory;

import paymentDetails.PaymentDetails;
import paymentMethods.CreditCardMethod;
import paymentMethods.OxxoMethod;
import paymentMethods.PaymentMethod;

public class OxxoMethodFactory extends PaymentMethodFactory{

    public PaymentMethod factoryMethod(PaymentDetails details) {
        return new OxxoMethod(details);
    }
}


