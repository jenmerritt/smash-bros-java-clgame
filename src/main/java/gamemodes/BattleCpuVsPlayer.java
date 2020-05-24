package gamemodes;

import characters.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BattleCpuVsPlayer {

    private Player cpuCharacter;
    private Player playerCharacter;
    private boolean isFinished;
    private ArrayList<Player> charactersList;

    public BattleCpuVsPlayer(){
        this.cpuCharacter = null;
        this.playerCharacter = null;
        this.isFinished = false;
        this.charactersList = new ArrayList<Player>((
                                    Arrays.asList(
                                        new Bowser(),
                                        new DonkeyKong(),
                                        new Kirby(),
                                            new Link(),
                                            new Mario(),
                                            new Yoshi()
                                    )));
    }

    public Player getCpuCharacter() {
        return cpuCharacter;
    }

    public void setCpuCharacter(Player cpuCharacter) {
        this.cpuCharacter = cpuCharacter;
    }

    public Player getPlayerCharacter() {
        return playerCharacter;
    }

    public void setPlayerCharacter(Player playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public ArrayList<Player> getCharactersList() {
        return charactersList;
    }

    public void setCharactersList(ArrayList<Player> charactersList) {
        this.charactersList = charactersList;
    }

    public Player findPlayerByIndex(int index){
        return this.charactersList.get(index);
    }

    public void playerCharacterSelection(){
        System.out.println("CHARACTER SELECTION");
        for(int i = 0; i < this.charactersList.size(); i++){
            System.out.println(i + ": " + this.charactersList.get(i).getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the character you choose:");
        int playerSelectionEntered = Integer.parseInt(scanner.nextLine());
        Player playerChosen = findPlayerByIndex(playerSelectionEntered);
        this.charactersList.remove(playerChosen);
        setPlayerCharacter(playerChosen);
        System.out.println("You chose " + playerChosen.getName());
    }

    public void cpuCharacterSelection(){
        ArrayList<Player> players = this.charactersList;
        Collections.shuffle(players);
        Player cpuSelected = players.get(0);
        setCpuCharacter(cpuSelected);
        System.out.println("CPU chooses: " + cpuSelected.getName());
    }

    public void announceBattle(){
        System.out.println("It's......    " + this.playerCharacter.getName() + "   VERSUS   " + this.cpuCharacter.getName());
        System.out.println("LET THE BATTLE COMMENCE!");
    }

}
