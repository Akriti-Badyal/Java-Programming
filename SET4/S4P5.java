class Patient {
    private int patientId;
    protected String disease;

    Patient(){
        patientId=0;
        disease = "Unknown";
    }

    Patient(int i, String d) {
        patientId = i;
        disease = d;

    }

    public void getDetails() {
        System.out.println("Id:" + patientId);
        System.out.println("disease:" + disease);
    }

    protected int getId() {
        return patientId;
    }

}

class DoctorAccess extends Patient {
    void viewDisease(Patient p) {
        System.out.println("Disease of the patient is " + p.disease);

    }

    void viewId(Patient p) {
        System.out.println("ID of the patient is " + p.getId());
    }

}

public class S4P5 {
    public static void main(String[] args) {

        Patient p = new Patient(1111, "abc");
        DoctorAccess d = new DoctorAccess();
        d.viewDisease(p);
        d.viewId(p);

        Patient p1 = new Patient(2222, "pqr");
        p1.getDetails();
         
        
    }

}
