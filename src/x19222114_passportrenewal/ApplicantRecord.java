package x19222114_passportrenewal;

/**
 *
 * @author Alex.Selby x19222114
 */
public class ApplicantRecord {
    //create variables
    private String name;
    private String reason;
    private int applicationNo;
    
    //constructor
    public ApplicantRecord(String name, String reason, int applicationNo) {
        this.name = name;
        this.reason = reason;
        this.applicationNo = applicationNo;
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(int applicationNo) {
        this.applicationNo = applicationNo;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Reason: " + reason + ", Application No# " + applicationNo;
    }  
}
