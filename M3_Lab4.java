/**
 * TO CREATE ROCK PAPER SCISSOR GAME IN GUI 
 * Author : Kushal Poudel
 * Last Modified: 10/15/2023
 */

import javax.swing.*;
import java.util.*;

public class M3_Lab4 {
    
    public static void main(String[] args) {
        
        String introduction  = "<html><body><h2 style=\"text-align: center;";
               introduction += " color: #000000;\">Welcome: )</h2>";
               introduction += "<p>This is <font color =#AA4A44;> Rock</font>";
               introduction += "<font color =#FEDC56;> Paper</font> ";
               introduction += "<font color =#0000FF;>Scissors</font> game ";
               introduction += "where you<br> have to play against computer.";
               introduction += "</h4></p></body></html>";
        ImageIcon intro_icon = new ImageIcon("intro.png");
        
        JOptionPane.showMessageDialog(null,introduction,
               "Welcome Screen  \t\t\t\t\t\t    Kushal Poudel", 
               0, intro_icon);
        ImageIcon instruction_icon = new ImageIcon("instruction"
                                                    + "Icon.png");
           
        String instruction_msg ="<html><h2>The instructions are:"
                 + "</h2>-->You have to make your choice by clicking one<br>"
                 + "&nbsp&nbsp&nbsp&nbsp of "
                 + "the three buttons Rock/Paper/Scissor.<br>"+
                   "-->The computer also chooses one and the winner is "
                 + "determined.<br>-->There will be 3 set and the final score"
                 + " results will be shown.<br>-->One who has the most wins "
                 + "will be the winner.</html>";
                
        JOptionPane.showMessageDialog(null, instruction_msg, 
                    "Instructions \t\t\t\t\t\t\t\t\tKushal Poudel", 
                    0, 
                    instruction_icon );
       
        int loopCounter =0;
        int totalWins = 0;
        int totalLosses = 0;
        int totalTies=0;
        int playAgnValue = 0;
        
        while (playAgnValue ==0)
        {
                
            do
            {    
            
                ImageIcon icon_user_choice = new ImageIcon("RPS.png");
                String prompt_user_choice = "Please, Click on one of \n"+
                                            "the following buttons, \n"+
                                            "corresponding to your play\n";
            
                String[] choices = {"Rock","Paper","Scissors"};
        
                int player_choice_num=  JOptionPane.showOptionDialog(
                null,
                prompt_user_choice,
                "Enter your choice      \t\t\t         Kushal Poudel" ,
                0, 0, icon_user_choice,
                choices, choices[1]);
         
                String player_choice = "";
                String computer_choice = "";
       
                switch (player_choice_num)
                {
                    case 2:
                        player_choice = "\"Scissors\"";
                        break;
          
                    case 1:
                        player_choice ="\"Paper\"";
                        break;
                
                    case 0:
                        player_choice ="\"Rock\"";
                        break;
                }
           
                String resultsAccumulator = "<html>You played "+player_choice
                                       +"<br>";
       
                Random rangen = new Random();
                int computer_choice_num = rangen.nextInt(3);
          
                switch (computer_choice_num)
                {
                    case 2:
                        computer_choice = "\"Scissors\"";
                        break;
          
                    case 1:
                        computer_choice ="\"Paper\"";
                        break;
                
                    case 0:
                        computer_choice ="\"Rock\"";
                        break;
                }
        
                if (player_choice.equals(computer_choice))
                {
                    ImageIcon tieIcon = new ImageIcon("noHard"
                                                + "Feelings.png");
                    resultsAccumulator += " The computer played "
                                       + computer_choice+"<br>";
                    resultsAccumulator += "<br><br><h1> It's a TIE!"
                                       + "</h1></html>";
            
                    JOptionPane.showMessageDialog(null,
                    resultsAccumulator, 
                    "Results \t\t\t\t\t           Kushal Poudel", 
                    1, tieIcon);
                    totalTies++;
                }
        
                else if (player_choice.equals("\"Rock\"") &&
                        computer_choice.equals("\"Scissors\""))
                {
                    ImageIcon rockCrushScissorIcon = new ImageIcon("ro"
                                                + "ckCrushScissor.png");
                    resultsAccumulator += " The computer played "
                                       +computer_choice +"<br>";
                    resultsAccumulator += "<h1> Rock Crushes Scissors! </h1>";
                    resultsAccumulator +="<br><br> You win </html>";
        
                    JOptionPane.showMessageDialog(null,
                       resultsAccumulator, 
                       "Results \t\t\t\t           Kushal Poudel", 
                       1, rockCrushScissorIcon);
                    totalWins++;
                }
         
                else if (computer_choice.equals("\"Rock\"") && 
                        player_choice.equals("\"Scissors\""))
                {
                    ImageIcon rockCrushScissorIcon = new ImageIcon("rock"
                                                + "CrushScissor.png");
                    resultsAccumulator += " The computer played "
                                       +computer_choice +"<br>";
                    resultsAccumulator += "<h1> Rock Crushes Scissors! </h1>";
                    resultsAccumulator +="<br><br> Computer wins </html>";
             
                    JOptionPane.showMessageDialog(null,
                    resultsAccumulator, 
                    "Results \t\t\t\t             Kushal Poudel", 
                    1, rockCrushScissorIcon);
                    totalLosses++;
                }
        
                else if (player_choice.equals("\"Paper\"") && 
                        computer_choice.equals("\"Scissors\""))
                {
                    ImageIcon scissorCutPaperIcon = new ImageIcon("scissor"
                                               + "CutPaper.png");
                    resultsAccumulator += " The computer played "
                                       +computer_choice+"<br>";           
                    resultsAccumulator += "<h1> Scissors Cuts Paper! </h1>";
                    resultsAccumulator +="<br><br> Computer wins </html>";
            
                    JOptionPane.showMessageDialog(null,
                    resultsAccumulator, 
                    "Results \t\t\t\t                     Kushal Poudel", 
                    1, scissorCutPaperIcon);
                    totalLosses++;
                }    
        
                else if (player_choice.equals("\"Scissors\"") && 
                        computer_choice.equals("\"Paper\""))
        
                {
                    ImageIcon scissorCutPaperIcon = new ImageIcon("scissor"
                                               + "CutPaper.png");
                    resultsAccumulator += " The computer played "
                                       +computer_choice  +"<br>";
                    resultsAccumulator += "<h1> Scissors Cuts Paper! </h1>";
                    resultsAccumulator +="<br><br> You win</html>";
            
                    JOptionPane.showMessageDialog(null,
                    resultsAccumulator, 
                    "Results \t\t\t\t                  Kushal Poudel", 
                    1, scissorCutPaperIcon);
                    totalWins++;
                }    
                else if (player_choice.equals("\"Paper\"") &&
                        computer_choice.equals("\"Rock\""))
                {
                    ImageIcon paperWrapsRockIcon = new ImageIcon("paper"
                                               + "WrapsRock.png");
                    resultsAccumulator += " The computer played "
                                       +computer_choice+"<br>";
                    resultsAccumulator += "<h1> Paper Wraps Rock! </h1>";
                    resultsAccumulator +="<br><br> You win</html>";
            
                    JOptionPane.showMessageDialog(null,
                    resultsAccumulator, 
                    "Results \t\t\t\t             Kushal Poudel", 
                    1, paperWrapsRockIcon);
                    totalWins++;
                }
        
                else if (player_choice.equals("\"Rock\"") && 
                        computer_choice.equals("\"Paper\""))
                {
                    ImageIcon paperWrapsRockIcon = new ImageIcon("paper"
                                               + "WrapsRock.png");
                    resultsAccumulator += " The computer played "
                                       +computer_choice+"<br>";
                    resultsAccumulator += "<h1> Paper Wraps Rock! </h1>";
                    resultsAccumulator +="<br><br> Computer wins </html>";
        
                    JOptionPane.showMessageDialog(null,
                    resultsAccumulator, 
                    "Results \t\t\t\t             Kushal Poudel", 
                    1, paperWrapsRockIcon);
                    totalLosses++;
                }
       
                loopCounter++;
                
            }
            while(loopCounter<3);
         
            String finalScoreBoard = "<html>Final Score Board for 3 Games<br>";
               finalScoreBoard +="<h1>Wins : "+totalWins+"<br>";
               finalScoreBoard += "Loses : " +totalLosses+"<br>";
               finalScoreBoard += "Ties : " +totalTies+"</h1></html>";
       
            ImageIcon finalScoreBoardIcon = new ImageIcon("finalScore"
                                       + "BoardIcon.png");      
            JOptionPane.showMessageDialog(null, 
                        finalScoreBoard,
                        "ScoreBoard \t\t\t   Kushal Poudel",
                        1,finalScoreBoardIcon);
        
            totalWins= 0;
            totalLosses=0;
            totalTies=0;
            loopCounter =0;
        
            String[] playAgnOption = {"Play Again","Quit"};
            ImageIcon playAgnIcon =new ImageIcon("playAgain.png");
            String playAgnMsg= "<html><body><h2>Do you want to play again?</h2>"
                    + "If you want to play again simply click on play again."
                    + "<br>If you want to exit simply click in quit.";
            String playAgnTitle = "Play again \t\t\t\t\t\t\tKushal Poudel";
            playAgnValue = JOptionPane.showOptionDialog(null,
                playAgnMsg,
                playAgnTitle, 
                0, 0, playAgnIcon, 
                playAgnOption, playAgnOption[1]);
        }
        
        ImageIcon ending_icon = new ImageIcon("endingIcon.png");                
        String ending_message = "<html><h3>Thanks for playing."
                 + "<br>Hope you had fun:)</h3>"
                 +"<h2>Program Terminating!</h2>";
         
        JOptionPane.showMessageDialog(null, ending_message, 
                    "Terminating \t\t\t\t\tKushal Poudel", 
                    0, 
                    ending_icon );
    }
}
