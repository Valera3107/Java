package Bank;

public class Main {
  public static void main(String[] args) {
    Bank USABankForPeople = new USBank(01001101, "USA", Currency.USA, 5432, 1000, 2, 10000000);
    Bank EURBankForPeople = new EUBank(10000110, "France", Currency.EUR, 3423, 1500, 3, 90487302);

    Bank USABankForMillioner = new USBank(11100001, "USA", Currency.USA, 1234, 6000, 1, 999999999);
    Bank ChinaPeopleBank = new ChineBank(00000111, "China", Currency.USA, 8451, 500, 5, 1000200);

    Bank GermanyFirstBank = new EUBank(01001101, "Germany", Currency.EUR, 5432, 1000, 2, 10000000);
    Bank ShanHaiBank = new ChineBank(01111110, "Chine", Currency.USA, 9412, 1550, 4, 100000);



    User user1 = new User(0001, "Jack", 2400.34, 12, "Google", 5200, USABankForPeople);
    User user2 = new User(0010, "Mickle", 187430.94, 6, "Apple", 16200, USABankForMillioner);

    User user3 = new User(0011, "Otto", 7499.73, 9, "BMW", 2250, GermanyFirstBank);
    User user4 = new User(0100, "Mageno", 3300.12, 4, "PaneCake", 1200, EURBankForPeople);

    User user5 = new User(0101, "Sin Hu An", 308.28, 17, "Meizu", 600, ChinaPeopleBank);
    User user6 = new User(0110, "Li Shan", 1008.55, 22, "Huavei", 890, ShanHaiBank);

    BankSystemImpl bankSystemForUser = new BankSystemImpl();

    bankSystemForUser.withdrawOfUser(user1, 1000);
    bankSystemForUser.paySalary(user3);
    bankSystemForUser.transferMoney(user4, user5, 26655);
    bankSystemForUser.fundUser(user6, 3000);
  }
}
