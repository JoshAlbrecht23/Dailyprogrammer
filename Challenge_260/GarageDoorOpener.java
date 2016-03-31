


class GarageDoorOpener{

	public static void main(String [ ] args){
 
 	String state[] = {"CLOSED", "OPEN","CLOSING" ,"OPENING", "STOPPED_WHILE_CLOSING", "STOPPED_WHILE_OPENING"};
    
    int input[] = {0, 1, 0, 0, 0, 0, 0, 1}; 
    int currentState = 0;

    System.out.println("Door: " + state[0]);
    for(int i = 0; i < input.length; i++) {
    	if( input[i] == 0 ){
            System.out.println("> Button clicked.");
            if(currentState == 0) currentState = 3;
            else if(currentState == 1) currentState = 2;
            else if(currentState == 2) currentState = 4;
            else if(currentState == 3) currentState = 5;
            else if(currentState == 4) currentState = 3;
            else if(currentState == 5) currentState = 2;
        }else{
            System.out.println("> Cycle complete.");
            currentState -= 2;
            
        }
        System.out.println("Door: " + state[currentState]);
    }


}
}