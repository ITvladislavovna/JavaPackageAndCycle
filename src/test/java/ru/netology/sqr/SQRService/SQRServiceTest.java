package ru.netology.sqr.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void bottomRangMinimumValue() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(0, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upRangeMaximumValue() {
        SQRService service = new SQRService();
        int expected = 89;
        int actual = service.calculate(100, 9_800);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upRangeTopUpBorder() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(10_000, 11_000);
        Assertions.assertEquals(expected, actual);
    }

}



