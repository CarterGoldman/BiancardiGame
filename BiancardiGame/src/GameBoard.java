import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Marcus Biancardi Alex
 * 
 */
public class GameBoard extends JFrame
{
	JPanel gameBoard;
	
	public GameBoard()
	{
		gameBoard = new JPanel();
		
		// Sets the size of the JFrame
		this.setSize(1150, 650);
		
		// Sets the attributes of the JFrame
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
}
