public class SalaryCalculator {

    int daysSkipped;
    int productsSold;
    double salary= 1000;
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = daysSkipped < 5 ? 1.0 : 0.85;
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        int bonusMultiplier = productsSold < 20 ? 10 : 13;
        return bonusMultiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        double bonusForProductsSold = productsSold * bonusMultiplier(productsSold);
        return bonusForProductsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        salary = ((this.salary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold) >= 2000) ? 2000 : ((this.salary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold));
        return salary;
    }
}
