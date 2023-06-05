//AIWERIOGHENE,ADESUWA 21/0561
public class drum_oop {
    //initialization of variables
    public double length;
    public double breadth;
    public double height;

    //defined constructor for the initialized variables
    drum_oop(double l,double b,double h){
        length=l;
        breadth=b;
        height=h;
    }
    //method to fill the drum
    public void fillDrum()
    {
        System.out.println("The volume of the drum is" + " " + length*breadth*height);
        System.out.println("The drum has been filLed up.");
    }
    public static void main(String[] args){
        //instantiating the three drums
        drum_oop drum_1 = new drum_oop(12, 56, 65);
        drum_oop drum_2 = new drum_oop(13, 45, 93);
        drum_oop drum_3 = new drum_oop(90, 65, 45 );

        //filling up the three created drums
        drum_1.fillDrum();
        drum_2.fillDrum();
        drum_3.fillDrum();

    }
}
