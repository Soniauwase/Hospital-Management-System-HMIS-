public class Main{
    public static void main(String[]args){
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;


                Scanner sc = new Scanner(System.in);
                List<Persons> allPersons = new ArrayList<>();

                for (int loop = 1; loop <= 3; loop++) {
                    System.out.println("******* Person " + loop + " details *****");
                    System.out.print("Enter ID     : "); int id     = sc.nextInt();
                    System.out.print("Enter name   : "); String name = sc.next();
                    System.out.print("Enter role   : "); String role = sc.next();
                    System.out.print("Enter email  : "); String email = sc.next();
                    System.out.print("Enter phone  : "); String phone = sc.next();
                    System.out.print("Enter age    : "); int age = sc.nextInt();

                    Persons p = new Persons(id, name, role, email, phone, age);
                    allPersons.add(p);

                    // exactly like your school — check role, then create the right type
                    if (role.equalsIgnoreCase("doctor")) {
                        System.out.print("Enter specialty : "); String spec = sc.next();
                        Doctor doc = new Doctor(p, spec, "LIC-" + id);
                        doc.appointmentScheduling();
                        doc.billingOperation(50000);

                    } else if (role.equalsIgnoreCase("pharmacist")) {
                        Pharmacist ph = new Pharmacist(p, "PH-" + id);
                        ph.billingOperation(20000, "INS-001");

                    } else if (role.equalsIgnoreCase("patient")) {
                        System.out.print("Enter blood group : "); String blood = sc.next();
                        Patient pt = new Patient(p, blood, "INS-" + id);
                        pt.display();
                    }
                }

                System.out.println("\n--- All registered persons ---");
                System.out.println(allPersons);
            }
        }
