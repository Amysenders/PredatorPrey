package gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

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
			/*Computer's first prey card (always the back of a card)*/
			JLabel cPrey1 = new JLabel("cPrey1");
			cPrey1.setBounds(25, 28, 100, 140);
			cPrey1.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/preyBackNew.png")));
			contentPane.add(cPrey1);
			/*Computer's second prey card (always the back of a card)*/
			JLabel cPrey2 = new JLabel("cPrey2");
			cPrey2.setBounds(137, 28, 100, 140);
			cPrey2.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/preyBackNew.png")));
			contentPane.add(cPrey2);
			/*Computer's first pred card (always the back of a card)*/
			JLabel cPred1 = new JLabel("cPred1");
			cPred1.setBounds(249, 28, 100, 140);
			cPred1.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/predBackNew.png")));
			contentPane.add(cPred1);
			/*Computer's second pred card (always the back of a card)*/
			JLabel cPred2 = new JLabel("cPred2");
			cPred2.setBounds(361, 28, 100, 140);
			cPred2.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/predBackNew.png")));
			contentPane.add(cPred2);
			/*Computer's event card(s) (always the back of a card)*/
			JLabel cEvent = new JLabel("cEvent");
			cEvent.setBounds(473, 28, 100, 140);
			cEvent.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			contentPane.add(cEvent);
			/*User first prey card (updates as the user draws cards)*/
			JLabel uPrey = new JLabel("uPrey1");
			uPrey.setBounds(25, 484, 100, 140);
			uPrey.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/prey/baboonFront.png")));
			contentPane.add(uPrey);
			/*User second prey card (updates as the user draws cards)*/
			JLabel uPrey2 = new JLabel("uPrey2");
			uPrey2.setBounds(141, 484, 100, 140);
			uPrey2.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/prey/buffaloFront.png")));
			contentPane.add(uPrey2);
			/*User first pred card (updates as the user draws cards)*/
			JLabel uPred = new JLabel("uPred1");
			uPred.setBounds(257, 484, 100, 140);
			uPred.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/predator/cheetahFront.png")));
			contentPane.add(uPred);
			/*User second pred card (updates as the user draws cards)*/
			JLabel uPred2 = new JLabel("uPred2");
			uPred2.setBounds(373, 484, 100, 140);
			uPred2.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/predator/crocFront.png")));
			contentPane.add(uPred2);
			/*User event cards (updates as the user draws cards) - testing pop-up dialog for other event cards?*/
			JLabel uEvent = new JLabel("uEvents");
			uEvent.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JLabel test = new JLabel("");
					test.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/predator/crocFront.png")));
					JOptionPane.showMessageDialog(rootPane, test);
				}
			});
			uEvent.setBounds(489, 484, 100, 140);
			uEvent.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			contentPane.add(uEvent);
			/*represent event cards played by computer - clickable for pop-up dialog for any more than one*/
			JLabel cEventplayed = new JLabel("cEventPlayed");
			cEventplayed.setBounds(387, 192, 100, 140);
			cEventplayed.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			contentPane.add(cEventplayed);
			/*represent event cards played by user- clickable for pop-up dialog for any more than one*/
			JLabel uEventplayed = new JLabel("uEventPlayed");
			uEventplayed.setBounds(387, 332, 100, 140);
			uEventplayed.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			contentPane.add(uEventplayed);
			//labels user prey cards
			JLabel userPreyLabel = new JLabel("User Prey Cards");
			userPreyLabel.setBounds(89, 634, 100, 16);
			contentPane.add(userPreyLabel);
			//labels user predator cards
			JLabel userPredLabel = new JLabel("User Predator Cards");
			userPredLabel.setBounds(305, 634, 124, 16);
			contentPane.add(userPredLabel);
			//labels user event cards
			JLabel userEventLabel = new JLabel("User Event Cards");
			userEventLabel.setBounds(489, 634, 106, 16);
			contentPane.add(userEventLabel);
			//labels computer cards
			JLabel computerCardLabel = new JLabel("Computer Cards");
			computerCardLabel.setBounds(251, 6, 106, 16);
			contentPane.add(computerCardLabel);
			//card that is currently being played by computer
			JLabel cBattle = new JLabel("cBattle");
			cBattle.setBounds(73, 192, 100, 140);
			cBattle.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/prey/giraffeFront.png")));
			contentPane.add(cBattle);
			//card that is currently being played by user
			JLabel uBattle = new JLabel("uBattle");
			uBattle.setBounds(73, 332, 100, 140);
			uBattle.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/predator/hyenaFront.png")));
			contentPane.add(uBattle);
			//displays total points for user
			JLabel userPointsDisp = new JLabel("User Points: ");
			userPointsDisp.setBounds(613, 534, 159, 44);
			userPointsDisp.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			contentPane.add(userPointsDisp);
			//displays total points for computer
			JLabel compPointsDisp = new JLabel("Computer Points: ");
			compPointsDisp.setBounds(581, 76, 185, 35);
			compPointsDisp.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			contentPane.add(compPointsDisp);
			//always the back of a predator card; represents deck of predator cards
			JLabel predDeck = new JLabel("Predator Deck");
			predDeck.setBounds(794, 28, 100, 140);
			predDeck.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/predBackNew.png")));
			contentPane.add(predDeck);
			//always the back of a prey card; represents deck of prey cards
			JLabel preyDeck = new JLabel("Prey Deck");
			preyDeck.setBounds(794, 255, 100, 140);
			preyDeck.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/preyBackNew.png")));
			contentPane.add(preyDeck);
			//always the back of an event card; represents deck of events cards
			JLabel eventDeck = new JLabel("Event Deck");
			eventDeck.setBounds(794, 484, 100, 140);
			eventDeck.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/eventBackNew.png")));
			contentPane.add(eventDeck);
			//label to show cards remaining in predator deck
			JLabel predCardsLeftDisp = new JLabel("Cards left:");
			predCardsLeftDisp.setBounds(804, 172, 73, 16);
			contentPane.add(predCardsLeftDisp);
			//label to show cards remaining in prey deck
			JLabel preyCardsLeftDisp = new JLabel("Cards left:");
			preyCardsLeftDisp.setBounds(804, 405, 73, 16);
			contentPane.add(preyCardsLeftDisp);
			//label to show cards remaining in event deck
			JLabel eventCardsLeftDisp = new JLabel("Cards left:");
			eventCardsLeftDisp.setBounds(804, 631, 73, 16);
			contentPane.add(eventCardsLeftDisp);
			//displays battle point value for the card played by computer
			JLabel compBattlePoints = new JLabel("Points:");
			compBattlePoints.setBounds(209, 254, 61, 16);
			contentPane.add(compBattlePoints);
			//displays battle point value for the card played by user
			JLabel userBattlePoints = new JLabel("Points:");
			userBattlePoints.setBounds(209, 394, 61, 16);
			contentPane.add(userBattlePoints);
			//displays dice roll - clickable. image currently having issues?
			JLabel die = new JLabel("dice");
			die.setIcon(new ImageIcon(GameBoard.class.getResource("/Images/other/6die.png")));
			die.setBounds(293, 311, 50, 50);
			contentPane.add(die);
		}
	}
