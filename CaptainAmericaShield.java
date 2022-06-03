public class CaptainAmericaShield extends Shield{
    public CaptainAmericaShield() {}
    public String getHeroName(){return "Captain America";}
    public int getPrice(){return 29;}
    public String toString(){
        return getHeroName() + "  " + getPartName() +"    $"+getPrice();
    }
}