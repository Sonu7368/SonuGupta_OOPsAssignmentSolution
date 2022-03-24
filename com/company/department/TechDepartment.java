package com.company.department;

public class TechDepartment extends SuperDepartment {

    public String departmentName() {
        return "Tech Department";
    }

    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }

    public void showAllFunctions() {
        System.out.println(
                "Welcome to " + departmentName() + "\n" +
                getTodaysWork()     + "\n" +
                getWorkDeadline()   + "\n" +
                getTechStackInformation() + "\n" +
                isTodayHoliday()    + "\n"
        );
    }

}
