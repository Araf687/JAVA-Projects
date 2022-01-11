
import java.awt.Point;
import java.util.Date;

 
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("hi");
        String message="  Hello World  ";
        System.out.println(message.trim());
        Date now=new Date();
        System.out.println(now.getDate());
        long id=172021554578L;
        float salary=0.88f;
        byte houseNo=23;
        Point point1= new Point(2,3);
        Point point2=point1;
        point1.x=4;
        System.out.println(point2);
        
        
    }
}
