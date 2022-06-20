public class Main {
    public static void main(String[] args) {
        SalesService service = new SalesService();
        int[] sales = {15, 50, 10, 47};
        int actual = service.maxSales(sales);
        System.out.println(actual);
    }
}
