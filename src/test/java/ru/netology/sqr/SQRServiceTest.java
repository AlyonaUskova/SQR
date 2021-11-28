package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest{
    @org.junit.jupiter.api.Test
    void shouldCalculateRight() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long minValue = 200;
        long maxValue = 300;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(minValue,maxValue);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMoreRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long minValue = 100;
        long maxValue = 300;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(minValue,maxValue);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long minValue = 250;
        long maxValue = 300;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(minValue,maxValue);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}