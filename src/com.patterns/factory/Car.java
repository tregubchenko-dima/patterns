package com.patterns.factory;

public abstract class Car {

   protected abstract String getName();

   public void drive(){
       System.out.println("Car \"" + getName() + "\" is driving...");
   }
}
