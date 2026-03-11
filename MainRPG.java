package Semester2;

public class MainRPG {
   public MainRPG() {
   }

   public static void main(String[] args) throws Exception {
      Weapon pedang = new Weapon("Pedang", 10);
      new Weapon("Busur", 7);
      Weapon tongkat = new Weapon("Tongkat", 5);
      new Character("Hero", 100);
      new Character("Musuh", 100);
      Skill skillPedang = new Skill();
      skillPedang.bonusDamage = 5;
      pedang.skill = skillPedang;
      tongkat.skill = pedang.skill;
      tongkat.skill.bonusDamage = 3;
      System.out.println(pedang.getTotalDamage());
      System.out.println(tongkat.getTotalDamage());
   }
}
