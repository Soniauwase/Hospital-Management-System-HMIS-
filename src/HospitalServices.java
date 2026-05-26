public abstract class HospitalServices {
    public   abstract void  appointmentScheduling();
    public  abstract double billingOperation( double amount, String assuranceCode);
    public  abstract double billingOperation( double amount);
    public abstract void  medicalHistoryTracking(String patientName);
    public abstract void emergenceCaseHandling();
}
