import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;


        Scanner input = new Scanner(System.in);
        System.out.println(" ****** HOSPITAL MANAGEMENT SYSTEM**********/ CHOOSE YOUR STATUS   ********");
        System.out.print(" 1. Doctors ");
        System.out.print(" 2. Pharmacist ");
        System.out.print(" 3. receptionist ");
        System.out.print("   4.Patient       ");
        System.out.println(" 5. exit          ");
        List<Persons> allPersons = new ArrayList<>();
        String choices = input.next();
        while (true) {
            switch (choices) {
                case "1":
                    System.out.println();
                    for (int loop = 1; loop <= 3; loop++) {
                        System.out.println("******* Doctor" + loop + " details *****");
                        System.out.print("Enter ID     : ");
                        int id = input.nextInt();
                        System.out.print("Enter name   : ");
                        String name = input.next();
                        System.out.print("Enter role   : ");
                        String role = input.next();
                        System.out.println(" enter number of scheduled appointment");
                        int scheduledAppointment = input.nextInt();


                        Persons p = new Persons("esperance", 20, 123);
                        allPersons.add(p);

                        System.out.print("Enter specialty : ");
                        String spec = input.next();
                        Doctors doc = new Doctors(p, 123, 90, "Lic12");
                        doc.appointmentScheduling();
                        doc.billingOperation(50000);
                        break;

                    }
                case "2":
                    System.out.println("_________________________________________");

                    System.out.println(" enter pharmacist name");
                    String name = input.next();
                    System.out.println(" enter your licence:");
                    String licence = input.next();
                    Persons p1 = new Persons("esperance", 20, 123);
                    allPersons.add(p1);
                    Pharmacist ph = new Pharmacist("Pharma 34", p1);
                    ph.billingOperation(20000, "INS-001");
                    break;


                case "3":
                    System.out.println("*****************************************");
                    System.out.println(" enter receptionist name");
                    String receptionistName= input.next();
                    System.out.println(" enter desk number");
                    int deskNumber= input.nextInt();
                    Persons p2 = new Persons("esperance", 20, 123);
                    allPersons.add(p2);
                    Receptionists desk=new Receptionists(2,p2);
                    desk.patientRegistration(p2.getPersonName());
                    desk.display();
                    break;
                case "4":
                    System.out.println("//////////////////////////////////////////////////");
            System.out.println(" enter patient name ");
            String patientName= input.next();
            System.out.print("Enter blood group : ");
            String blood = input.next();
            Patients pt = new Patients(" Flugence", 19, 07, "flugenca2gmail.com", "sugeon", 23, "RAMA", "URINE", "AB");
            pt.display();
            break;

                case  "5":
                    System.out.println("######################################################");
                    System.out.println(" Thank you! any more info please reach out :4040!");
                    running=false;
                    break;
                default:
                    System.out.println(" invalid input , choose between 1 and 5");

            }





                    System.out.println("\n--- All registered persons ---");
                    System.out.println(allPersons);

            }
        }
    }

