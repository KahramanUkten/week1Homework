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

        double hourlyWage = weeklySalary / 40.0 ;
        int totalyWorkingHour = weekdaysHours + weekendsHours;

        if( totalyWorkingHour == 40){

            System.out.println("Your weekly salary = " + weeklySalary + "$");

        }

        else if(totalyWorkingHour < 40){

            double lessHourWorkingSalary = hourlyWage * totalyWorkingHour;
            System.out.println("Your weekly salary = " + lessHourWorkingSalary + "$" );

        }

        if(totalyWorkingHour > 40 && totalyWorkingHour < 50 ) {

            double overTotlyWorkingWeekdaysSalary = (weekdaysHours - 40);

            if (overTotlyWorkingWeekdaysSalary <= 0) {
                double overHourWorkingWeekendsSalary = (weekendsHours) * (hourlyWage * 2);
                System.out.println("Your weekly salary = " + (overHourWorkingWeekendsSalary + weeklySalary) + "$");
            }
            else {
                double overHourWorkingWeekdaysSalary = (weekdaysHours - 40) * (hourlyWage * 1.5);
                double overHourWorkingWeekendsSalary = (weekendsHours) * (hourlyWage * 2);
                System.out.println("Your weekly salary = " + (overHourWorkingWeekendsSalary + weeklySalary + overHourWorkingWeekdaysSalary) + "$");
            }
        }
       else if(totalyWorkingHour >= 50) {

            double over50TotlyWorkingWeekdaysSalary = (weekdaysHours - 40);

            if (over50TotlyWorkingWeekdaysSalary <= 0) {
                double overHourWorkingWeekendsSalary = (weekendsHours) * (hourlyWage * 2);
                System.out.println("Your weekly salary = " + (overHourWorkingWeekendsSalary + weeklySalary + 500) + "$");
            }
            else {
                double overHourWorkingWeekdaysSalary = (weekdaysHours - 40) * (hourlyWage * 1.5);
                double overHourWorkingWeekendsSalary = (weekendsHours) * (hourlyWage * 2);
                System.out.println("Your weekly salary = " + (overHourWorkingWeekendsSalary + weeklySalary + overHourWorkingWeekdaysSalary + 500) + "$");
                 }

            }

        }

    }

