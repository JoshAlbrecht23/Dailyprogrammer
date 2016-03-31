/*
You just got a new garage door installed by the Automata™ Garage Door Company. You are having a lot of fun playing with the remote clicker, opening and closing the door, scaring your pets and annoying the neighbors.
The clicker is a one-button remote that works like this:
If the door is OPEN or CLOSED, clicking the button will cause the door to move, until it completes the cycle of opening or closing.
Door: Closed -> Button clicked -> Door: Opening -> Cycle complete -> Door: Open.
If the door is currently opening or closing, clicking the button will make the door stop where it is. When clicked again, the door will go the opposite direction, until complete or the button is clicked again.
We will assume the initial state is CLOSED.

Input:
button_clicked
cycle_complete
button_clicked
button_clicked
button_clicked
button_clicked
button_clicked
cycle_complete
*/


class GarageDoorOpener{

	public static void main(String [ ] args){
 
 	String state[] = {"CLOSED", "OPEN","CLOSING" ,"OPENING", "STOPPED_WHILE_CLOSING", "STOPPED_WHILE_OPENING"};
    
    int input[] = {0, 1, 0, 0, 0, 0, 0, 1}; 
    int currentState = 0;

    System.out.println("Door: " + state[0]);
    for(int i = 0; i < input.length; i++) {
    	if( input[i] == 0 ){
            System.out.println("> Button clicked.");
            if(currentState == 0) 
            	currentState = 3;
            else if(currentState == 1) 
            	currentState = 2;
            else if(currentState == 2) 
            	currentState = 4;
            else if(currentState == 3) 
            	currentState = 5;
            else if(currentState == 4) 
            	currentState = 3;
            else if(currentState == 5) 
            	currentState = 2;
        }else{
            System.out.println("> Cycle complete.");
            currentState -= 2;
            
        }
        System.out.println("Door: " + state[currentState]);
    }


}
}