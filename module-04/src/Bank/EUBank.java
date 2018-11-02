package Bank;

public class EUBank extends Bank {
  public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
    super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
  }

  @Override
  int getLimitOfWithdrawal() {
    if(getCurrency() == Currency.USA) return 2000;
    if(getCurrency() == Currency.EUR) return 2200;
    return 0;
  }

  @Override
  int getLimitOfFunding() {
    if(getCurrency() == Currency.USA) return 10000;
    if(getCurrency() == Currency.EUR) return 20000;
    return 0;
  }

  @Override
  int getMonthlyRate() {
    if(getCurrency() == Currency.USA) return 0;
    if(getCurrency() == Currency.EUR) return 1;
    return 0;
  }

  @Override
  double getCommission(int summ) {
    if(summ < 1000 && (getCurrency() == Currency.USA)) return summ*0.05;
    if(summ >= 1000 && (getCurrency() == Currency.USA)) return summ*0.07;

    if(summ < 1000 && (getCurrency() == Currency.EUR)) return summ*0.02;
    if(summ >= 1000 && (getCurrency() == Currency.EUR)) return summ*0.04;

    return 0;
  }
}
