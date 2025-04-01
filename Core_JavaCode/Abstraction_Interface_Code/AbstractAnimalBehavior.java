abstract class Animal
{
 abstract void eat();
 abstract void sleep();
}
class Lion extends Animal
{
 void eat()
 {
  System.out.println("behavior  ");
 }
 void sleep()
 {
  System.out.println("behavior ");
 }
}
class Tiger extends Animal
{
 void eat()
 {
  System.out.println("behavior ");
 }
 void sleep()
 {
  System.out.println("behavior ");
 }
}

class Deer extends Animal
{
 void eat()
 {
  System.out.println("behavior ");
 }
 void sleep()
 {
  System.out.println("behavior ");
 }
}


public class AbstractAnimalBehavior
 {
 public static void main(String x[])
 {
 Animal a1=new Lion();
  a1.eat();
  a1.sleep();
 Animal b1=new Tiger();
  b1.eat();
  b1.sleep();
  Animal c1=new Deer();
  c1.eat();
  c1.sleep();
 }
}