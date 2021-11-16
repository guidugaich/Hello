import java.util.Date;
import java.awt.*;

public class RefTypes {
    public static void main(String[] args) throws Exception {
        // Date now = new Date();
        // System.out.println(now.getTime());
        
        Point pt1 = new Point(1, 2);
        Point pt2 = pt1;
        pt1.x = 2;
        pt1.y = 8;
        System.out.println(pt2);

        
    }
}
