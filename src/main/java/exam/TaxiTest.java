package exam;

import exam.model.Taxi;
import exam.service.TaxiService;

import java.util.Scanner;

public class TaxiTest {

    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();
        Taxi t1 = new Taxi("BMW", "Tadjikistan", 2017, 50001, false, 2000, 200, 4, 345.5f);
        Taxi t2 = new Taxi("Hyudai", "Siciliya", 2014, 30000, true, 2500, 450, 2, 202f);
        Taxi t3 = new Taxi("Porsche", "Sovitashen", 2015, 70000, true, 1300, 330, 6, 230.5f);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose action: ");

        System.out.println("1: printCostAndTopSpeedIfIsSport");
        System.out.println("2: getNewerTaxi");
        System.out.println("3: printTaxiCountryWithSmallestSeatsCount");
        System.out.println("4: printNotSportTaxis");
        System.out.println("5: printAllTaxisWithMinMillage50000km");
        System.out.println("6: getTaxiWithMinimalWeight");
        System.out.println("7: getTaxiWithMinimalCost");
        System.out.println("8: printTaxisOrderByYear");
        System.out.println("9: exit");

        Taxi taxi = null;
        boolean menuIsActive = true;
        while (menuIsActive) {
            switch (scanner.nextInt()) {
                case 1:
                    taxiService.printCostAndTopSpeedIfIsSport(t1);
                    break;
                case 2:
                    taxi = taxiService.getNewerTaxi(t1, t2);
                    System.out.println(taxi);
                    break;
                case 3:
                    taxiService.printTaxiCountryWithSmallestSeatsCount(t1, t2, t3);
                    break;
                case 4:
                    taxiService.printNotSportTaxis(new Taxi[]{t1, t2, t3});
                    break;
                case 5:
                    taxiService.printAllTaxisWithMinMillage50000km(new Taxi[]{t1, t2, t3});
                    break;
                case 6:
                    taxi = taxiService.getTaxiWithMinimalWeight(new Taxi[]{t1, t2, t3});
                    System.out.println(taxi);
                    break;
                case 7:
                    taxi = taxiService.getTaxiWithMinimalCost(new Taxi[]{t1, t2, t3});
                    System.out.println(taxi);
                    break;
                case 8:
                    taxiService.printTaxisOrderByYear(new Taxi[]{t1, t2, t3});
                    break;
                case 9:
                    menuIsActive = false;
                    break;
                default:
                    System.out.println("Choose right action: from 1 to 10");
            }
        }

    }
}
