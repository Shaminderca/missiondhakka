import java.util.Random;

public class U2 extends Rocket {

    //Constructor:
    public U2() {
        this.rocketCost = 120;      //$120 million.
        this.rocketWeight = 18000;   //18 tonnes.
        this.maxRocketWeight = 29000;     //29 tonnes.
        this.cargoLimit = this.maxRocketWeight - this.rocketWeight; // 11 tonnes.
        this.currentWeightOfTheRocket = this.rocketWeight;
    }

    //Methods:
    @Override
    public boolean launch() {
    	
        	Random random=new Random();
            double launchances=random.nextDouble();
    		this.chanceOfLaunchExplosion=0.04*(this.cargoCarried/this.cargoLimit);
    		if(chanceOfLaunchExplosion >= launchances)
    		{  
    			
    			return false;
    		}
    		else {
    		     return true;
    				}
            
        }
      
        

    @Override
    public boolean land() {
    	
    
    	        //generate a random number using the probability equation
    	    	Random random=new Random();
    	        double landchances=random.nextDouble();
    			this.chanceOfLandingCrash=0.08*(this.cargoCarried/this.cargoLimit);
    			if(chanceOfLandingCrash >= landchances)
    			{  
    				
    				return false;
    			}
    			else {
    			     return true;
    					}
    	       
    	    }
     
}
