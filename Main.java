
import java.util.Random;
class Main {
  public static void main(String[] args) {
    
    Ruota c=new Ruota("bergamo ",100);
    Ruota c1=new Ruota("milano ",500);
    Ruota c2=new Ruota("napoli ",1000);
    Ruota c3=new Ruota("catanzaro ",3000);
    Ruota c4=new Ruota("bari ",5200);

    c.start();
    c1.start();
    c2.start();
    c3.start();
    c4.start();
  }
}