import java.lang.Math;

public class Main {

    public static double R = 6371;

    public static void main(String[] args) {

        double dps, day1, day2, day3, day4, day5, day6, day7, day8, day9, day10, day11, day12, D;

        dps = calcDist("Day X",48.8567, 2.3508, 37.783333, -122.41667);
        System.out.printf("Distance from Paris to SF = %.2f km\n\n", dps);

        day1 = calcDist("Day 1",25, 15, 23, 20);
        day2 = calcDist("Day 2",23, 20, 21, 24);
        day3 = calcDist("Day 3",21, 24, 20, 27);
        day4 = calcDist("Day 4",20, 27, 19, 35);
        day5 = calcDist("Day 5",19, 35, 21, 46);
        day6 = calcDist("Day 6",21, 46, 23, 56);
        day7 = calcDist("Day 7",23, 56, 25, 65);
        day8 = calcDist("Day 8",25, 65, 28, 70);
        day9 = calcDist("Day 9",28, 70, 32, 73);
        day10 = calcDist("Day 10",32, 73, 34, 74);
        day11 = calcDist("Day 11",34, 74, 36, 74);
        day12 = calcDist("Day 12",36, 74, 39, 74);

        D = day1 + day2 + day3 + day4 + day5 + day6 + day7 + day8 + day9 + day10 + day11 + day12;

        System.out.printf("\nTotal distance traveled by Hurricane Gloria = %.2f km\n", D);

    }

    public static double calcDist(String dayNum, double dlat1, double dlong1, double dlat2, double dlong2){

        double lat1, lat2, long1, long2, a, c, d;

        lat1 = Math.toRadians(dlat1);
        long1 = Math.toRadians(dlong1);

        lat2 = Math.toRadians(dlat2);
        long2 = Math.toRadians(dlong2);

        a = Math.pow(Math.sin((lat1-lat2)/2),2) + Math.cos(lat1)*Math.cos(lat2)*Math.pow(Math.sin((long1-long2)/2),2);

        c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        d = R*c;
        System.out.println("Distance traveled on " +dayNum+" = " +d+ " km");

        return d;
    }
}
