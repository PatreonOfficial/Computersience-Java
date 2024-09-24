/**
 * Write a description of class master here.
 *
 * @author PatreonOfficial
 * @version 1.UrMom
 */
public class game
{
    int[][] playingfield = {{0,0,0,0,0},
                            {0,0,0,0,0},
                            {0,0,0,0,0},
                            {0,0,0,0,0},
                            {0,0,0,0,0}};
    int[] pos1 = {0,0};
    int[] pos2 = {4,4};
    public game(){
        playingfield[0][0] = 1;
        playingfield[4][4] = 2;
        updateGame();
    }
    public void updateGame(){
        for(int i=0;i<playingfield.length;i++){
            for(int j=0;j<playingfield[i].length;j++){
                System.out.print(playingfield[i][j]);
            }
            System.out.println("");
        }
    }
    public void moveVerical(int figure,int by){
        if(figure == 1 && pos1[0] + by < 5 && pos1[0] + by > 0){
            int[] now = {pos1[0]+by,pos1[1]};
            playingfield[now[0]][now[1]] = 1;
            playingfield[pos1[0]][pos1[1]] = 0;
            pos1= now;
        }
        else if(figure == 2 && pos2[0] + by < 5 && pos2[0] + by > 0){
            int[] now = {pos2[0]+by,pos2[1]};
            playingfield[now[0]][now[1]] = 2;
            playingfield[pos2[0]][pos2[1]] = 0;
            pos2= now;
        }
        else{System.out.print("Sorry, thats an invalid move! Check your Character! \n");}
        updateGame();
    }
    public void moveHorizontal(int figure,int by){
        if(figure == 1 && pos1[1] + by < 5 && pos1[1] + by > 0){
            int[] now = {pos1[0],pos1[1]+by};
            playingfield[now[0]][now[1]] = 1;
            playingfield[pos1[0]][pos1[1]] = 0;
            pos1 = now;
        }
        else if(figure == 2 && pos2[1] + by < 5 && pos2[1] + by > 0){
            int[] now = {pos2[0],pos2[1]+by};
            playingfield[now[0]][now[1]] = 2;
            playingfield[pos2[0]][pos2[1]] = 0;
            pos2= now;
        }
        else{System.out.print("Sorry, thats an invalid move! Check your Character! \n");}
        updateGame();
    }
    public void help(){
        System.out.println("This is the positive vertical\n|\n|\n|\n|\n\\/");
        System.out.println("And this is positive horizontal\n------------>");
        System.out.println("\n The Board, and all messages will be cleared and redrawn on every move");
    }
}
