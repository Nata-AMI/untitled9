package ru.netology.purchase;

public class PurchasesService{
    public long calculateSum(long []purchases) {
        long sum=0;
        for (long purchase:purchases){
        sum += purchase;
         }
        return sum;
    }
}