
package Models;

public class Nurse
{
    public String NurseName;
    public String NurseBirthDate;
    public String NurseGender;
    public String NurseAddress;
    public int NContactNum;
    public String NEmail;
    public String NurseID;
    public int NNoOfParticipations;
    public String NQualifications;

    public Nurse(String NurseName, String NurseBirthDate, String NurseGender, String NurseAddress, int NContactNum, String NEmail, String NurseID, int NNoOfParticipations, String NQualifications)
    {
        this.NurseName = NurseName;
        this.NurseBirthDate = NurseBirthDate;
        this.NurseGender = NurseGender;
        this.NurseAddress = NurseAddress;
        this.NContactNum = NContactNum;
        this.NEmail = NEmail;
        this.NurseID = NurseID;
        this.NNoOfParticipations = NNoOfParticipations;
        this.NQualifications = NQualifications;
    }
    
    
}
