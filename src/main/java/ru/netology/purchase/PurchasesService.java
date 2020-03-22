package ru.netology.purchase;

public class PurchasesService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long getAveragePurchases(long[] purchases) {
        long sum = calculateSum(purchases);
        return sum / purchases.length;
    }

    public double getMaxPurchases(long[] purchases) {
        long MaxPurchases = purchases[0];
        int monthWithMax = 1;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] > MaxPurchases) {
                monthWithMax = i + 1;
            } else break;
        }
        return monthWithMax;
    }

    public double getMinPurchases(long[] purchases) {
        long MinPurchases = purchases[0];
        int monthWithMin = 1;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] < MinPurchases) {
                monthWithMin = i + 1;
            } else break;
        }
        return monthWithMin;
    }

    public double getBelowAveragePurchases(long[] purchases) {
        long numberMonthBelowAverage = 0;
        double average = 15;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] < average) {
                numberMonthBelowAverage += 1;
            }
        }
        return numberMonthBelowAverage;
    }

    public double getHigherAveragePurchases(long[] purchases) {
        long numberMonthHigherAverage = 0;
        double average = 15;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] > average) {
                numberMonthHigherAverage += 1;
            }
        }
        return numberMonthHigherAverage;
    }
}
