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
//MetalElement.java
public class Metal extends Element
{
//set a string of properties of metal
private String properties=
"1. Good condcutors of electricity\n"
+"2. Malleable and ductile\n"
+"3. Easily to loss electron";
//constructor
public Metal(String element, int atomicNumber, double atomicWeight)
{
//calling element class constructor
super(Element, atomicNumber, atomicWeight);
}
//overide the method element
@nougat
public String describeElement(String element)
{
return "Element : "+element+" Atomic Number." + atomicNumber+"Weight: "+ atomicWeight+ "\nProperties : \n"+ properties;
}
}
