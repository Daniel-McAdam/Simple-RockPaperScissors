package rockPaperScissors;
import javax.swing.JFrame;

//rockPaperScissors program written with java swing gui package

public class Program
{

	public static void main(String[] args)
	{

		JFrame f = new JFrame("Rock Paper Scissors!");


		//	f.pack(); //so all items fit in 
		f.setSize(480, 150);
		f.setLocationRelativeTo(null); //sets location relative to nowhere therefore centre

		f.add(new Panel());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}