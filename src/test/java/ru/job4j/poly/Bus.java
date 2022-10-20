package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
    }

    @Override
    public void passengers(int passCount) {
    }

    @Override
    public int fuelCost(int litres) {
        int cost = 46;
        return litres * cost;
    }
}
