public class IronManFactory extends Factory {
 public  IronManFactory() {}
 public Mask createMask() {return new IronManMask();}
 public Shield createShield() {return new IronManShield();}
}