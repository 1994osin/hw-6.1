public class Main {
    public static void main(String[] args) {
        // Task 1
        int totalMoney = 0;
        int totalMoneyPlanned = 2_459_000;
        int monthlyFee = 15000;
        int numberOfMonths = 0;
        while (totalMoney <= totalMoneyPlanned) {
            totalMoney += totalMoney / 100;
            totalMoney += monthlyFee;
            numberOfMonths++;
        }
        System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + totalMoney + " рублей");
        System.out.println();

        // Task 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 3
        int populationInCountryY = 12_000_000;
        int birthRatePer1000People = 17;
        int deathRatePer1000People = 8;
        int year = 1;
        while (year <= 10) {
            populationInCountryY += (populationInCountryY / 1000 * birthRatePer1000People) -
                    (populationInCountryY / 1000 * deathRatePer1000People);
            System.out.println("Год " + year + ", численность населения составляет " + populationInCountryY);
            year++;
        }
    }
}