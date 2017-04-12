
public class Test
{
 
    public static void main(String[] args)
    {

      System.out.println("Hello World");
      System.out.println("Learning Git and GitHub");

      User user1 = new User(11, "AAAA");
      User user2 = new User(22, "BBBB");
      
    }


}


class User
{
   int id;
   String name;

   public User()
   {

   } 

   public User(int id, String name)
   {
      this.id = id;
      this .name = name;
   }

}