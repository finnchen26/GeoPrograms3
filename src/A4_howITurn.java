

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.teleport(30, 90);
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        house();


        plane.teleport(850, 660);
        house();

        plane.teleport(70, 660);
        house();

        plane.teleport(850, 90);
        house();

    }

    public void tri(){
        plane.startingAngle(0);
        plane.move(100);
        plane.turn(120);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(120);
        plane.setColor(0, 200, 0);
        plane.move(100);
    }

    public void square(){
        plane.startingAngle(0);
        plane.move(100);
        plane.turn(180);
        plane.setColor(0,200,0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0,200,0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0,200,0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0,200,0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0,200,0);


    }

    public void house(){
        tri();
        square();
    }

}
