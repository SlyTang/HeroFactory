public class IronManMask extends Mask{
    public IronManMask() {}
    public String getHeroName(){return "IronMan";}
    public int getPrice(){return 59;}
    public String toString(){
        return getHeroName() + "  " + getPartName() +"    $"+getPrice();
    }
}