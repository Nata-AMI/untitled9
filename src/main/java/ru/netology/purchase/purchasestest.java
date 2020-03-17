package ru.netology.purchase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class purchasesServiceTest {
    @Test
    void calculateSum() {
        PurchasesService service = new PurchasesService();

        // подготавливаем данные:
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        // вызываем целевой метод:
        int actual = service.calculateSum(purchases);
        // выводим результат
        assertEquals(expected,actual);
    }

   }