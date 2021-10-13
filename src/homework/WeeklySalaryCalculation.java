package homework;

import java.util.Scanner;

public class WeeklySalaryCalculation {
    public static void main(String[] args){

        int workingtime = 0;
        int standardtime = 40;
        double salary = 0;
        int weekendsHours = 0;
        int weekdaysHours = 0;

        Scanner weeklySalary = new Scanner(System.in);

        Scanner newworkingtime = new Scanner(System.in);

        Scanner newweekendsHours = new Scanner(System.in);

        System.out.println("Please enter weekly salary");
        salary = weeklySalary.nextInt();
        System.out.println("Please enter weekdays working hours.");
        workingtime = newworkingtime.nextInt();
        System.out.println("Please enter weekends working hours.");
        weekendsHours = newweekendsHours.nextInt();


        System.out.println("Salary: " +salary);

        System.out.println("Working time:" +workingtime);

        System.out.println("Working time at weekend " +weekendsHours);

        int extratimeweek = workingtime-standardtime;
        System.out.println("Extra time for weekdays " +extratimeweek);

        int extratimeweekend = weekendsHours-weekdaysHours;
        System.out.println("Extra time for weekened " +extratimeweekend);

        double hourlyunit = salary / workingtime;
        System.out.println("Hourly unit " +hourlyunit);

        double weekdaysalary = 0;
        double weekendsalary = 0;
        double reducesalary = 0;
        int bonus = 0;

        if (extratimeweek > 0){
            weekdaysalary = ((hourlyunit*1.5)*extratimeweek);
            System.out.println("Output for weekday " +weekdaysalary);
        }
        if (extratimeweekend >0) {
            weekendsalary = ((hourlyunit*2)*extratimeweekend);
            System.out.println("output for weekend " +weekendsalary);
        }
        if (extratimeweek > 0 && extratimeweekend > 0){
            bonus = bonus + 500;
        }
        if (workingtime<standardtime){
            reducesalary =-((workingtime-standardtime)*hourlyunit);
        }
        salary = salary+weekdaysalary+weekendsalary+bonus-reducesalary;
        System.out.println("Total salary: " +salary);

        }

    }

