package ru.netology.stats;

public class StatsService {


    public long statsTotalSalesAmount(long Sales[]) {
        long totalSalesAmount = 0;
        for (long sale : Sales) {
            totalSalesAmount += sale;
        }

        return totalSalesAmount;
    }

    public long statsAverageSalesAmount(long Sales[]) {
        long totalSalesAmount = 0;
        long averageSalesAmount;
        for (long sale : Sales) {
            totalSalesAmount += sale;
        }
        averageSalesAmount = totalSalesAmount / Sales.length;
        return averageSalesAmount;
    }

    public long statsMonthMaximumSalesAmount(long Sales[]) {
        long maximumSalesAmount = 0;
        int monthMaximumSalesAmount = 0;
        int month = 0;
        for (long sale : Sales) {
            month++;
            if (sale >= maximumSalesAmount) {
                maximumSalesAmount = sale;
                monthMaximumSalesAmount = month;
            }

        }
        return monthMaximumSalesAmount;
    }

    public long statsMonthMinimumSalesAmount(long Sales[]) {
        long minimumSalesAmount = Sales[0];
        int monthMinimumSalesAmount = 1;
        int month = 0;
        for (long sale : Sales) {
            month++;
            if (sale <= minimumSalesAmount) {
                minimumSalesAmount = sale;
                monthMinimumSalesAmount = month;
            }

        }
        return monthMinimumSalesAmount;
    }

    public long statsQuantityMonthBelowAverageSales(long Sales[]) {
        StatsService service = new StatsService();
        long averageSalesAmount = service.statsAverageSalesAmount(Sales);
        int quantityMonth = 0;
        for (long sale : Sales) {
            if (sale < averageSalesAmount) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }

    public long statsQuantityMonthAboveAverageSales(long Sales[]) {
        StatsService service = new StatsService();
        long averageSalesAmount = service.statsAverageSalesAmount(Sales);
        int quantityMonth = 0;
        for (long sale : Sales) {
            if (sale > averageSalesAmount) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }
}
