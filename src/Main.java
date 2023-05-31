public class Main {
    public static void main(String[] args) {
        // task 1
        byte temperatureMin = -59;
        System.out.println("Значение переменной temperatureMin с типом byte равно " + temperatureMin);
        short yearDays = 365;
        System.out.println("Значение переменной yearDays с типом short равно " + yearDays);
        int matrixColourDepth6Bit = 262144;
        System.out.println("Значение переменной matrixColourDepth6Bit с типом int равно " + matrixColourDepth6Bit);
        long matrixColourDepth12Bit = 68719476736L;
        System.out.println("Значение переменной matrixColourDepth12Bit с типом long равно " + matrixColourDepth12Bit);
        float angleCos = 0.5f;
        System.out.println("Значение переменной angleCos с типом float равно " + angleCos);
        double pi10Signs = 3.1415926535;
        System.out.println("Значение переменной pi10Signs с типом double равно " + pi10Signs);

        // task 2
        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.768f;
        // чтобы задействовать для задания больше типов, можно и другой вариант -
        double num3_1 = 2.768;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        // чтобы задействовать для задания больше типов, можно и другой вариант -
        int num6_1 = 27897;
        // или такой вариант
        char num6_2 = 27897;
        byte num7 = 67;

        // task 3
        byte qtyLPStudents = 23;
        byte qtyASStudents = 27;
        byte qtyEAStudents = 30;
        int sheets = 480;
        int sheetsForOne = sheets / (qtyLPStudents + qtyASStudents + qtyEAStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsForOne + " листов бумаги");

        // task 4
        int qtyBottles = 16;
        byte time = 2;
        int bottlesInMinute = qtyBottles / time;
        int bottlesIn20Min = 20 * bottlesInMinute;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок");
        int bottlesInDay = 24 * 60 * bottlesInMinute;
        System.out.println("За 1 день машина произвела " + bottlesInDay + " штук бутылок");
        int bottlesIn3Day = 3 * bottlesInDay;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Day + " штук бутылок");
        int bottlesInMonth = 30 * bottlesInDay;
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");

        // task 5
        byte totalPaintCans = 120;
        byte whitePaintCansForOneClass = 2;
        byte brownPaintCansForOneClass = 4;
        int totalPaintCansForClass = whitePaintCansForOneClass + brownPaintCansForOneClass;
        int qtyClasses = totalPaintCans / totalPaintCansForClass;
        float partOfWhiteInSum = (float)whitePaintCansForOneClass / totalPaintCansForClass;
        float totalWhitePaintCans = partOfWhiteInSum * totalPaintCans;
        float totalBrownPaintCans = totalPaintCans - totalWhitePaintCans;
        System.out.println("В школе, где " + qtyClasses + " классов, нужно " + totalWhitePaintCans +
                " банок белой краски и " + totalBrownPaintCans + " банок коричневой краски");

        // task 6
        int qtyBananas = 5;
        int oneBananasWeightInGr = 80;
        int milkInMl = 200;
        float mlInGr = 105f / 100;
        int qtyIcecream = 2;
        int icecreamOnePcs = 100;
        int qtyEggs = 4;
        int oneEggsWeight = 70;
        float breakfastInGr = qtyBananas*oneBananasWeightInGr + (float)milkInMl*mlInGr + qtyIcecream*icecreamOnePcs + qtyEggs*oneEggsWeight;
        float breakfastInKg = 0.001f * breakfastInGr;
        System.out.println("Вес завтрака в граммах " + breakfastInGr + " граммов");
        System.out.println("Вес завтрака в килограммах " + breakfastInKg + " килограммов");

        // task 7
        float totalWeightLoss = 7;
        float minWeightLossInDay = 0.250f;
        float maxWeightLossInDay = 0.500f;
        float daysForMinWeightLoss = totalWeightLoss / minWeightLossInDay;
        float daysForMaxWeightLoss = totalWeightLoss / maxWeightLossInDay;
        float averageDays = (daysForMinWeightLoss + daysForMaxWeightLoss) / 2;
        System.out.println("При потере веса по 250 граммов в день спортсмен будет худеть " +
                daysForMinWeightLoss + " дней");
        System.out.println("При потере веса по 500 граммов в день спортсмен будет худеть " +
                daysForMaxWeightLoss + " дней");
        System.out.println("В среднем спортсмен будет худеть " + averageDays + " дней");

        // task 8
        int marySalary = 67760;
        int denSalary = 83690;
        int krisSalary = 76230;
        float salaryGrowth = 0.1f * 12;
        float marySalaryNew = 1.1f * marySalary;
        float marySalaryGrowth = salaryGrowth * marySalary;
        System.out.println("Маша теперь получает " + marySalaryNew + " рублей. Годовой доход вырос на " +
                marySalaryGrowth + " рублей");
        float denSalaryNew = 1.1f * denSalary;
        float denSalaryGrowth = salaryGrowth * denSalary;
        System.out.println("Денис теперь получает " + denSalaryNew + " рублей. Годовой доход вырос на " +
                denSalaryGrowth + " рублей");
        float krisSalaryNew = 1.1f * krisSalary;
        float krisSalaryGrowth = salaryGrowth * krisSalary;
        System.out.println("Кристина теперь получает " + krisSalaryNew + " рублей. Годовой доход вырос на " +
                krisSalaryGrowth + " рублей");
    }
}