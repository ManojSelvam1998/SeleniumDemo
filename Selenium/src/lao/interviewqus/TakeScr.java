package lao.interviewqus;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

public class TakeScr 
{
	@Test
	public void test() throws IOException, AWTException
	{
		Robot robot=new Robot();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(size);
		BufferedImage scr = robot.createScreenCapture(rect);
		File file=new File("./SS/op.png");
		ImageIO.write(scr, "png", file);
	}
}
