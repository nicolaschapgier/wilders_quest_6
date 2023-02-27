public class Wilder {

  // attributes 
  private String firstname;
  private boolean aware;


  // constructors
  public Wilder(String firstname, boolean aware){
    this.firstname = firstname;
    this.aware = aware;
  }

  // Ajoute des getters et setters pour tous les attributs, en respectant les conventions

  // getters
  public String getName(){
    return this.firstname;
  }
  
  public boolean isAware(){
    return this.aware;
  }

  public void setName(String name){
    this.firstname = name;
  }

  // instance
  public String whoAmI(){
    return this.aware ? "Je m'appelle " + this.getName() + " et je suis aware." : "Je m'appelle " + this.getName() + " et je ne suis pas aware.";
  }
}