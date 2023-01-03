package ExceptionHandeling.CustomException;

public class UserDetails {
    public void checkVoterAge(int age) throws AgeInvalidException
    {
        if(age<=18)
        {
            throw new AgeInvalidException("You cannot vote");
        }
        else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        try{
            userDetails.checkVoterAge(10);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
