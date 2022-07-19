package ru.netology.sqr.SQRService;

public class SQRService {
    public int calculate(int bottomRange, int upRange) {
        int first = 10;
        int last = 99;
        int number = 0;
        for (int i = first; i < last; i = i + 1) {
            if (bottomRange <= i * i && upRange >= i * i) {
                number = number + 1;

            }
        }
        return number;
    }
}