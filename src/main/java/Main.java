import ru.netology.statistic.services.StatisticService;

public class Main {
    public static void main(String[] args) {
        StatisticService service = new StatisticService();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int Sum = service.countSum(sum);
        System.out.println(Sum);


        //StatsService service = new StatsService();

        int[] average = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int method = service.countAverageSales(average);
        System.out.println(method);


        int[] maxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int count = service.countMaxSales(maxSales);
        System.out.println(count);

        int[] minSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthMin = service.countMinSales(minSales);
        System.out.println(monthMin);


        int[] belowAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int number = service.countMonthsBelowAverage(belowAverage);
        System.out.println(number);


        int[] aboveAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int months = service.countMonthsAboveAverage(aboveAverage);
        System.out.println(months);

    }

}





