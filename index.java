abstract class Pen
{
    public abstract void write();
    public abstract void draw();
    
    public void mark()
    {
        System.out.println("Marking..");
    }
}
abstract class BetterPen extends Pen
{
    public void write()
    {
        System.out.println("Writing..");
    }
}
class HighPen extends BetterPen //concrete class
{
    public void draw()
    {
        System.out.println("Drawing..");
    }
}
public class index {

    public static void main(String[] args) {
        Pen obj = new HighPen();
        obj.write();
        obj.draw();
        obj.mark();
    }
}