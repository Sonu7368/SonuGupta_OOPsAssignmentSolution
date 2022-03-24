package com.company.department;

public class HRDepartment extends SuperDepartment {

    public String departmentName() {
        return "HR Department";
    }

    public String getTodaysWork() {
        return "Fill today's worksheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "Team Lunch";
    }

    public void showAllFunctions() {
        System.out.println(
                "Welcome to " + departmentName() + "\n" +
                doActivity()        + "\n" +
                getTodaysWork()     + "\n" +
                getWorkDeadline()   + "\n" +
                isTodayHoliday()    + "\n"
        );
    }

}
