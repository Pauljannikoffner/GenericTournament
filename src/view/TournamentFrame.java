package view;

import model.TournamentMode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TournamentFrame extends JFrame {

    private static final String TITLE = "Tournament Lobby";

    private static final String SURNAME = "surname";
    private static final String LAST_NAME = "last name";
    private static final String RATING = "rating";
    private static final String SUBMIT = "submit";
    private static final String START = "start tournament";
    private static final String INFO_ADD_PLAYER = "enter attendee data and press submit";
    private static final String INFO_START_GAME = "finally, select game mode and press start";
    private static final String INFO_WRONG_RATING = "rating has incorrect format";
    private static final String INFO_WRONG_ATTENDEE = "attendee data is incorrect";

    private static final String SURNAME_TOOL_TIP = "enter attendee's surname";
    private static final String LAST_NAME_TOOL_TIP = "enter attendee's lastName";
    private static final String RATING_TOOL_TIP = "enter attendee's dwz";
    private static final String SUBMIT_TOOL_TIP = "submit attendee data";
    private static final String TOURNAMENT_MODE_TOOL_TIP = "select game mode";
    private static final String START_TOOL_TIP = "start tournament";
    private static final String INFO_TOOL_TIP = "info box";
    private static final String PLAYERS_TOOL_TIP = "players";

    private JTextField surname;
    private JTextField lastName;
    private JTextField rating;
    private JButton submit;
    private JComboBox<TournamentMode> tournamentMode;
    private JButton start;
    private JLabel info;
    private JTable players;

    public TournamentFrame(ActionListener actionListener) {
        setTitle(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(createTournamentPanel(actionListener));
        pack();
        setVisible(true);
    }

    private JPanel createTournamentPanel(ActionListener actionListener) {
        JPanel tournamentPanel = new JPanel();

        //construct components
        surname = new JTextField(SURNAME, 1);
        surname.setBorder(BorderFactory.createEmptyBorder());
        surname.setHorizontalAlignment(JTextField.CENTER);
        lastName = new JTextField(LAST_NAME, 1);
        lastName.setBorder(BorderFactory.createEmptyBorder());
        lastName.setHorizontalAlignment(JTextField.CENTER);
        rating = new JTextField(RATING, 1);
        rating.setBorder(BorderFactory.createEmptyBorder());
        rating.setHorizontalAlignment(JTextField.CENTER);
        submit = new JButton(SUBMIT);
        submit.addActionListener(actionListener);
        tournamentMode = new JComboBox<>();
        tournamentMode.setModel(new DefaultComboBoxModel(TournamentMode.values()));
        ((JLabel) tournamentMode.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        start = new JButton(START);
        start.addActionListener(actionListener);
        info = new JLabel();
        informToAddPlayer();
        info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        info.setHorizontalAlignment(JTextField.CENTER);
        players = new JTable();

        //set components properties
        surname.setToolTipText(SURNAME_TOOL_TIP);
        lastName.setToolTipText(LAST_NAME_TOOL_TIP);
        rating.setToolTipText(RATING_TOOL_TIP);
        submit.setToolTipText(SUBMIT_TOOL_TIP);
        tournamentMode.setToolTipText(TOURNAMENT_MODE_TOOL_TIP);
        start.setToolTipText(START_TOOL_TIP);
        info.setToolTipText(INFO_TOOL_TIP);
        players.setToolTipText(PLAYERS_TOOL_TIP);

        //adjust size and set layout
        tournamentPanel.setPreferredSize(new Dimension(1280, 1024));
        tournamentPanel.setBackground(Color.LIGHT_GRAY);
        tournamentPanel.setLayout(null);

        //add components
        tournamentPanel.add(surname);
        tournamentPanel.add(lastName);
        tournamentPanel.add(rating);
        tournamentPanel.add(submit);
        tournamentPanel.add(tournamentMode);
        tournamentPanel.add(start);
        tournamentPanel.add(info);
        tournamentPanel.add(players);

        //set component bounds (only needed by Absolute Positioning)
        surname.setBounds(50, 50, 250, 50);
        lastName.setBounds(50, 125, 250, 50);
        rating.setBounds(50, 200, 250, 50);
        submit.setBounds(50, 300, 250, 50);
        tournamentMode.setBounds(50, 465, 250, 35);
        start.setBounds(50, 525, 250, 50);
        info.setBounds(50, 600, 250, 50);
        players.setBounds(400, 50, 600, 600);

        return tournamentPanel;
    }

    public void updatePlayers() {

    }

    public void informToAddPlayer() {
        info.setText(INFO_ADD_PLAYER);
    }

    public void informToStartGame() {
        info.setText(INFO_START_GAME);
    }

    public void wrongRating() {
        info.setText(INFO_WRONG_RATING);
    }

    public void wrongAttendee() {
        info.setText(INFO_WRONG_ATTENDEE);
    }

    public JTextField getSurname() {
        return surname;
    }

    public JTextField getLastName() {
        return lastName;
    }

    public JTextField getRating() {
        return rating;
    }

    public JButton getSubmit() {
        return submit;
    }

    public JComboBox<TournamentMode> getGameMode() {
        return tournamentMode;
    }

    public JButton getStart() {
        return start;
    }
}
