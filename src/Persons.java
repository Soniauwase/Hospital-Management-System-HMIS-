public   class  Persons {
    private  String  personName;
    private int personId;
    private  int personPhone;
    private String personEmail;
    private String personRole;
    private int personAge;

    // general constructor

    public Persons(String personName, int personId, int personPhone, String personEmail, String personRole, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
        this.personPhone = personPhone;
        this.personEmail = personEmail;
        this.personRole = personRole;

        if (personId<=0){
            throw new RuntimeException("ID can not be negative");
        }
        else{
            this.personId=personId;
        }
    }
    // OVERLOADING
    public  Persons( String personName,int personAge,int personId){
        this.personName=personName;
        this.personAge=personAge;

        if (personId<=0){
            throw new RuntimeException("ID can not be negative");
        }
        else{
            this.personId=personId;
        }
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        if( personId<=0){
            throw  new RuntimeException(" ID can not be negative");
        }
        else {
            this.personId = personId;
        }
    }

    public int getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(int personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "personName='" + personName + '\'' +
                ", personId=" + personId +
                ", personRole='" + personRole + '\'' +
                '}';
    }

    public  void  display(){
        System.out.println(
                ", personId=" + personId +
                ", personRole='" + personRole  +
                ", personAge=" + personAge);

    }
}

