package org.academiadecodigo.variachis.investment_forecast_calculator;

public class Main {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        calculator.setInvestment(1000);
        calculator.setInterestRate(5);
        calculator.setTax(18);

        calculator.returnInvestmentForecastCalculator(1100);

    }
}