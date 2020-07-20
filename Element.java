/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopd.assignment;

/**
 *
 * @author youn
 */
//Element.java


public class Element
{
//instance variables
private String elementName;
int atomicNumber;
double atomicWeight;
private String symbol;
/* Constructor of class that takes element, atomic number and atomic weight */
public Element(int atomicNumber,String elementName,String symbol, double atomicWeight)
{
this.elementName=elementName;
this.atomicNumber=atomicNumber;
this.atomicWeight=atomicWeight;
this.symbol=symbol;
}
//returns element
public String getElementName()
{
return elementName;
}
//returns atomic number
public int getNumber()
{
return atomicNumber;
}
//return weight
public double getWeight()
{
return atomicWeight;
}
//return symbol
public String getSymbol()
{
return symbol;
}
//abstract method describeElement
//public  String describeElement();
}

    

