package org.academiadecodigo.variachis.investment_forecast_calculator;

import java.text.DecimalFormat;

public class Calculator extends Object{

    private double investment;

    public void setInvestment(double amount) {
        this.investment = amount;
    }

    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate / 100;
    }


    private double tax;

    public void setTax(double tax) {
        this.tax = tax / 100;
    }

    public void returnInvestmentForecastCalculator(double amount) {
        double earnings = investment * interestRate;
        double realEarning = earnings - (earnings * tax);
        double yearsOfInvestment = (amount - investment) / realEarning;

        System.out.println("It'll be necessary " + (int) Math.ceil(yearsOfInvestment) + " years to achieve the desired investment return.");

    }


}