package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to02then2() {
        double expected = 2.00;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when10to02then2point23() {
        double expected = 2.23;
        Point a = new Point(1, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to22then2point82() {
        double expected = 2.82;
        Point a = new Point(2, 2);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when222to000then3point46() {
        double expected = 3.46;
        Point a = new Point(2, 2, 2);
        Point b = new Point(0, 0, 0);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}

