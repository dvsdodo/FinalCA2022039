/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalca2022039;

import java.util.Scanner;

/**
 *
 * @author dvsdo
 */
public class Menu {
    
    private int chooseOption;
    private int chooseOption2;
    private boolean value = true;
    private boolean value2 = true;
    private int option;
    private int numClubStaff;
    private int numCoaching;
    
    /**
     * askoptions will ask the user which option they want 
     * @return a value they chose 
     */
    public int askoptions(){
        
        while (value == true) {
            
            Scanner myKB = new Scanner(System.in);
            
            try {
                
                System.out.println("Which lis bellow do you want to print ?");
                System.out.println("1- List all staff");
                System.out.println("2- List staff in a particular category");
                System.out.println("3- List all Groups");
                System.out.println("4- List Groups of a particular type");
                System.out.println("5- List Groups based on the day they train");
                System.out.println("6- List all the swimmers in a particular Group");
                System.out.println("7- List the swimmers coached by a particular coach");
                System.out.println("8- List all swimmers in the club");
                
                chooseOption = myKB.nextInt();
                
                switch (chooseOption){
                    case 1:
                            option = 1;
                            value = false;
                            break;
                    case 2:
                        while (value2 == true){
                            Scanner myKB2 = new Scanner(System.in);
                            try {
                                System.out.println("Which category?");
                                System.out.println("1- Club Staff");
                                System.out.println("2- Coaching");
                                chooseOption2 = myKB2.nextInt();

                                if (chooseOption2 == 1) {
                                    option = 21;
                                    value = false;
                                    value2 = false;
                                   // break;
                                }else if (chooseOption2 == 2) {
                                    option = 22;
                                    value = false;
                                    value2 = false;
                                   // break;
                                }else {
                                    System.out.println("Choose one of two options");
                                    
                                }
                            } catch (Exception e) {
                                System.out.println("That is not a valid value!");
                            }  
                        }  
                        break;

                    case 3:
                            option = 3;
                            value = false;
                            break;    
                    case 4:
                        while (value2 == true){
                            Scanner myKB2 = new Scanner(System.in);
                                try {
                                    System.out.println("Which Group?");
                                    System.out.println("1- Baby");
                                    System.out.println("2- Child");
                                    System.out.println("3- Kid");
                                    System.out.println("4- Teenager");
                                    System.out.println("5- Adult");
                                    System.out.println("6- Experient");
                                    System.out.println("7- Elder");
                                    chooseOption2 = myKB2.nextInt();

                                        switch (chooseOption2) {
                                            case 1:
                                                option = 41;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 2:
                                                option = 42;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 3:
                                                option = 43;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 4:
                                                option = 44;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 5:
                                                option = 45;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 6:
                                                option = 46;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 7:
                                                option = 47;
                                                value = false;
                                                value2 = false;
                                                break;

                                            default:System.out.println("Choose one of the options below");
                                        }

                                } catch (Exception e){
                                        System.out.println("That is not a valid value!");
                                }
                            }
                            break;
                    case 5:
                        while (value2 == true){
                            Scanner myKB2 = new Scanner(System.in);
                                try {
                                    System.out.println("Which Day?");
                                    System.out.println("1- Sunday");
                                    System.out.println("2- Monday");
                                    System.out.println("3- Tuesday");
                                    System.out.println("4- Wednesday");
                                    System.out.println("5- Thursday");
                                    System.out.println("6- Friday");
                                    System.out.println("7- Saturday");
                                    chooseOption2 = myKB2.nextInt();

                                        switch (chooseOption2) {
                                            case 1:
                                                option = 51;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 2:
                                                option = 52;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 3:
                                                option = 53;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 4:
                                                option = 54;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 5:
                                                option = 55;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 6:
                                                option = 56;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 7:
                                                option = 57;
                                                value = false;
                                                value2 = false;
                                                break;

                                            default:System.out.println("Choose one of the options below");
                                        }

                                } catch (Exception e){
                                        System.out.println("That is not a valid value!");
                                }
                            }
                            break;
                    
                    case 6:
                        while (value2 == true){
                            Scanner myKB2 = new Scanner(System.in);
                                try {
                                    System.out.println("Which Group?");
                                    System.out.println("1- Baby");
                                    System.out.println("2- Child");
                                    System.out.println("3- Kid");
                                    System.out.println("4- Teenager");
                                    System.out.println("5- Adult");
                                    System.out.println("6- Experient");
                                    System.out.println("7- Elder");
                                    chooseOption2 = myKB2.nextInt();

                                        switch (chooseOption2) {
                                            case 1:
                                                option = 61;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 2:
                                                option = 62;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 3:
                                                option = 63;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 4:
                                                option = 64;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 5:
                                                option = 65;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 6:
                                                option = 66;
                                                value = false;
                                                value2 = false;
                                                break;

                                            case 7:
                                                option = 67;
                                                value = false;
                                                value2 = false;
                                                break;

                                            default:System.out.println("Choose one of the options below");
                                        }

                                } catch (Exception e){
                                        System.out.println("That is not a valid value!");
                                }
                        }
                        break;
                            
                    case 7:
                        option = 7;
                        value = false;
                        break;
                        
                    case 8:
                        option = 8;
                        value = false;
                        break;
                            
                    default: System.out.println("That is not a valid value!!");
                }
                    
            } catch (Exception e) {
                System.out.println("Choose the valid option");
            }
        
         }
        
        return option;
    }
    
    /**
     * askClubStaff will ask how many Admin they want
     * @return a number of Admin
     */
    public int askClubStaff (){
        while (value == true) {
            Scanner myKB = new Scanner(System.in);
            try{
                System.out.println("How many Admin do you have?");
                numClubStaff = myKB.nextInt();
                
                if (numClubStaff > 9){
                    System.out.println("Thank you for you confirmation!");
                    value = false;
                }else{
                    System.out.println("Admin number must be greater than 9");
                }
            }catch (Exception e){
                System.out.println("That is not a valid value!");
            }
        }
        
        
        return numClubStaff;
    }
    
    /**
     * askCoaching will ask how many couching they want
     * @return a number of couching
     */
    public int askCoaching (){
        while (value == true) {
            Scanner myKB = new Scanner(System.in);
            try{
                System.out.println("How many Coaching do you have?");
                numCoaching = myKB.nextInt();
                
                if (numCoaching > 29){
                    System.out.println("Thank you for you confirmation!");
                    value = false;
                }else{
                    System.out.println("Coaching number must be greater than 29");
                }
            }catch (Exception e){
                System.out.println("That is not a valid value!");
            }
        }
        
        
        return numCoaching;
    }
    
}
