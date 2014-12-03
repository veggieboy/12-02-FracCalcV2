import java.lang.Math;
public class RationalNumber
{
  int numer;
  int denom;
  
  public RationalNumber()
  {
    numer=0;
    denom=1;
  }
  
  public RationalNumber(int numerator, int denominator)
  {
    if (denominator==0)
    {
      denom=1;
    }
    if (denominator<0)
    {
      numerator=numerator*-1;
      denominator=Math.abs(denominator);
    }
    numer=numerator;
    denom=denominator;
  }
  
  public int getDenominator()
  {
    return denom;
  }
  
  public int getNumerator()
  {
    return numer;
  }
  
  public String toString()
  {
    int divisor=GreatestCommonDivisor(numer, denom);
    denom=denom/divisor;
    numer=numer/divisor;
    return numer+"/"+denom;
  }
  
  public int GreatestCommonDivisor(int first, int second) 
  {
    int temp;
    while (second != 0) {
      temp = second;
      second = first % second;
      first = temp;
    }        
    return first;
  }
  
  public void add(RationalNumber frac)
  {
    denom=frac.getDenominator()*denom;
    int num1=numer*frac.getDenominator();
    int num2=frac.getNumerator()*denom;
    numer=num1+num2;
    int divisor=GreatestCommonDivisor(numer, denom);
    denom=denom/divisor;
    numer=numer/divisor;
  }
  
  public void subtract(RationalNumber frac)
  {
    denom=frac.getDenominator()*denom;
    int num1=numer*frac.getDenominator();
    int num2=frac.getNumerator()*denom;
    numer=num1-num2;
    int divisor=GreatestCommonDivisor(numer, denom);
    denom=denom/divisor;
    numer=numer/divisor;
  }
  
  public void multiply(RationalNumber frac)
  {
    denom=frac.getDenominator()*denom;
    numer=numer*frac.getNumerator();
    int divisor=GreatestCommonDivisor(numer, denom);
    denom=denom/divisor;
    numer=numer/divisor;
  }
  
  public void divide(RationalNumber frac)
  {
    denom=frac.getNumerator()*denom;
    numer=numer*frac.getDenominator();
    int divisor=GreatestCommonDivisor(numer, denom);
    denom=denom/divisor;
    numer=numer/divisor;
  }
}
