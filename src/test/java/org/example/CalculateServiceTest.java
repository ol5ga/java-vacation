package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateServiceTest {
    private CalculateService calculateService;

    @BeforeEach
    public void setUp() {
        calculateService = new CalculateService();
    }

    @Test
    public void testGetPayment() {
        double salary = 29300.0;
        int days = 15;
        double expectedPayment = salary / 29.3 * days;
        double actualPayment = calculateService.getPayment(salary, days);

        assertEquals(expectedPayment, actualPayment, "Значение оплаты некорректно");
    }

    @Test
    public void testGetPaymentForZeroDays() {
        double salary = 29300.0;
        int days = 0;
        double expectedPayment = 0.0;
        double actualPayment = calculateService.getPayment(salary, days);

        assertEquals(expectedPayment, actualPayment, "Значение оплаты для 0 дней некорректно");
    }
}
