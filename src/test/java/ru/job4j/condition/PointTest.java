package ru.job4j.condition;

import org.junit.Test;

import  org.junit.Assert;

public class PointTest {

    @Test
    public void when11to22then0() {
        double expected = 0.00;
        int x1 = 1;
        int y1 = 2;
        int x2 = 1;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when56to67then1dot41() {
        double expected = 1.41;
        int x1 = 5;
        int y1 = 6;
        int x2 = 6;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when28to19then10() {
        double expected = 10.00;
        int x1 = 2;
        int y1 = 1;
        int x2 = 8;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}