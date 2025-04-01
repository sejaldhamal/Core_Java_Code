/*2. Create a LightBulb class
     Create a LightBulb class with a field state (boolean).
     Use the default constructor to set the bulb to off (false).
     Add methods turnOn() and turnOff() to toggle the state and display the current state.
     Explanation: Covers state management in an object and logic toggling.*/


 class LightBulb 
    {
    private boolean state; 

    
    LightBulb() {
        this.state = false; 
    }

    
     void turnOn() {
        this.state = true; 
        System.out.println("The light bulb is now ON.");
    }

 
     void turnOff() {
        this.state = false; 
        System.out.println("The light bulb is now OFF.");
    }

    
    void displayState() {
        if (state) 
        {
            System.out.println("The light bulb is currently ON.");
           }

      else {
            System.out.println("The light bulb is currently OFF.");
           }
       }
}
      public class ConstructorBulb
      {
         public static void main(String[] args) 
          {
              LightBulb bulb = new LightBulb();

       
        bulb.displayState();

      
        bulb.turnOn();
        bulb.displayState(); 

       
        bulb.turnOff();
        bulb.displayState(); 
    }
}