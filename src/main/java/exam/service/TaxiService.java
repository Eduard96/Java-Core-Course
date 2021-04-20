package exam.service;

import exam.model.Taxi;

public class TaxiService {

    public void printCostAndTopSpeedIfIsSport(Taxi taxi) {
        if(taxi.isSport()) {
            System.out.printf("Cost: %.1f, top speed: %d\n", taxi.getCost(), taxi.getTopSpeed());
        } else {
            System.out.printf("Model: %s, country: %s\n", taxi.getModel(), taxi.getCountry());
        }
    }

    public Taxi getNewerTaxi(Taxi t1, Taxi t2) {
        return t1.getYear() >= t2.getYear() ? t1 : t2;
    }

    public void printTaxiCountryWithSmallestSeatsCount(Taxi t1, Taxi t2, Taxi t3) {
        if(t1.getNumberOfSeats() <= t2.getNumberOfSeats()) {
            System.out.println(t1.getNumberOfSeats() <= t3.getNumberOfSeats() ? t1.getCountry() : t3.getCountry());
        } else {
            System.out.println(t2.getNumberOfSeats() <= t3.getNumberOfSeats() ? t2.getCountry() : t3.getCountry());
        }
    }

    public void printNotSportTaxis(Taxi[] taxis) {
        for(Taxi taxi : taxis) {
            if(!taxi.isSport()) {
                System.out.println(taxi);
            }
        }
    }

    public void printAllTaxisWithMinMillage50000km(Taxi[] taxis) {
        for(Taxi taxi : taxis) {
            if(taxi.isSport() && taxi.getMillage() > 50_000) {
                System.out.println(taxi);
            }
        }
    }

    public Taxi getTaxiWithMinimalWeight(Taxi[] taxis) {
        Taxi minWeightTaxi = taxis[0];

        for(Taxi taxi : taxis) {
            if(minWeightTaxi.getWeight() > taxi.getWeight()) {
                minWeightTaxi = taxi;
            }
        }

        return minWeightTaxi;
    }

    public Taxi getTaxiWithMinimalCost(Taxi[] taxis) {
        Taxi minCostTaxi = null;

        for (Taxi taxi : taxis) {
            if (taxi.isSport()) {
                if (null == minCostTaxi) {
                    minCostTaxi = taxi;
                }
                if (taxi.getCost() < minCostTaxi.getCost()) {
                    minCostTaxi = taxi;
                }
            }
        }

        return minCostTaxi;
    }

    public void printTaxisOrderByYear(Taxi[] taxis) {
        for(Taxi a : sortTaxisByYear(taxis)) {
            System.out.println(a);
        }
    }

    private Taxi[] sortTaxisByYear(Taxi[] taxis) {
        for (int i = 0; i < taxis.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < taxis.length - i - 1; j++) {
                if(taxis[j].getYear() > taxis[j+1].getYear()) {
                    Taxi temp = taxis[j];
                    taxis[j] = taxis[j + 1];
                    taxis[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
        return taxis;
    }
}
