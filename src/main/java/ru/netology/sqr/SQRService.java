package ru.netology.sqr;

public class SQRService {
    public long calculate(long minValue, long maxValue) {
// изначальное значение счетчика
        long num = 0;
        // цикл с последовательным перебором чисел от 10 до 99
        for (long i = 10; i <= 99; i++) {
            long j;
            // число в квадрате
            j = i * i;
            // сравнение квадрата с числами, вхоящими в диапазон
            if (j >= minValue && j <= maxValue) {
                // при выполнении условия счетчик увеличивается на 1
                num++;
            }
        }
        return num;
    }
}
