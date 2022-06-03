public class  CaptainAmericaFactory extends Factory {
 public  CaptainAmericaFactory() {}
 public Mask createMask() {return new CaptainAmericaMask();}
 public Shield createShield() {return new CaptainAmericaShield();}
}