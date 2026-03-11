package Semester2;

public class Character {
   int hp;
   String Nama;
   Weapon weapon;

   public Character(String Nama, int hp) {
      this.Nama = Nama;
      this.hp = hp;
   }

   void Attack(Character musuh) {
      if (this.weapon == null) {
         System.out.println(this.Nama + " tidak memiliki senjata untuk menyerang.");
      } else {
         System.out.println(this.Nama + " menyerang " + musuh.Nama + " dengan " + this.weapon.nama);
         musuh.hp -= this.weapon.getTotalDamage();
      }
   }
}
