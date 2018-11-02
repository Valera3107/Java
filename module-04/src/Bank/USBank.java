package Bank;

public class USBank extends Bank {
  public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
    super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
  }

  @Override
  int getLimitOfWithdrawal() {
    if(getCurrency() == Currency.USA) return 1000;
    if(getCurrency() == Currency.EUR) return 1200;
    return 0;
  }

  @Override
  int getLimitOfFunding() {
    if(getCurrency() == Currency.EUR) return 10000;
    return 0;
  }

  @Override
  int getMonthlyRate() {
    if(getCurrency() == Currency.USA) return 1;
    if(getCurrency() == Currency.EUR) return 2;
    return 0;
  }

  @Override
  double getCommission(int summ) {
    if(summ < 1000 && (getCurrency() == Currency.USA)) return summ*0.05;
    if(summ >= 1000 && (getCurrency() == Currency.USA)) return summ*0.07;

    if(summ < 1000 && (getCurrency() == Currency.EUR)) return summ*0.06;
    if(summ >= 1000 && (getCurrency() == Currency.EUR)) return summ*0.08;

    return 0;
  }
}
