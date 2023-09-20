package Lab2c;

//line 25 error is that the mobilecomputer class cannot access the interface chargeable methods
//to solve that problem, we need to add the implement keyword in the mobilecomputer class
//so the mobilecomputer can access the interface chargeable now.
public class MobileComputer extends Computer implements Chargeable{
    private int battery;
    public MobileComputer() {
        secret = "MobileComputer secret";
        battery = 5;
    }
    @Override
    public void work(){
        if(battery>0){
            System.out.println("It is working on my lap.");
            battery--;
        }
        else{
            System.out.println("Running out of battery");
        }
    }
    public void charge(){
        if (battery < 10){
            battery++;
        }
    }
}
