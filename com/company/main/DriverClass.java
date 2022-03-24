package com.company.main;

import com.company.department.AdminDepartment;
import com.company.department.HRDepartment;
import com.company.department.TechDepartment;

public class DriverClass {

    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        HRDepartment hrDepartment = new HRDepartment();
        TechDepartment techDepartment = new TechDepartment();

        adminDepartment.showAllFunctions();
        hrDepartment.showAllFunctions();
        techDepartment.showAllFunctions();

    }

}
