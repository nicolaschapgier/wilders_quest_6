public class Classroom {

  public static void main(String[] args){
    Wilder jimmy = new Wilder("Jimmy",false);
    Wilder leT = new Wilder("leT", true);

    System.out.println(jimmy.getName());
    System.out.println(leT.isAware());

  jimmy.setName("Nicolas");

    System.out.println(jimmy.getName());
    
    System.out.println(leT.whoAmI());

    System.out.println(jimmy.whoAmI());
    
  }
}