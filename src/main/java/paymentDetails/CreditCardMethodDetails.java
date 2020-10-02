package paymentDetails;

public interface CreditCardMethodDetails {
    String getCreditCardNumber();
    String getCreditCardOwnerName();
    int getCreditCardExpirationMonth();
    int getCreditCardExpirationYear();
    String getCreditCardCVC();
}
