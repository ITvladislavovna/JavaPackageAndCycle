package ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int bottomRange = 100;
        int upRange = 200;
        int amount = service.calculate (bottomRange,upRange);
        System.out.println (amount);
    }
}

