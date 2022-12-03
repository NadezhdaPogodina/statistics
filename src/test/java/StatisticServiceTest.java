import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.services.StatisticService;

public class StatisticServiceTest {

    @Test
    public void testCountSum() {

        StatisticService service = new StatisticService();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.countSum(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testCountAverageSum() {

        StatisticService service = new StatisticService();

        int[] average = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.countAverageSales(average);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMaxSum() {

        StatisticService service = new StatisticService();

        int[] maxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.countMaxSales(maxSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMinSum() {

        StatisticService service = new StatisticService();

        int[] minSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.countMinSales(minSales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCountMonthsBelowAverage() {
        StatisticService service = new StatisticService();

        int[] belowAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsBelowAverage(belowAverage);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCountMonthsAboveAverage() {
        StatisticService service = new StatisticService();

        int[] aboveAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsAboveAverage(aboveAverage);
        Assertions.assertEquals(expected, actual);

    }

}


