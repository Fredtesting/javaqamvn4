package ru.netology.javaqa.javaqamvn.services;

public class SalesService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int average = sumSales(sales);
        return average / sales.length;
    }

    public int belowAverageSales(int[] sales) {
        int average = averageSales(sales);
        int days = 0;
        for (int sale : sales) {
            if (sale < average) {
                days = days + 1;
            }
        }

        return days;
    }

    public int aboveAverageSales(int[] sales) {
        int average = averageSales(sales);
        int days = 0;
        for (int sale : sales) {
            if (sale > average) {
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
