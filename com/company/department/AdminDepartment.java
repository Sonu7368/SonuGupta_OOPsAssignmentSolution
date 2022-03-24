package com.company.department;

public class AdminDepartment extends SuperDepartment{

    public String departmentName() {
        return "Admin Department";
    }

    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
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
