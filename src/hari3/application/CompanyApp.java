package hari3.application;

import hari3.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        // object innter class
        Company company = new Company();
        company.setName("Programmer Zaman Now");

        Company.Employee employee = company.new Employee();
        employee.setName("Dede Irwanto");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Eka Potabuga");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
