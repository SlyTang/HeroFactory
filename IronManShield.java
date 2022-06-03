public class IronManShield extends Shield{
    public IronManShield() {}
    public String getHeroName(){return "IronMan";}
    public int getPrice(){return 99;}
    public String toString(){
        return getHeroName() + "  " + getPartName() +"    $"+getPrice();
    }
}