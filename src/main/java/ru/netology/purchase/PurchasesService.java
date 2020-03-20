package ru.netology.purchase;

public class PurchasesService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public double getAveragePurchases(long[] purchases) {
        double average = 0;
        if (purchases.length > 0) {
            double sum = 0;
            for (int j = 0; j < purchases.length; j++) {
                sum += purchases[j];
            }
            average = sum / purchases.length;
                    }
        return average;
    }

    public double getMaxPurchases(long[] purchases) {
         long monthWithMax = purchases[0];
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] > monthWithMax) {
                monthWithMax = purchases[i];
            }
        }
        return monthWithMax;
    }
    public double getMinPurchases(long[] purchases) {
        long monthWithMin = purchases[0];
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] < monthWithMin) {
                monthWithMin = purchases[i];
            }
        }
        return monthWithMin;
    }
    public double getBelowAveragePurchases(long[] purchases) {
        long numberMonthBelowAverage = 0;
        double average = 15;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] < average) {
                numberMonthBelowAverage+= 1;
            }
        }
        return numberMonthBelowAverage;
    }
    public double getHigherAveragePurchases(long[] purchases) {
        long numberMonthHigherAverage = 0;
        double average = 15;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] > average) {
                numberMonthHigherAverage+= 1;
            }
        }
        return numberMonthHigherAverage;
    }
}
