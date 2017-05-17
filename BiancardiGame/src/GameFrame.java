import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class GameFrame extends JFrame
{
	private JPanel contentPane;
	private JLabel iwemaLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GameFrame frame = new GameFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameFrame()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameFrame.class.getResource("/pictures/Michael-Biancardi.JPG")));
		setTitle("Biancardi Dating Sim");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contestantPanel = new JPanel();
		contestantPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contestantPanel.setBounds(0, 5, 195, 601);
		contentPane.add(contestantPanel);
		contestantPanel.setLayout(null);
		
		JLabel lblIwemaScore = new JLabel("iwema: score");
		lblIwemaScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblIwemaScore.setBounds(8, 201, 179, 28);
		lblIwemaScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblIwemaScore);
		
		JLabel lblBegleyScore = new JLabel("begley: score");
		lblBegleyScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBegleyScore.setBounds(8, 401, 179, 28);
		lblBegleyScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblBegleyScore);
		
		JLabel lblPlayerScore = new JLabel("player: score");
		lblPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerScore.setBounds(8, 11, 179, 28);
		lblPlayerScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblPlayerScore);
		
		JLabel iwemaPicture = new JLabel("");
		iwemaPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Todd-Iwema.gif")));
		iwemaPicture.setBounds(22, 240, 150, 150);
		contestantPanel.add(iwemaPicture);
		
		JLabel begleyPicture = new JLabel("");
		begleyPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Sean-Begley.jpg")));
		begleyPicture.setBounds(22, 440, 150, 150);
		contestantPanel.add(begleyPicture);
		
		JLabel playerPicture = new JLabel("");
		playerPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Michael-Biancardi.JPG")));
		playerPicture.setBounds(22, 51, 150, 150);
		contestantPanel.add(playerPicture);
		
		
		JPanel gamePanel = new JPanel();
		gamePanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		gamePanel.setBounds(199, 5, 736, 601);
		contentPane.add(gamePanel);
		gamePanel.setLayout(null);
		
		JLabel questionNumLabel = new JLabel("insert question num here");
		questionNumLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		questionNumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionNumLabel.setBounds(0, 11, 736, 52);
		gamePanel.add(questionNumLabel);
		
		JLabel lblInsertQuestionHere = new JLabel("insert question here");
		lblInsertQuestionHere.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblInsertQuestionHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertQuestionHere.setVerticalAlignment(SwingConstants.TOP);
		lblInsertQuestionHere.setBounds(5, 101, 726, 111);
		gamePanel.add(lblInsertQuestionHere);
		
		JButton buttonA = new JButton("answer A");
		buttonA.setBounds(98, 325, 266, 127);
		gamePanel.add(buttonA);
		
		JButton buttonC = new JButton("answer C");
		buttonC.setBounds(98, 463, 266, 127);
		gamePanel.add(buttonC);
		
		JButton buttonB = new JButton("answer B");
		buttonB.setBounds(374, 325, 266, 127);
		gamePanel.add(buttonB);
		
		JButton buttonD = new JButton("answer D");
		buttonD.setBounds(374, 463, 266, 127);
		gamePanel.add(buttonD);
		
		JPanel picturePanel = new JPanel();
		picturePanel.setBounds(318, 201, 100, 100);
		gamePanel.add(picturePanel);
		
		JPanel biancardiPanel = new JPanel();
		biancardiPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		biancardiPanel.setBounds(940, 5, 195, 601);
		contentPane.add(biancardiPanel);
		biancardiPanel.setLayout(null);
		
		JLabel lblBiancardiStuff = new JLabel("biancardi stuff");
		lblBiancardiStuff.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiancardiStuff.setBounds(21, 201, 153, 25);
		lblBiancardiStuff.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		biancardiPanel.add(lblBiancardiStuff);
		
		JLabel biancardiPicture = new JLabel("");
		biancardiPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Michael-Biancardi.JPG")));
		biancardiPicture.setBounds(22, 237, 150, 150);
		biancardiPanel.add(biancardiPicture);
	}
}
