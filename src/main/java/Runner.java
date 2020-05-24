import gamemodes.BattleCpuVsPlayer;

public class Runner {

    public static void main(String[] args){

        System.out.println("Welcome to the ultimate Super Smash Bros Game!");

        BattleCpuVsPlayer battle = new BattleCpuVsPlayer();

        battle.playerCharacterSelection();
        battle.cpuCharacterSelection();
        battle.announceBattle();



    }



}
