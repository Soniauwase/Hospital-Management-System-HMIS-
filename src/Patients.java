public  class Patients extends Persons{
    private   String  bloodType;
    private String assuranceNumber;
    private String diagnosis;


    public Patients(String personName, int personId, int personPhone, String personEmail, String personRole, int personAge, String assuranceNumber,String diagnosis,String bloodType) {
        super(personName, personId, personPhone, personEmail, personRole, personAge);
        this.assuranceNumber=assuranceNumber;
        this.bloodType=bloodType;
        this.diagnosis=diagnosis=" pending";
    }


    public Patients(String personName, int personAge, int personId) {
        super(personName, personAge, personId);
    }

    @Override
    public void display() {
        System.out.println("assurance number:"+ assuranceNumber);
        System.out.println(" blood group:"+ bloodType);
        System.out.println(" diagnosis:"+diagnosis);
    }
    public  void setDiagnosis(String d){
        this.diagnosis=diagnosis;
    }
    public  String getDiagnosis(){
        return  diagnosis;
    }
}
