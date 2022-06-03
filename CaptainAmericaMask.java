public class CaptainAmericaMask extends Mask{
    public CaptainAmericaMask() {}
    public String getHeroName(){return "Captain America";}
    public int getPrice(){return 19;}
    public String toString(){
        return getHeroName() + "  " + getPartName() +"    $"+getPrice();
    }
}