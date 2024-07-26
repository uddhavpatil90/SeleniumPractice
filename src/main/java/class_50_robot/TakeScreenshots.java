package class_50_robot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;

public class TakeScreenshots {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		Robot robot=new Robot();
		
		robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	}

}
