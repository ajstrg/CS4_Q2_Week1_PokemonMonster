import java.util.ArrayList;

public class FireType extends Monster {

  public FireType(String name, int hp, int base) {
    super(name, "fire", "grass", "water", hp, base);
    atk += 1.4;
    def *= 0.7; 
  }

  public void rage(){
    atk += 2;
    hp -= maxHP * 0.1;
    if(hp > maxHP) hp = maxHP;
    System.out.println(this.getName() + " rested. Its health is now " + hp + ".");
  }
}
