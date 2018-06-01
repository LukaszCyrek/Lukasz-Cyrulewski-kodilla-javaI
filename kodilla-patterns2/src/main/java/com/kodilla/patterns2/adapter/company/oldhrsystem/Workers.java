package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
        {"23457426783", "John", "Smith"},
        {"87653267321", "Ivone", "Novak"},
        {"76532145789", "Jessie", "Pinkman"},
        {"76532346721", "Walter", "White"},
        {"76454553421", "Clara", "Lanson"}};
    private double [] salaries = {
            4500.00,
            3700.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
