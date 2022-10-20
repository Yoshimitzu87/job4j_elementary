package ru.job4j.poly;

public interface Transport {
    void ride();

    void passengers(int passCount);

    int fuelCost(int litres);
}
