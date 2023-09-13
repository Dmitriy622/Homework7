public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int amount = 2_459_000;
        int payment = 15_000;
        int mouth = 0;
        double total = 0;
        while (total <= amount) {
            total = total + payment;
            mouth++;
            System.out.println("Месяц " +mouth +" сумма накоплений равна " +total +" рублей");
        }

        System.out.println("Задание 2");
        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(x +" ");
        }
        System.out.println();
        for (; x>=1; x--){
            System.out.print(x +" ");
        }

        System.out.println("Задание 3");
        int populationCountry = 12_000_000;
        int fertility1000 = 17;
        int mortality1000 = 8;
        int years = 10;
        double populationDifference = (double) (fertility1000 - mortality1000) / 1000;
        int currentYear = 2023;
        for (int year = currentYear; year < currentYear + years; year++){
            populationCountry = (int) (populationCountry + populationCountry * populationDifference);
            System.out.println("Год " +year +" численность населения составляет " +populationCountry);
        }

        System.out.println("Задание 4");
        double contribution = 15_000;
        double interest = (double) 7/100;
        int mouth1 = 0;
        int amount1 = 12_000_000;
        while (contribution<=amount1){
            contribution = contribution + contribution * interest;
            mouth1++;
            System.out.println("Месяц " +mouth1 +" сумма накоплений равна " +contribution +" рублей");
        }
        // Не понимаю, при выводе в консоль более 9 миллионов числа становятся 1.2164247554669337E7

        System.out.println("Задание 5");
        double contribution2 = 15_000;
        double interest2 = (double) 7/100;
        int mouth2 = 0;
        int amount2 = 12_000_000;
        while (contribution2 <= amount2){
            contribution2 = contribution2 + contribution2 * interest2;
            mouth2++;
            if (mouth2 %6 ==0) {
                System.out.println("Месяц " + mouth2 + " сумма накоплений равна " + contribution2 + " рублей");
            }
        }

        System.out.println("Задание 6");
        double contribution3 = 15_000;
        double interest3 = (double) 7/100;
        int totalMouth = 9 * 12;
        int mouth3 = 0;
        while (mouth3 <= totalMouth){
            contribution3 = contribution3 + contribution3 * interest3;
            mouth3++;
            if (mouth3 %6 ==0) {
                System.out.println("Месяц " + mouth3 + " сумма накоплений равна " + contribution3 + " рублей");
            }
        }

        System.out.println("Задание 7");
        int firstday = 1;
        for (int day = 0; day <= 31; day++){
            if (day %7 == firstday){
                System.out.println("Сегодня пятница," +day +"-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println("Задание 8");
        int period = 79;
        int currentYear1 = 2023;
        int start = currentYear1 - 200;
        int end = currentYear1 + 100;
        for (int year = 0; year <= end; year++){
            if (year >= start && year % period ==0){
                System.out.println(year);
            }
        }
    }
}