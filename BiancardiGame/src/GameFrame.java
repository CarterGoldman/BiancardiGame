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
import javax.swing.border.LineBorder;

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
		setBounds(100, 100, 1145, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contestantPanel = new JPanel();
		contestantPanel.setOpaque(false);
		contestantPanel.setBorder(null);
		contestantPanel.setBounds(0, 5, 195, 618);
		contentPane.add(contestantPanel);
		contestantPanel.setLayout(null);
		

		JLabel lblIwemaScore = new JLabel("iwema: score");
		lblIwemaScore.setForeground(Color.WHITE);

		lblIwemaScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblIwemaScore.setBounds(8, 201, 179, 28);
		lblIwemaScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblIwemaScore);
		

		JLabel lblBegleyScore = new JLabel("begley: score");
		lblBegleyScore.setForeground(Color.WHITE);

		lblBegleyScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBegleyScore.setBounds(8, 401, 179, 28);
		lblBegleyScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblBegleyScore);
		

		JLabel lblPlayerScore = new JLabel("player: score");
		lblPlayerScore.setForeground(Color.WHITE);


		lblPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerScore.setBounds(8, 11, 179, 28);
		lblPlayerScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblPlayerScore);
		
		JLabel iwemaPicture = new JLabel("");
		iwemaPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Todd-Iwema.jpg")));
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
		gamePanel.setOpaque(false);
		gamePanel.setBorder(null);
		gamePanel.setBounds(199, 5, 736, 618);
		contentPane.add(gamePanel);
		gamePanel.setLayout(null);
		
		JLabel questionNumLabel = new JLabel("insert question num here");
		questionNumLabel.setForeground(Color.WHITE);
		questionNumLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		questionNumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionNumLabel.setBounds(5, 42, 736, 52);
		gamePanel.add(questionNumLabel);
		
		JLabel lblInsertQuestionHere = new JLabel("insert question here");
		lblInsertQuestionHere.setForeground(Color.WHITE);
		lblInsertQuestionHere.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblInsertQuestionHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertQuestionHere.setVerticalAlignment(SwingConstants.TOP);
		lblInsertQuestionHere.setBounds(5, 119, 726, 93);
		gamePanel.add(lblInsertQuestionHere);
		
		JButton buttonA = new JButton("answer A");
		buttonA.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonA.setForeground(Color.WHITE);
		buttonA.setBorder(null);
		buttonA.setOpaque(false);
		buttonA.setBounds(81, 392, 199, 77);
		gamePanel.add(buttonA);
		
		JButton buttonC = new JButton("answer C");
		buttonC.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonC.setForeground(Color.WHITE);
		buttonC.setBorder(null);
		buttonC.setOpaque(false);
		buttonC.setBounds(81, 501, 199, 77);
		gamePanel.add(buttonC);
		
		JButton buttonB = new JButton("answer B");
		buttonB.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonB.setForeground(Color.WHITE);
		buttonB.setBorder(null);
		buttonB.setOpaque(false);
		buttonB.setBounds(458, 392, 199, 77);
		gamePanel.add(buttonB);
		
		JButton buttonD = new JButton("answer D");
		buttonD.setForeground(Color.WHITE);
		buttonD.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonD.setBorder(null);
		buttonD.setOpaque(false);
		buttonD.setBounds(458, 501, 199, 77);
		gamePanel.add(buttonD);
		
		JPanel picturePanel = new JPanel();
		picturePanel.setBorder(new LineBorder(new Color(0, 204, 255), 2, true));
		picturePanel.setOpaque(false);
		picturePanel.setBounds(242, 223, 252, 150);
		gamePanel.add(picturePanel);
		
		JPanel biancardiPanel = new JPanel();
		biancardiPanel.setOpaque(false);
		biancardiPanel.setBorder(null);
		biancardiPanel.setBounds(940, 5, 195, 618);
		contentPane.add(biancardiPanel);
		biancardiPanel.setLayout(null);
		
		JLabel lblBiancardiStuff = new JLabel("biancardi stuff");
		lblBiancardiStuff.setForeground(Color.WHITE);
		lblBiancardiStuff.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiancardiStuff.setBounds(19, 11, 153, 25);
		lblBiancardiStuff.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		biancardiPanel.add(lblBiancardiStuff);
		
		JLabel biancardiPicture = new JLabel("");
		biancardiPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Biancardi-full-small.png")));
		biancardiPicture.setBounds(19, 27, 175, 580);
		biancardiPanel.add(biancardiPicture);
		
		JLabel backgroundPicture = new JLabel("");
		backgroundPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/bianparty_background.png")));
		backgroundPicture.setBounds(0, 0, 1144, 623);
		contentPane.add(backgroundPicture);
	}
}
