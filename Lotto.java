/**
 *
 */
package lottery;


import java.util.Scanner;

/**
 * This Application is an example of a single class based Lottery game based on the popular Lotto game. In this you get to select 6 unique numbered balls out of 49 numbered balls. The draw generates 6 lucky number you win if all the 6 number matches irrespective of order.
 * @author Neel Sayar Deb
 * 
 */
public class Main {

    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.out.println("***Welcome to the Lottery***");
        System.out.println("Choose 6 Unique number between 0 and 49: ");
        
        /**
         * Take 6 numbers as input from user as there choice. 
         * 
         *  @throw exception in case of invalid entry namely if number chosen is more than 49 or choose same number twice
         */
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int lotteryNum0 = in.nextInt();
        if (lotteryNum0 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }

        System.out.println("Enter Number 2: ");
        int lotteryNum1 = in.nextInt();
        if (lotteryNum1 == lotteryNum0) {
            System.out.println("Invalid Entry. Duplicate lottery number selected");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum1 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }

        System.out.println("Enter Number 3: ");
        int lotteryNum2 = in.nextInt();
        if (lotteryNum2 == lotteryNum0) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum2 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum2 == lotteryNum1) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum2 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }

        System.out.println("Enter Number 4: ");
        int lotteryNum3 = in.nextInt();
        if (lotteryNum3 == lotteryNum0) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum3 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum3 == lotteryNum1) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum3 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum3 == lotteryNum2) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum3 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }

        System.out.println("Enter Number 5: ");
        int lotteryNum4 = in.nextInt();
        if (lotteryNum4 == lotteryNum0) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum4 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum4 == lotteryNum1) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum4 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum4 == lotteryNum2) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum4 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum4 == lotteryNum3) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum4 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }

        System.out.println("Enter Number 6: ");
        int lotteryNum5 = in.nextInt();
        if (lotteryNum5 == lotteryNum0) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum5 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum5 == lotteryNum1) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum5 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum5 == lotteryNum2) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum5 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }

        if (lotteryNum5 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum5 == lotteryNum3) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");

        }
        if (lotteryNum5 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum5 == lotteryNum4) {
            System.out.println("Invalid Entry. Please try again");
            throw new java.lang.Error("Please try again");
        }
        if (lotteryNum5 > 49) {
            System.out.println("Invalid Entry. Number has to be between 0 and 49");
            throw new java.lang.Error("Please try again");
        }

        /*
         * Generate a Random Number using Math.Random Class and * by 49 since we need a number between 0-49
         */

        int winningNum0 = (int) (Math.random() * 49);

        int winningNum1 = (int) (Math.random() * 49);
        if (winningNum1 == winningNum0) {
            winningNum1++;
        }

        int winningNum2 = (int) (Math.random() * 49);
        if (winningNum2 == winningNum0) {
            winningNum2++;
        }
        if (winningNum2 == winningNum1) {
            winningNum2++;
        }

        int winningNum3 = (int) (Math.random() * 49);
        if (winningNum3 == winningNum0) {
            winningNum3++;
        }
        if (winningNum3 == winningNum1) {
            winningNum3++;
        }
        if (winningNum3 == winningNum2) {
            winningNum3++;
        }

        int winningNum4 = (int) (Math.random() * 49);
        if (winningNum4 == winningNum0) {
            winningNum4++;
        }
        if (winningNum4 == winningNum1) {
            winningNum4++;
        }
        if (winningNum4 == winningNum2) {
            winningNum4++;
        }
        if (winningNum4 == winningNum3) {
            winningNum4++;
        }

        int winningNum5 = (int) (Math.random() * 49);
        if (winningNum5 == winningNum0) {
            winningNum1++;
        }
        if (winningNum5 == winningNum1) {
            winningNum1++;
        }
        if (winningNum5 == winningNum2) {
            winningNum1++;
        }
        if (winningNum5 == winningNum3) {
            winningNum1++;
        }
        if (winningNum5 == winningNum4) {
            winningNum1++;
        }

        //Inintializes The matches variable which will store the number of matching numbers

        int matches = 0;

        //Ask User if they are happy with the number and wish to proceed

        System.out.println("You have entered the numbers :" + lotteryNum0
                + ", " + lotteryNum1 + ", " + lotteryNum2 + ", " + lotteryNum3
                + ", " + lotteryNum4 + ", " + lotteryNum5);
        System.out.println("Do you wish to proceed? ");
        System.out.println("Press 0 for No");
        System.out.println("Press 1 for Yes");
        System.out.println("Enter your choice:");
        int proceed = in.nextInt();
        
        in.close();
        if (proceed == 0) {
            throw new java.lang.Error("Program Terminated...");
        } else {
            System.out.println("$10 has been deducted from your acount. Thanks for the Payment");
            System.out.print("Please Wait, lottery is being drawn.");
            try {
                Thread.sleep(500);
                
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            
           
            try {
                Thread.sleep(500);
                
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(500);
                
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println();

            // Print out the result that were generated by Math.Random Function 

            System.out.println("And the lucky number are : " + winningNum0 + ","
                    + winningNum1 + "," + winningNum2 + "," + winningNum3 + ","
                    + winningNum4 + "," + winningNum5);


            //Check if the number of matches the user has and increament the var matches with 1 for every match        
                    
            if (lotteryNum0 == winningNum0) {
                matches++;
            } else if (lotteryNum0 == winningNum1) {
                matches++;
            } else if (lotteryNum0 == winningNum2) {
                matches++;
            } else if (lotteryNum0 == winningNum3) {
                matches++;
            } else if (lotteryNum0 == winningNum4) {
                matches++;
            } else if (lotteryNum0 == winningNum5) {
                matches++;
            } else if (lotteryNum1 == winningNum0) {
                matches++;
            } else if (lotteryNum1 == winningNum1) {
                matches++;
            } else if (lotteryNum1 == winningNum2) {
                matches++;
            } else if (lotteryNum1 == winningNum3) {
                matches++;
            } else if (lotteryNum1 == winningNum4) {
                matches++;
            } else if (lotteryNum1 == winningNum5) {
                matches++;
            } else if (lotteryNum2 == winningNum0) {
                matches++;
            } else if (lotteryNum2 == winningNum1) {
                matches++;
            } else if (lotteryNum2 == winningNum2) {
                matches++;
            } else if (lotteryNum2 == winningNum3) {
                matches++;
            } else if (lotteryNum2 == winningNum4) {
                matches++;
            } else if (lotteryNum2 == winningNum5) {
                matches++;
            } else if (lotteryNum3 == winningNum0) {
                matches++;
            } else if (lotteryNum3 == winningNum1) {
                matches++;
            } else if (lotteryNum3 == winningNum2) {
                matches++;
            } else if (lotteryNum3 == winningNum3) {
                matches++;
            } else if (lotteryNum3 == winningNum4) {
                matches++;
            } else if (lotteryNum3 == winningNum5) {
                matches++;
            } else if (lotteryNum4 == winningNum0) {
                matches++;
            } else if (lotteryNum4 == winningNum1) {
                matches++;
            } else if (lotteryNum4 == winningNum2) {
                matches++;
            } else if (lotteryNum4 == winningNum3) {
                matches++;
            } else if (lotteryNum4 == winningNum4) {
                matches++;
            } else if (lotteryNum4 == winningNum5) {
                matches++;
            } else if (lotteryNum5 == winningNum0) {
                matches++;
            } else if (lotteryNum5 == winningNum1) {
                matches++;
            } else if (lotteryNum5 == winningNum2) {
                matches++;
            } else if (lotteryNum5 == winningNum3) {
                matches++;
            } else if (lotteryNum5 == winningNum4) {
                matches++;
            } else if (lotteryNum5 == winningNum5) {
                matches++;
            }
           

            // Check if matches is equal to 6 as that means that the numbers user has inserted is the same as the lucky draw result

            if (matches == 6) {
                System.out.println();
                System.out.println();
                System.out.println("Congrats You are the million dollar winner");
            } else {
                System.out.println();
                System.out.println();
                System.out.println("Better Luck next time");
            }
        }

    }

}
