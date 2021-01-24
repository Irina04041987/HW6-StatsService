package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldStatsTotalSalesAmount() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.statsTotalSalesAmount(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldStatsAverageSalesAmount() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.statsAverageSalesAmount(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldstatsMonthMaximumSalesAmount() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.statsMonthMaximumSalesAmount(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldstatsMonthMinimumSalesAmount() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.statsMonthMinimumSalesAmount(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldstatsQuantityMonthBelowAverageSales() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.statsQuantityMonthBelowAverageSales(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldstatsQuantityMonthAboveAverageSales() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.statsQuantityMonthBelowAverageSales(Sales);
        assertEquals(expected, actual);
    }
}