package controller;

import model.Player;
import service.FileService;
import view.TournamentFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Controller implements ActionListener {

    private Set<Player> players;
    private FileService fileService;
    private TournamentFrame tournamentFrame;

    public Controller() throws IOException {
        players = new HashSet<Player>();

        fileService = new FileService();
        fileService.createFile();

        tournamentFrame = new TournamentFrame(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(tournamentFrame.getSubmit())) {
            addPlayer(tournamentFrame.getSurname().getText(),
                    tournamentFrame.getLastName().getText(),
                    tournamentFrame.getRating().getText());
        } else if (e.getSource().equals(tournamentFrame.getStart())) {
            startTournament();
        }
    }

    private void startTournament() {

    }

    private void addPlayer(String surname, String lastName, String dwz) {
        if (dwz.matches("\\d+")) {
            players.add(new Player(surname, lastName, Integer.parseInt(dwz)));
        } else {
            tournamentFrame.wrongRating();
        }
    }
}
