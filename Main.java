import java.util.ArrayList;

public class Main {

  public static FireType toffe = new FireType("Toffe", 80, 20);
  public static WaterType paz = new WaterType("Paz", 80, 33);
  public static GrassType anika = new GrassType("Anika", 80, 24);
  
  public static void main (String[] args) {

    System.out.println("A new fire type named '" + toffe.getName() + "' has been created");
    System.out.println("A new water type named '" + paz.getName() + "' has been created");
    System.out.println("A new grass type named '" + anika.getName() + "' has been created");

    System.out.println("\n" + "[Battle 1] Fire VS Water"); // toffe vs paz
    while (paz.getHP() != 0 && toffe.getHP() != 0) {
      toffe.attack(paz);
      if (paz.getHP() == 0) {
        continue;
      }
      paz.attack(toffe);
    }

    resetAll();

    System.out.println("\n" + "[Battle 2] Fire VS Grass"); // toffe vs paz
    while (anika.getHP() != 0 && toffe.getHP() != 0) {
      toffe.attack(anika);
      if (anika.getHP() == 0) {
        continue;
      }
      anika.attack(toffe);
    }

    resetAll();

    System.out.println("\n" + "[Battle 3] Water VS Grass"); // toffe vs paz
    while (paz.getHP() != 0 && anika.getHP() != 0) {
      paz.attack(anika);
      if (anika.getHP() == 0) {
        continue;
      }
      anika.attack(paz);
    }
    
  }

  public static void resetAll(){
    toffe.resetHealth();
    paz.resetHealth();
    anika.resetHealth();
  }
  
}