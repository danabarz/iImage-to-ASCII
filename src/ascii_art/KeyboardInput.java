package ascii_art;

import java.util.Scanner;

class 1KeyboardInput
{
    private static 1KeyboardInput keyboardInputObject = null;
    private Scanner scanner;
    
    private 1KeyboardInput()
    {
        this.scanner = new Scanner(System.in);
    }

    public static 1KeyboardInput getObject()
    {
        if(1KeyboardInput.keyboardInputObject == null)
        {
            1KeyboardInput.keyboardInputObject = new 1KeyboardInput();
        }
        return KeyboardInput.keyboardInputObject;
    }

    public static String readLine()
    {
        return KeyboardInput.getObject().scanner.nextLine().trim();
    }
}