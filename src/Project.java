

public class Project extends World {
    public int red;
    public int blue;
    public int green;
    public int count;
    public int total;


    public void go() {
        plane.startingAngle(90);
        plane.teleport(82, 87);
        plane.pausetime = 0;


        field();



    }


//    public void baseCircle() {
//        plane.trailWidth = 10;
//        plane.setColor(255, 255, 255);
//        plane.teleport(366, 300);
//        plane.fillCircle(10);
//        plane.isTrail = false;
//
//    }


    public void field() {
        for (int x = 2; x > 0; x--) {
            for (int g = 10; g > 2; g--) {
                if (x == 1) {
                    plane.teleport(315, 317);
                    plane.trailWidth = 2;
                    plane.setColor(0, 2 * g, 0);
                    plane.circle(20 * g);


                }

                else {

                    plane.teleport(300, 300);
                    plane.trailWidth = 30;
                    plane.setColor(20 * g, 200 / g, 50);
                    plane.circle(200 / g);
                    plane.circle(20 * g);
                }


            }

        }
    }

}