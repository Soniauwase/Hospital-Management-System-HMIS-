public class Receptionists extends HospitalServices{
    private  int  deskNumber;
    private Persons Persons;

    public  Receptionists( int deskNumber, Persons Persons){
        this.deskNumber=deskNumber;
        this.Persons= Persons;
    }
    public  void display(){
        Persons.display();
        System.out.println(" desk number:"+ deskNumber);

    }

    @Override
    public void appointmentScheduling() {
        System.out.println(Persons.getPersonName()+" do not schedule the appointment");

    }

    @Override
    public double billingOperation(double amount, String assuranceCode) {
        double discount= amount* 0.10;
        double pay= amount- discount;
        System.out.println(" insurance :"+ assuranceCode +" discountApplied.pay:"+pay);
        return pay;
    }

    @Override
    public double billingOperation(double amount) {
        System.out.println("service fee:"+ amount);
        return amount;
    }

    @Override
    public void medicalHistoryTracking(String patientName) {
        System.out.println(Persons.getPersonName());
        System.out.println( "is polling the record of patient"+ patientName);

    }

    @Override
    public void emergenceCaseHandling() {
        System.out.println(Persons.getPersonName()+"  welcoming emergencies and alerting emergency team!");

    }
    public void patientRegistration( String patientName){
        System.out.println("Helperdesk 1"+ Persons.getPersonName());
        System.out.println("registering :"+patientName);
    }
}
