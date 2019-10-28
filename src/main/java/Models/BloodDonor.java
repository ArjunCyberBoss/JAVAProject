
package Models;

public class BloodDonor
{
    public String DonorName;
    String DonorBirthDate;
    String DonorGender;
    String DonorAddress;
    int ContactNum;
    String Email;
    private String DonorNIC;
    String BloodType;
    int NoOfdonations;

    /*public void calculateAge ()
    {
        SimpleDateFormat dob = new SimpleDateFormat("yyyy/MM/dd");
        Date dDob = new Date();
        try
        {
            dDob = dob.parse(DonorBirthDate);
        } catch (ParseException ex)
        {
            Logger.getLogger(BloodDonor.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar c = Calendar.getInstance();
        c.setTime(dDob);
        int dYear = c.get(Calendar.YEAR);
        int dMonth = c.get(Calendar.MONTH) + 1;
        int dDate = c.get(Calendar.DATE);
        LocalDate bDate = LocalDate.of(dYear, dMonth, dDate);
        LocalDate curDate = LocalDate.now();
        Period dAge = Period.between(bDate, curDate);
        
    }*/

    public BloodDonor(String DonorName, String DonorBirthDate, String DonorGender, String DonorAddress, int ContactNum, String Email, String DonorNIC, String BloodType, int NoOfdonations)
    {
        this.DonorName = DonorName;
        this.DonorBirthDate = DonorBirthDate;
        this.DonorGender = DonorGender;
        this.DonorAddress = DonorAddress;
        this.ContactNum = ContactNum;
        this.Email = Email;
        this.DonorNIC = DonorNIC;
        this.BloodType = BloodType;
        this.NoOfdonations = NoOfdonations;
    }
    
    public String Test ()
    {
        String resTest = "Name : " + this.DonorName + "\n DOB : " + this.DonorBirthDate + "\n Gender : " + this.DonorGender;
        return resTest;
    }
    
}
