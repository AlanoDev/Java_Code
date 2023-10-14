package Test2_oop;

public class Polymorphic {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7500),
                new stateCouncilSpecialAllowance(1999999)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income...incomes){
        double total = 0;
        for (Income income:incomes) {
            total = total + income.getTax();
        }
        return total;
    }

}

class Income{
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public double getTax(){
        System.out.println("IncomeTax:" + income*0.1);
        return income*0.1;
    }
}

class Salary extends Income{

    public Salary(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if(income <= 5000){
            return 0;
        }
        System.out.println("SalaryTax:"+(income - 5000) * 0.2);
        return (income - 5000) * 0.2;
    }

}

class stateCouncilSpecialAllowance extends Income{
    public stateCouncilSpecialAllowance(double income){
        super(income);
    }

    @Override
    public double getTax() {
        System.out.println("0");
        return 0;
    }
}