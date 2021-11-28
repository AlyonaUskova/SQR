package ru.netology.sqr;


public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long minValue = 200;
        long maxValue = 300;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(minValue,maxValue);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        boolean passed = expected == actual;

        // выводим результат
        System.out.println(passed);
    }
}
