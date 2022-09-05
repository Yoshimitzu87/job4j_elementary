package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP10K3Square4() {
        double expected = 4.68;
        int p = 10;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP15K3Square10() {
        double expected = 10.54;
        int p = 15;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K4Square16() {
        int expected = 16;
        int p = 20;
        int k = 4;
        int out = (int) SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K2Square8() {
        int expected = 8;
        int p = 12;
        int k = 2;
        int out = (int) SqArea.square(p, k);
        Assert.assertEquals(expected, out);
    }
}