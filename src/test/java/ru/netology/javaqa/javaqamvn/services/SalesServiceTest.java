package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    public void sumSales() {
        SalesService service = new SalesService();
        int[] sales = {10, 10, 10, 10};
        long expected = 40;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageSales() {
        SalesService service = new SalesService();
        int[] sales = {10, 10, 10, 10};
        long expected = 10;
        long actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void belowAverageSales() {
        SalesService service = new SalesService();
        int[] sales = {10, 10, 10, 10};
        long expected = 0;
        long actual = service.belowAverageSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void aboveAverageSales() {
        SalesService service = new SalesService();
        int[] sales = {10, 20, 30, 40};
        long expected = 2;
        long actual = service.aboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minSales() {
        SalesService service = new SalesService();
        int[] sales = {10, -9, 12, 13};
        long expected = 2;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSales() {
        SalesService service = new SalesService();
        int[] sales = {10, 13, 12, 13};
        long expected = 2;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

}
