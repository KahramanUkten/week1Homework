package homework;

import java.util.Scanner;

public class WeeklySalaryCalculation {
    public static void main(String[] args){

        System.out.println("Please enter weekly salary.");
        Scanner scanner = new Scanner(System.in);
        int weeklySalary = scanner.nextInt();

        System.out.println("Please enter weekdays working hours.");
        int weekdaysHours = scanner.nextInt();

        System.out.println("Please enter weekends working hours.");
        int weekendsHours = scanner.nextInt();

        scanner.close();

        Double hourlyWage = weeklySalary / 40.0 ;
        int totlyWorkingHour = weekdaysHours + weekendsHours;

        if( totlyWorkingHour == 40){

            System.out.println("Your weekly salary = " + weeklySalary);

        }

        else if(totlyWorkingHour < 40){

            double lessHourWorkingSalary = hourlyWage * totlyWorkingHour;
            System.out.println("Your weekly salary = " + lessHourWorkingSalary );

        }

        else if(totlyWorkingHour > 40 && totlyWorkingHour < 50 ) {

            double overTotlyWorkingWeekdaysSalary = (weekdaysHours - 40);

            if (overTotlyWorkingWeekdaysSalary <= 0) {
                double overHourWorkingWeekendsSalary = (weekendsHours) * (hourlyWage * 2);
                System.out.println("Your weekly salary = " + (overHourWorkingWeekendsSalary + weeklySalary));
            }
            else {
                double overHourWorkingWeekdaysSalary = (weekdaysHours - 40) * (hourlyWage * 1.5);
                double overHourWorkingWeekendsSalary = (weekendsHours) * (hourlyWage * 2);
                System.out.println("Your weekly salary = " + (overHourWorkingWeekendsSalary + weeklySalary + overHourWorkingWeekdaysSalary));
            }
        }
       else if(totlyWorkingHour >= 50) {

            double over50TotlyWorkingWeekdaysSalary = (weekdaysHours - 40);

            if (over50TotlyWorkingWeekdaysSalary <= 0) {
                double overHourWorkingWeekendsSalary = (weekendsHours) * (hourlyWage * 2);
                System.out.println("Your weekly salary = " + (overHourWorkingWeekendsSalary + weeklySalary + 500));
            }
            else {
                double overHourWorkingWeekdaysSalary = (weekdaysHours - 40) * (hourlyWage * 1.5);
                double overHourWorkingWeekendsSalary = (weekendsHours) * (hourlyWage * 2);
                System.out.println("Your weekly salary = " + (overHourWorkingWeekendsSalary + weeklySalary + overHourWorkingWeekdaysSalary + 500));
                 }

            }

        }

    }

