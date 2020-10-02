package paymentMethodFactory;

import paymentDetails.PaymentDetails;
import paymentMethods.PaymentMethod;

abstract class PaymentMethodFactory {
    public abstract PaymentMethod factoryMethod(PaymentDetails details);
}
    /*
    --Ejemplo de uso--
    *clase PaymentService*

    private PaymentMethodFactory factory;

    public void OxxoPay(float amount){
        paymentMethod = new OxxoMethodFactory();
        PaymentMethod OxxoPay = factory.factoryMethod(details);
        OxxoPay.pay(amount);
    }

    public void CardPay(float amount){
        paymentMethod = new CreditCardMethodFactory();
        PaymentMethod cardPay = factory.factoryMethod(details);
        cardPay.pay(amount);
    }

    -La clase payment service crea la instancia de la fabrica abstracta
    -En las funciones de pago la instancias con una de las 2 factorias
    -creas el método de pago y haces el trámite
    -De esta forma esta clase solo necesita agregar una función como
    esta para tener otro método de pago.
    **En un principio lo hice con la interfaz,pero me pareció mejor así xd**
     */

