package ru.netology.statistic.services;

public class StatisticService {
    public int countSum(int[] sum) {
        int count = 0;

        for (int i = 0; i < 12; i++) {
            count = count + sum[i];
        }
        return count;
    }

    public int countAverageSales(int[] average) {
        int sumAverage = countSum(average) / average.length;

        return sumAverage;
    }


    public int countMaxSales(int[] maxSales) {
        int maxMonth = 0;
        int monthNum = 0;

        for (int i = 0; i < 12; i++) {
            if (maxSales[maxMonth] > i) {
                maxMonth = monthNum;
            }
            monthNum = monthNum + 1;
        }
        return maxMonth;
    }


    public int countMinSales(int[] minSales) {
        int minMonth = 0;
        int month = 0;

        for (int i = 0; i < 12; i++) {
            if (i <= minSales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int countMonthsBelowAverage(int[] belowAverage) {
        int count = 0;

        int average = countAverageSales(belowAverage);
        for (int i = 0; i < belowAverage.length; i++) {
            if (belowAverage[i] < average) {
                count = count + 1;
            }
        }
        return count;
    }


    public int countMonthsAboveAverage(int[] aboveAverage) {
        int count = 0;

        int average = countAverageSales(aboveAverage);
        for (int i = 0; i < aboveAverage.length; i++) {
            if (aboveAverage[i] > average) {
                count = count + 1;
            }
        }
        return count;
    }
}


