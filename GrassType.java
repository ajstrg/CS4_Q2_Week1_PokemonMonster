import java.util.ArrayList;

public class GrassType extends Monster {
  
  public GrassType(String name, int hp, int base) {
    super(name, "grass", "water", "fire", hp, base);
  }

  public void rest(){
    hp += maxHP * 0.5;
    if(hp > maxHP) hp = maxHP;
    System.out.println(this.getName() + " rested. Its health is now " + hp + ".");
  }
  
}
