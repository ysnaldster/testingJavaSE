package com.platzi.javatests.payment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    //Aca se porten las partes comunes del codigo que se utilizan en todos los métodos.
        //El before lo que hace es que JUnit entiende que debe de ejecutar este metodo cada vez antes de ejecutar un test.
    @Before
    public void setup(){
         paymentGateway = Mockito.mock(PaymentGateway.class);
         paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void testPayment_GiveCorrectStatus_ShouldReturnPaymentCorrect() {
        //Arrange

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(
                new PaymentResponse(PaymentResponse.PaymentStatus.OK)
        );

        Boolean expectedResult = true;
        //Act
        Boolean actualResult = paymentProcessor.makePayment(1000);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPayment_GivenWrongResult_ShouldReturnWrong () {
        //Arrange
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(
                new PaymentResponse(PaymentResponse.PaymentStatus.ERROR)
        );
        Boolean expectedResult = false;
        //Act
        Boolean actualResult = paymentProcessor.makePayment(1000);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}