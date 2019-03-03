package module_13;

import java.util.*;

public class VerkhovnaRada {
  private static VerkhovnaRada verkhovnaRada;
  private List<Fraction> fractions = new ArrayList<>();

  public VerkhovnaRada() {
  }

  public static VerkhovnaRada getVerkhovnaRada(){
    if(verkhovnaRada == null){
      verkhovnaRada = new VerkhovnaRada();
    }
    return verkhovnaRada;
  }

  public List<Fraction> getFractions() {
    return fractions;
  }

  public void addFraction(Fraction fraction){
    fractions.add(fraction);
  }

  public void deleteFraction(int index){
    fractions.remove(index);
  }

  public void printFractions(){
    fractions.forEach(System.out::println);
  }

  public void printFraction(int index){
    System.out.println(fractions.get(index));
    fractions.get(index).getList().forEach(System.out::println);
  }

  public void addDeputy(Deputy deputy, int index){
    fractions.get(index).addDeputy(deputy);
  }

  public void deleteDeputy(int fractionIndex, int deputyIndex){
    fractions.get(fractionIndex).deleteDeputy(deputyIndex);
  }

  public void printFractionBribers(int fractionIndex){
    fractions.get(fractionIndex).printBribers();
  }

  public void printMainBriber(int fractionIndex){
    fractions.get(fractionIndex).printSuperBriber();
  }

  public void printhAllFractionDeputy(int index){
    fractions.get(index).printAllDeputy();
  }
}
