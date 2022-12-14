import java.io.*;
	import java.util.*;

	public class mazepathwithjump{

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            printMazePaths(1,1,n,m,"");

	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	     if(sc==dc&&sr==dr){
            System.out.println(psf);
            return;
         }  

         if(sc<dc){
            for(int ms = 1; ms <= dc - sc; ms++){
                  printMazePaths(sr,sc+ms,dr,dc,psf+"h"+ms);
            }
             
         } 
         if(sr<dr){
             for(int ms = 1; ms <= dr- sr; ms++){
                  printMazePaths(sr+ms,sc,dr,dc,psf+"v"+ms);
            }
         }
         if(sr<dr&&sc < dc){
            for(int ms = 1; ms <= dc- sc && ms<= dr - sr; ms++){
                printMazePaths(sr+ms,sc+ms,dr,dc,psf+"d"+ms);
            }
         }
	    }

	}