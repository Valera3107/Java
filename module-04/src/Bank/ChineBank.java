package Bank;

public class ChineBank extends Bank {
  public ChineBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
    super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
  }

  @Override
  int getLimitOfWithdrawal() {
    if(getCurrency() == Currency.USA) return 100;
    if(getCurrency() == Currency.EUR) return 150;
    return 0;
  }

  @Override
  int getLimitOfFunding() {
    if(getCurrency() == Currency.USA) return 5000;
    if(getCurrency() == Currency.EUR) return 10000;
    return 0;
  }

  @Override
  int getMonthlyRate() {
    if(getCurrency() == Currency.USA) return 1;
    if(getCurrency() == Currency.EUR) return 0;
    return 0;
  }

  @Override
  double getCommission(int summ) {
    if(summ < 1000 && (getCurrency() == Currency.USA)) return summ*0.03;
    if(summ >= 1000 && (getCurrency() == Currency.USA)) return summ*0.05;

    if(summ < 1000 && (getCurrency() == Currency.EUR)) return summ*0.1;
    if(summ >= 1000 && (getCurrency() == Currency.EUR)) return summ*0.11;

    return 0;
  }
}
