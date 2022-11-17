import java.util.ArrayList;

public class WaterType extends Monster {

  public WaterType(String name, int hp, int base) {
    super(name, "water", "fire", "grass", hp, base);
    atk += 0.7;
    def *= 1.3; 
  }

  public void wet(){
    def += 2;
    hp -= maxHP * 0.1;
    if(hp > maxHP) hp = maxHP;
    System.out.println(this.getName() + " rested. Its health is now " + hp + ".");
  }
}
