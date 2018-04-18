package flowcontrol;
import java.util.Random;
/**
 *
 * @author Raikao
 */
public class FlowControl {

    //I'm in the Matrix
    public static void main(String[] args) {
       int[][] list = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
       Random rand = new Random();
       int n = rand.nextInt(20) + 1;
       int posX = -1;
       int posY = -1;
       PARENT_LOOP: for(int i=0; i<list.length; i++){
           for(int j=0; j<list[i].length; j++ ){
               if(list[i][j] == n){
               posX = i;
               posY = j;
               break PARENT_LOOP;
               }
            }
       }
       if(posX == -1 || posY == -1){
           System.out.println("Wert n=" + n + " nicht gefunden");
       } else {
           System.out.println("Wert n=" + n + " gefunden an Stelle: " + "(" + posX + "," + posY + ")");
             
       }
       
    }
    
}
