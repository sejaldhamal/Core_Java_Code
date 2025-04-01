abstract class Animal
{
 abstract void sound();
}
class Lion extends Animal
{
 void sound()
 {
  System.out.println("Lion Sound");
 }
}
class Tiger extends Animal
{
 void sound()
 {
 System.out.println("Tiger Sound");
 }
}

public class AbstractAnimal
 {
 public static void main(String x[])
 {
 Animal a1=new Lion();
  a1.sound();
 Animal b1=new Tiger();
  b1.sound();
 }
}