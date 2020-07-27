/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author RUPALI TRIPATHI
 */
public class LL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        //upar comment niche code
        //sare production rules map name ke hashmap mein stored hein
        HashMap<Character, ArrayList<String>> map = new HashMap<>();
        //we need to add all the non terminals in a set to check!
       Set<Character> nonTerminalSet = new HashSet<>(); 
       //map to store elements of first named sol_first
        HashMap<String, ArrayList<String>> sol_first = new HashMap<>();
       //dekho first ka sol bhi 1 map ki values se aarha hai
       //hai jiski values arraylist hai toh hence uska arraylist
       ArrayList<String> sol_first_array_list=new ArrayList<>();
       //map to store elements of follow named sol_follow
       HashMap<String, ArrayList<String>> sol_follow = new HashMap<>();
       //
        
        System.out.println("Girl, you can do all you want to or aspire to!");
        System.out.println("Enter the no of rules  and production rules");
        int no_of_rules=scan.nextInt();
        System.out.println("Girl, you can do all you want to or aspire to!");
        String rules[]=new String[no_of_rules];
        for(int i=0;i<no_of_rules;i++)
            rules[i]=scan.next();
            char non_terminals[];
        non_terminals = new char[10];
        
        for(int i=0;i<rules.length;i++)
        {
            non_terminals[i]=rules[i].charAt(0);
            
        }
        for(int i=0;i<rules.length;i++)
        {
            System.out.println(non_terminals[i]);
        }
        
       // HERE i made a map to store all the production rules
        String temp1[]=new String[10];
        String t2[]=new String[10];
        String str;
        for(int l=0;l<rules.length;l++)
        {    str=rules[l];
            String[] t1=str.split("-");
                    for(int i=0;i<t1.length;i++)
                        System.out.println(t1[i]);
            t2=t1[1].split("/");
            for(int i=0;i<t2.length;i++)
                        System.out.println(t2[i]);
            ArrayList<String> arraylist = new ArrayList<String>();
         for(int j = 0;j<t2.length; j++)
                {
                    arraylist.add(t2[j]);
                }
         map.put(non_terminals[l],arraylist);
         nonTerminalSet.add(non_terminals[l]);
         sol_first.put(rules[l],null);
         sol_follow.put(rules[l],null);
        }
        System.out.println(map);
        System.out.println(sol_first);
        System.out.println(sol_follow);
        System.out.println(nonTerminalSet);
        System.out.println(map.keySet());
        System.out.println(map.values());
        
        
            
        
        //------------------------------------------------------------------------------------------------------
       //----------------------------------------------------------------------------------------------------------
       //abb hum first bnnaneynge. uske lie sabse phle we will iterate through the map!
       Iterator <Map.Entry<Character, ArrayList<String>>> itr=map.entrySet().iterator();
       while(itr.hasNext())
       {
           Map.Entry<Character, ArrayList<String>> entry=itr.next();
           ArrayList<String> rules_divide=entry.getValue();
           //System.out.println(rules_divide);
           for(int i=0;i<rules_divide.size();i++)
           {
               //System.out.println(rules_divide.get(i));
              Character c;
               c = rules_divide.get(i).charAt(0);
               System.out.println(c);
               
               //yh mne check krwaya ki agar 1st index prr hi koi NT hai then
               if(nonTerminalSet.contains(c))
               {
                   System.out.println("T");
                  // System.out.println(get(c));
                  
               }
               else
               {
                   System.out.println(map.get(c));
                   //sol_first_array_list=map.get(c);
                   //System.out.println(sol_first_array_list);
               }
               
               
               
           }
       }
       
       
        
        
        
    }
    
    
}
