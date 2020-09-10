import java.util.Vector;

public class Entity {
    //x is the 0th index in the Vector list and y is the 1st.
    private Vector<Integer> position     = new Vector<>(2);
    private Vector<Integer> velocity     = new Vector<>(2);
    private Vector<Integer> acceleration = new Vector<>(2);

    Entity(int xPos, int yPos){
        position.set(0,xPos);
        position.set(1,yPos);
    }

    void updateEntity(){
        //leapfrog x, then y.
        velocity.add(0,acceleration.get(0));
        velocity.add(1,acceleration.get(1));
        //Reset the acceleration after it has been applied
        acceleration.set(0,0);
        acceleration.set(1,0);
        //add the velocity to the position.
        position.add(0,velocity.get(0));
        position.add(1,velocity.get(1));
    }
}
