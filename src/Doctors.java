public  class Doctors extends HospitalServices{

    private  Persons persons;
    private int licenceNumber;
    private int appointmentNumber;
    private String speciality;
    public  Doctors(  Persons Persons ,int licenceNumber,int appointmentNumber,String speciality){
        this.persons= Persons;
        this.appointmentNumber=appointmentNumber=0;
        this.licenceNumber=licenceNumber;
        this.speciality=speciality;
    }
    public  void display(){
        persons.display();
        System.out.println(" licence Number"+licenceNumber);
        System.out.println(" appointment number"+ appointmentNumber);
    }
    @Override
    public void appointmentScheduling() {
        appointmentNumber++;
        System.out.println("Dr."+ persons.getPersonName());
        System.out.println(" scheduled appointment #"+ appointmentNumber);

    }

    @Override
    public double  billingOperation(double amount, String assuranceCode) {
        double pay=amount* 0.10;

        System.out.println( " insurance"+ assuranceCode+ "applied.pay:"+pay);
        return  pay;

    }

    @Override
    public double billingOperation(double amount) {
        System.out.println(" consultation fees:"+ amount);
        return  amount;

    }

    @Override
    public void medicalHistoryTracking(String patientName) {
        System.out.println(" Dr."+ persons.getPersonName());
        System.out.println("reviewing of :"+ patientName);

    }

    @Override
    public void emergenceCaseHandling() {
        System.out.println(" Dr."+persons.getPersonName());
        System.out.println("Responding to emergencies!");

    }
}