12-02-FracCalcV2
================

## Objectives
- Understand how to represent an object's state as *fields*
- Understand how to represent an object's behavior as instance *methods*
- Be able to implement a class with *multiple constructors*

## Assignment
Write a class called RationalNumber (RationalNumber.java) that represents a fraction with an integer numerator and denominator. 
- Complete the main class FracCalcV2 to create two instances, print them, then add, subtract multiply and divide the two - see the comments for pseudocode in the main program
- A RationalNumber object should have the following methods:

### Constructors
- **public RationalNumber()**: Constructs a new rational number to represent the ratio (0/1).
- **public RationalNumber(int numerator, int denominator)**: Constructs a new rational number to represent the ratio (numerator/denominator) in reduced form. The denominator cannot be 0, so set denominator to 1 if 0 is passed.

### Accessors
- **public int getDenominator()**: Returns this rational number’s denominator value; for example, if the ratio is (3/5), returns 5.
- **public int getNumerator()**: Returns this rational number’s numerator value; for example, if the ratio is (3/5), returns 3.
- **public String toString()**: Returns a reduced String representation of this rational number, such as "3/5" or  returning "1/2" instead of "3/6". You should omit denominators of 1, returning "4" instead of "4/1".

### Mutators
- **public void add(RationalNumber frac)**: adds frac to this instance of RationalNumber
- **public void subtract(RationalNumber frac)**: subtract frac from this instance of RationalNumber
- **public void multiply(RationalNumber frac)**: multiplies this instance of RationalNumber by frac
- **public void divide(RationalNumber frac)**: divides this instance of RationalNumber by frac

## Output
```
frac1: 1/2
frac1: 1/4
frac1 + frac2: 3/4
frac1 - frac2: 1/2
frac1 * frac2: 1/8
frac1 / frac2: 1/2
```

## HINT
Add the following methods to RationalNumber to reduce the rational number in the toString() method:

```
// Euclid's algorithm - http://en.wikipedia.org/wiki/Euclidean_algorithm
public int GreatestCommonDivisor(int first, int second) {
    int temp;
    while (second != 0) {
        temp = second;
        second = first % second;
        first = temp;
    }        
    return first;
}    
```
