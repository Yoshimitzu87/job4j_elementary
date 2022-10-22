package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("RIDE");
    }

    @Override
    public void passengers(int passCount) {
        System.out.println(passCount);
    }

    @Override
    public int fuelCost(int litres) {
        int cost = 46;
        return litres * cost;
    }
}
