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
        long minValue = 200;
        long maxValue = 324;
        long expected = 4; // должны подойти 15,16,17,18

        // вызываем целевой метод:
        long actual = service.calculate(minValue,maxValue);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long minValue = 224;
        long maxValue = 256;
        long expected = 2;//должны подойти 15 и 16

        // вызываем целевой метод:
        long actual = service.calculate(minValue,maxValue);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}
