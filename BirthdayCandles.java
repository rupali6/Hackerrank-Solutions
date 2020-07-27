/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulbswitcher;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.Map;

/**
 *
 * @author RUPALI TRIPATHI
 */
public class BirthdayCandles {
    
    public static void main(String args[])
    {
        HashMap <Integer,Integer> leaderboard=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        //no of players in the leaderboard
        int n =scan.nextInt();
        //scores wala array
        Integer scores[]=new Integer[n];
        for(int i=0;i<scores.length;i++)
            scores[i]=scan.nextInt();
        //alice ke games
        int m =scan.nextInt();
        //alice wala array
        Integer alice[]=new Integer[m];
        int sl=scores.length;
        for(int j=0;j<alice.length;j++)
            alice[j]=scan.nextInt();
        Arrays.sort(scores);
        //removing redundant elements from array
        int new_index;
         if (sl==0 || sl==1){  
             new_index=sl;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < sl-1; i++){  
            if (scores[i]!=scores[i+1]){  
                scores[j++] = scores[i];  
            }  
        }  
        scores[j++] = scores[sl-1];  
        new_index=j;
        for(int i=0;i<scores.length;i++)
            leaderboard.put(scores[i],i+1);
        System.out.println(leaderboard);
        
        for(int i=0;i<new_index;i++)
            System.out.println(scores[i]);
        
    }
    
    
}
