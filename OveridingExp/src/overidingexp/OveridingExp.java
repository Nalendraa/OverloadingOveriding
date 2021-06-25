package overidingexp;

/**
 *
 * @author Nalendraa
 */

class Enemy{

   public void swim(){
      System.out.println("The Enemy can Attack");
   }
}


class Monster extends Enemy{

   public void swim(){
      System.out.println("Monster can Kill");
   }
}

public class OveridingExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enemy a = new Enemy(); // Enemy sebagai referensi dan objek
      Enemy b = new Monster(); // Monster sebagai referensi tetapi Monster sebagai objek

      a.swim();// menjalankan method pada kelas Enemy

      b.swim();// menjalankan method pada kelas Monster
     
    
    }
    
}
