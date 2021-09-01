package patterns.factory;

public abstract class ModernCar {

   protected abstract String getName();

   public void drive(){
       System.out.println("Car \"" + getName() + "\" is driving...");
   }
}
