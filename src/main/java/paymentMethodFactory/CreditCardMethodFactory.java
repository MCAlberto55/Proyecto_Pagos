package paymentMethodFactory;

import paymentDetails.PaymentDetails;
import paymentMethods.CreditCardMethod;
import paymentMethods.PaymentMethod;

public class CreditCardMethodFactory extends  PaymentMethodFactory{

    public PaymentMethod factoryMethod(PaymentDetails details){
        return new CreditCardMethod(details);
    }
}
