package Semester2;

public class Weapon {
   String nama;
   int damage;
   Skill skill;

   public Weapon(String nama, int damage) {
      this.nama = nama;
      this.damage = damage;
   }

   public String toString() {
      String var10000 = this.nama;
      return var10000 + " (Damage: " + this.getTotalDamage() + ")";
   }

   int getTotalDamage() {
      return this.skill != null ? this.damage + this.skill.bonusDamage : this.damage;
   }
}