package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToPound(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {

        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        float pound = Converter.rubleToPound(450);
        System.out.println("450 rubles are " + pound + " pounds.");

        float inEu = 140;
        float expectedEu = 2;
        float outEu = Converter.rubleToEuro(inEu);
        boolean passedEu = expectedEu == outEu;
        System.out.println("140 rubles are 2. Test result : " + passedEu);

        float inDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("180 rubles are 3. Test result : " + passedDollar);

        float inPound = 450;
        float expectedPound = 5;
        float outPound = Converter.rubleToPound(inPound);
        boolean passedPound = expectedPound == outPound;
        System.out.println("450 rubles are 5. Test result : " + passedPound);

    }
}