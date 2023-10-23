import javax.swing.*;
import java.awt.*;

public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it



    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 8;
        plane.pausetime = 0;

        for (int x = 10; x > 0; x--) {  //x determines x-axis, z determines y-axis
                plane.startingAngle(0);
                for (int z = 10; z > 0; z--) {
                    plane.setColor(x * 15, z*x, 230/z);
                    plane.teleport(x*80, z*80);

                    plane.square(70);
                }



            }











    }
}

