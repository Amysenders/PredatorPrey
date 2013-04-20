package gui.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class GameBoard extends JFrame {

		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						GameBoard frame = new GameBoard();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public GameBoard() {
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 900, 675);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("cPrey1");
			lblNewLabel.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/preyBackNew.png")));
			lblNewLabel.setBounds(210, 30, 100, 140);
			contentPane.add(lblNewLabel);
			
			JLabel label = new JLabel("cPrey2");
			label.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/preyBackNew.png")));
			label.setBounds(326, 30, 100, 140);
			contentPane.add(label);
			
			JLabel lblNewLabel_1 = new JLabel("cPred1");
			lblNewLabel_1.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/predBackNew.png")));
			lblNewLabel_1.setBounds(442, 30, 100, 140);
			contentPane.add(lblNewLabel_1);
			
			JLabel label_1 = new JLabel("cPred2");
			label_1.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/predBackNew.png")));
			label_1.setBounds(558, 30, 100, 140);
			contentPane.add(label_1);
			
			JLabel cEvent = new JLabel("cEvent");
			cEvent.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			cEvent.setBounds(674, 30, 100, 140);
			contentPane.add(cEvent);
			
			JLabel predDeck = new JLabel("predDeck");
			predDeck.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/predBackNew.png")));
			predDeck.setBounds(790, 30, 100, 140);
			contentPane.add(predDeck);
			
			JLabel uPrey = new JLabel("uPrey1");
			uPrey.setIcon(new ImageIcon("/Users/CTL_MacBookPro1/Documents/Predator/PredatorPrey/Images/prey/baboonFront.png"));
			uPrey.setBounds(210, 484, 100, 140);
			contentPane.add(uPrey);
			
			JLabel uPrey2 = new JLabel("uPrey2");
			uPrey2.setIcon(new ImageIcon("/Users/CTL_MacBookPro1/Documents/Predator/PredatorPrey/Images/prey/buffaloFront.png"));
			uPrey2.setBounds(326, 484, 100, 140);
			contentPane.add(uPrey2);
			
			JLabel uPred = new JLabel("uPred1");
			uPred.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/predator/cheetahFront.png")));
			uPred.setBounds(442, 484, 100, 140);
			contentPane.add(uPred);
			
			JLabel uPred2 = new JLabel("uPred2");
			uPred2.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/predator/crocFront.png")));
			uPred2.setBounds(558, 484, 100, 140);
			contentPane.add(uPred2);
			
			JLabel lblUevents = new JLabel("uEvents");
			lblUevents.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			lblUevents.setBounds(674, 484, 100, 140);
			contentPane.add(lblUevents);
			
			JLabel eventDeck = new JLabel("eventDeck");
			eventDeck.setBorder(null);
			eventDeck.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			eventDeck.setBounds(790, 484, 100, 140);
			contentPane.add(eventDeck);
			
			JLabel preyDeck = new JLabel("preyDeck");
			preyDeck.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/preyBackNew.png")));
			preyDeck.setBounds(790, 257, 100, 140);
			contentPane.add(preyDeck);
			
			JLabel cEventplayed = new JLabel("cEventPlayed");
			cEventplayed.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			cEventplayed.setBounds(652, 190, 100, 140);
			contentPane.add(cEventplayed);
			
			JLabel uEventplayed = new JLabel("uEventPlayed");
			uEventplayed.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			uEventplayed.setBounds(652, 330, 100, 140);
			contentPane.add(uEventplayed);
			
			JLabel userLabel = new JLabel("User Prey Cards");
			userLabel.setBounds(274, 634, 100, 16);
			contentPane.add(userLabel);
			
			JLabel lblUserPredatorCards = new JLabel("User Predator Cards");
			lblUserPredatorCards.setBounds(490, 634, 124, 16);
			contentPane.add(lblUserPredatorCards);
			
			JLabel lblUserEventCards = new JLabel("User Event Cards");
			lblUserEventCards.setBounds(676, 636, 106, 16);
			contentPane.add(lblUserEventCards);
			
			JLabel lblNewLabel_2 = new JLabel("Event Deck");
			lblNewLabel_2.setBounds(805, 456, 70, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblPreyDeck = new JLabel("Prey Deck");
			lblPreyDeck.setBounds(808, 229, 63, 16);
			contentPane.add(lblPreyDeck);
			
			JLabel lblPredatorDeck = new JLabel("Predator Deck");
			lblPredatorDeck.setBounds(796, 10, 88, 16);
			contentPane.add(lblPredatorDeck);
			
			JLabel lblComputerCards = new JLabel("Computer Cards");
			lblComputerCards.setBounds(445, 10, 106, 16);
			contentPane.add(lblComputerCards);
			
			JLabel die = new JLabel("die");
			die.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/6die.png")));
			die.setBounds(514, 275, 100, 100);
			contentPane.add(die);
			
			JLabel cpv = new JLabel("cpv");
			cpv.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/tempPoints.png")));
			cpv.setBounds(376, 190, 100, 140);
			contentPane.add(cpv);
			
			JLabel upv = new JLabel("upv");
			upv.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/tempPoints.png")));
			upv.setBounds(376, 330, 100, 140);
			contentPane.add(upv);
			
			JLabel cBattle = new JLabel("cBattle");
			cBattle.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/prey/giraffeFront.png")));
			cBattle.setBounds(238, 190, 100, 140);
			contentPane.add(cBattle);
			
			JLabel uBattle = new JLabel("uBattle");
			uBattle.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/predator/hyenaFront.png")));
			uBattle.setBounds(238, 330, 100, 140);
			contentPane.add(uBattle);
			
			JLabel cvp = new JLabel("cvp");
			cvp.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/predBackNew.png")));
			cvp.setBounds(50, 30, 100, 140);
			contentPane.add(cvp);
			
			JLabel lblComputerVictoryPile = new JLabel("Computer Victory Pile");
			lblComputerVictoryPile.setBounds(33, 10, 145, 16);
			contentPane.add(lblComputerVictoryPile);
			
			JLabel label_3 = new JLabel("cPrey1");
			label_3.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/preyBackNew.png")));
			label_3.setBounds(50, 484, 100, 140);
			contentPane.add(label_3);
			
			JLabel lblUserVictoryPile = new JLabel("User Victory Pile");
			lblUserVictoryPile.setBounds(50, 456, 106, 16);
			contentPane.add(lblUserVictoryPile);
			
			JLabel lblUserPointsXxx = new JLabel("User Points: XX");
			lblUserPointsXxx.setBounds(18, 403, 100, 16);
			contentPane.add(lblUserPointsXxx);
			
			JLabel lblComputerPointsXx = new JLabel("Computer Points: XX");
			lblComputerPointsXx.setBounds(17, 229, 133, 16);
			contentPane.add(lblComputerPointsXx);

			
		}
	}
