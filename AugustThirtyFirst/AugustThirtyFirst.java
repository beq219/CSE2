public class AugustThirtyFirst{
    
    // add main method
        public static void main(String[] args)  {
    // We are trying to figure out the processor speed of our computer
           
            float processorSpeed;
            byte numberProcessors;
            float computerSpeed; //this is a float because when you multply a float with a byte you get another float
            
            processorSpeed = 2.3f;
            numberProcessors = 3;
            
            computerSpeed = processorSpeed * numberProcessors;
            
            System.out.println("Computer Speed = " + computerSpeed);
            
}
}