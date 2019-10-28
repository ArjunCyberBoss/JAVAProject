
package Models;

public class Doctor
{
    public String DoctorName;
    public String DoctorBirthDate;
    public String DoctorGender;
    public String DoctorAddress;
    public int DContactNum;
    public String DEmail;
    public String DoctorID;
    public int NoOfParticipations;
    public String DQualifications;

    public Doctor(String DoctorName, String DoctorBirthDate, String DoctorGender, String DoctorAddress, int DContactNum, String DEmail, String DoctorID, int NoOfParticipations, String DQualifications)
    {
        this.DoctorName = DoctorName;
        this.DoctorBirthDate = DoctorBirthDate;
        this.DoctorGender = DoctorGender;
        this.DoctorAddress = DoctorAddress;
        this.DContactNum = DContactNum;
        this.DEmail = DEmail;
        this.DoctorID = DoctorID;
        this.NoOfParticipations = NoOfParticipations;
        this.DQualifications = DQualifications;
    }
    
    
}
