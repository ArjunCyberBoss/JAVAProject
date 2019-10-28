
package Utilities;

public class AddressNullException extends RuntimeException
{
    @Override
    public String getLocalizedMessage ()
    {
        return "Address section can't be empty!";
    }
}
