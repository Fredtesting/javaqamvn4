package ru.netology.javaqa.javaqamvn.services;
public class SalesService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];

        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int average = sumSales(sales);
        int averageSale = average / sales.length;
        return averageSale;
    }

    public int belowAverageSales(int[] sales) {
        int average = averageSales(sales);
        int days = 0;
        for (int i =0; i < sales.length; i++) {
            if (sales[i] < average) {
                days = days + 1;
            }
        }

        return days;
    }
    public int aboveAverageSales(int[] sales) {
        int average = averageSales(sales);
        int days = 0;
        for (int i =0; i < sales.length; i++) {
            if (sales[i] > average) {
                days = days + 1;
            }
        }

        return days;
    }
    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


}
