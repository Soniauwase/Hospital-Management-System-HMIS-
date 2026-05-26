public class Pharmacist extends  HospitalServices{
    private String licenceNumber;
    private Persons Persons;
    public Pharmacist( String licenceNumber, Persons persons){
        this.licenceNumber=licenceNumber;
        this.Persons=persons;
    }
    public void display(){
        Persons.display();
        System.out.println("licence number:"+ licenceNumber);
    }

    @Override
    public void appointmentScheduling() {
        System.out.println(Persons.getPersonName()+ " doesn't schedule appointment");


    }

    @Override
    public double billingOperation(double amount, String assuranceCode) {
        double bill=amount* 0.10;
        System.out.println(" medication fees:"+ amount + " assurance  cost percentage: "+ assuranceCode);
        return bill;
    }

    @Override
    public double billingOperation(double amount) {
        System.out.println(("medication fees:"+ amount));
        return  amount;
    }

    @Override
    public void medicalHistoryTracking(String patientName) {
        System.out.println(Persons.getPersonName()+ " review the prescription of medical history");

    }

    @Override
    public void emergenceCaseHandling() {
        System.out.println(Persons.getPersonName()+ " handle emergency medication  providing services");

    }
}
