package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.sum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.average(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMax() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.monthWithMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMin() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthWithMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void moreThanAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.moreThanAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void lessThanAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.lessThanAverage(purchases);
        assertEquals(expected, actual);
    }
}