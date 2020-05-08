import java.util.Random;

public class U1 extends Rocket {

    //Constructor:
    public U1() {
        this.rocketCost = 100;      //$100 million.
        this.rocketWeight = 10000;   //10 tonnes.
        this.maxRocketWeight = 18000;     //18 tonnes.
        this.cargoLimit = this.maxRocketWeight - this.rocketWeight; // 8 tonnes.
        this.currentWeightOfTheRocket = this.rocketWeight;
    }

    //Methods:
    @Override
    public boolean launch() {
    	
    	Random random=new Random();
        double launchances=random.nextDouble();
		this.chanceOfLaunchExplosion=0.05*(this.cargoCarried/this.cargoLimit);
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
		this.chanceOfLandingCrash=0.01*(this.cargoCarried/this.cargoLimit);
		if(chanceOfLandingCrash >= landchances)
		{  
			
			return false;
		}
		else {
		     return true;
				}
       
    }
}
