package ru.netology.purchase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchasesServiceTest {
    @Test
    void calculateSum() {
        PurchasesService service = new PurchasesService();
        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        // вызываем целевой метод:
        long actual = service.calculateSum(purchases);
        // выводим результат
        assertEquals(expected, actual);
    }


    @Test
    void getAveragePurchases() {
        PurchasesService service = new PurchasesService();
        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        // вызываем целевой метод:
        long actual = service.getAveragePurchases(purchases);
        // выводим результат
        assertEquals(expected, actual);
    }

    @Test
    void getMaxPurchases() {
        PurchasesService service = new PurchasesService();
        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        // вызываем целевой метод:
        double actual = service.getMaxPurchases(purchases);
        // выводим результат
        assertEquals(expected, actual);
    }

    @Test
    void getMinPurchases() {
        PurchasesService service = new PurchasesService();
        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        // вызываем целевой метод:
        double actual = service.getMinPurchases(purchases);
        // выводим результат
        assertEquals(expected, actual);
    }

    @Test
    void getBelowAveragePurchases() {
        PurchasesService service = new PurchasesService();
        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 4;
        // вызываем целевой метод:
        double actual = service.getBelowAveragePurchases(purchases);
        // выводим результат
        assertEquals(expected, actual);
    }

    @Test
    void getHigherAveragePurchases() {
        PurchasesService service = new PurchasesService();
        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        // вызываем целевой метод:
        double actual = service.getHigherAveragePurchases(purchases);
        // выводим результат
        assertEquals(expected, actual);
    }
}
