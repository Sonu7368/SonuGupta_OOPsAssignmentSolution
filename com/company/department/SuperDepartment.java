package com.company.department;

public class SuperDepartment {

    public String departmentName() {
        return "Super Department";
    }

    public String getTodaysWork() {
        return "No Work as of Now";
    }

    public String getWorkDeadline() {
        return "Nil";
    }

    public String isTodayHoliday() {
        return "Today is not a holiday";
    }

    public void showAllFunctions() {
        System.out.println(
                "Welcome to " + departmentName() + "\n" +
                getTodaysWork()     + "\n" +
                getWorkDeadline()   + "\n" +
                isTodayHoliday()    + "\n"
        );
    }
}
