import java.util.Scanner;
public class Main
{

    //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
    //May want to create an array of goodbye answers.
    static String[] goodBye = {"bye"};
   
       public static void main(String[] args)
       {
        
        //TOP 30 PLAYERS LIST
         Player lebron = new Player("LeBron James", 40741, 11274 , 11112);
	 Player jordan = new Player("Micheal Jordan", 32292, 6672, 5633);
	 Player kareem = new Player("Kareem Abdul-Jabbar", 38387, 17440, 5660);
	 Player karl = new Player ("Karl Malone", 36928, 14968, 5248);
         Player kobe = new Player("Kobe Bryant", 33643, 7047, 6306);
	 Player dirk = new Player("Dirk Nowitzki", 31560, 11489, 3651);
	 Player wilt = new Player("Wilt Chamberlain" 31419, 23924, 4643);
	 Player shaq = new Player("Shaquille Oneil" 28596, 13099, 3026);
	 Player tim = new Player("Tim Duncan" 26496, 15091, 4225);
	 Player hakeem = new Player("Hakeem Olajuwon" 26946, 13748, 3058);
	 Player oscar = new Player(“Oscar Robinson” 26710, 7804, 9887);
	 Player kevin = new Player(“Kevin Garnett” 26071, 14662, 5445);
	 Player moses = new Player(“Moses Malone” 27409, 1212, 1936);
	 Player elvin = new Player(“Elvin Hayes” 27313, 16279, 1771);
	 Player john = new Player(“John Stockton” 19711, 4051, 15806);
	 Player bird = new Player(Larry Bird” 21791, 8974, 5695);
	 Player magic = new Player(“Magic Johnson” 17707, 6559, 10141);
	 Player charles = new Player(“Charles Barkley” 23757, 12546, 4215);
	 Player david = new Player(“David Robinson” 20790, 10497, 2441);
	 Player paul = new Player(“Paul Pierce” 26397, 7527, 4708);
	 Player dwayne = new Player("Dwayne Wade" 23165, 4933, 5701);
	 Player carmelo = new Player("Carmelo Anthony" 28289, 7808, 3422);
	 Player steph = new Player(“Steph Curry” 21712, 4212, 5390);
	 Player durant = new Player(“Kevin Durant” 26892, 6959, 4072);
	 Player russ = new Player(“Russel Westbrook” 24457, 7652, 9080);
	 Player chris = new Player(“Chris Paul” 20316, 5577, 11501);
	 Player jams = new Player(“James Harden” 24693, 5394, 6795);
	 Player anthony = new Player(“Anthony Davis” 16381, 7374, 2471);	 
         Player giannis = new Player("Giannis Antetokounmpo" 15595, 6720, 3191);
         Player bill =  new Player("Bill Russell", 14522, 21620, 4100);

        
        
        
        
        
        
        
        
        
        
        // THE CHAMPIONS ARE GOING HERE  
        
        
        
        Scanner in = new Scanner (System.in);//Creates scanner object.
        Scanner in2 = new Scanner (System.in);//Creates a second scanner object.

        System.out.println("Wassup! My name is BBQ, short for BOMBASTIC BASKETBALL QUESTIONS! I am here to answer questions you may have on the amazing sport of basketball");
        
        
        String userResp = in.nextLine(); //in.nextLine() uses the scanner object to get the user's responnse as a String
        System.out.println(userResp);
        System.out.println("1. If you would like to learn about the History of Basketball, Type 1");
        System.out.println("2. If you would like to learn about the Players of Basketball, Type 2");
        System.out.println("3. If you would like to learn about the Rules/Rule Changes of Basketball, Type 3");
        //int numResp = in2.nextInt();//Gets the user's input as an integer. 
        if (in2.hasNextInt()) { 
            int numResp = in2.nextInt(); 
        double x = (int)Math.random()*50;


        if(numResp != 1 && numResp != 2 && numResp != 3){    
                if(x > 5 && x <= 10){
                        System.out.println("That is not a valid response. Please type 1, 2, or 3 depending on what you learn");
                }
                if(x <= 5){
                        System.out.println("Please try again. Bombastic Basketball Questions is here to help! Just type 1, 2, or 3");
                        
                }
                if(x > 10 && x <= 15){
                        System.out.print("Have no fear BBQ is here. All go have to do is type 1,2, or 3 depending on what you want to learn. YOU GOT THIS!!!!");

                }
               
                }

                }
        }
        public static boolean containsAny(String input, String[] keywords){
                for(String keywords: keywords){
                        if(input.contains(keyword){
                                return true;
                        })
                }
        return false;
        }

        if(numResp == 1){
                System.out.println("One History lesson coming up! What would you like to know? For example I can cook up info on who and where the game was made, or the champions from any year since it's creation! "); 
                public static String giveResponse(String statement){
                        if(containsAny(statement, new String[]  {"who", "where", "made"})){
                        System.out.println("Basketball is a relatively new game, was established on December 21 1891, in Springfield, Massachusetts, USA, at the International YMCA Training School (now known as Springfield College). It was made by a man named Dr.James Nesmith");
                        }
        }               if(containsAny(statement, new String [] {"champion", "champions", "champs", "winners"})){
                        System.out.println("")
        }
        if(numResp == 2){
                System.out.println("Sure champ! I can tell you about specific legends, and their accomplishments, or even about some current risign stars in the league");
        }
        if(numResp == 3){
                System.out.println("Nylon! I can put you on game about some rules that you might have some questions about, or even some rule changes that were implemented throughut the history of Basketball that revolutionised the game");
                System.out.println("");
                System.out.println("Would you like to to learn about the basic rules of the game, or learn about the most fundamental rule changes the sport has seen");
                if (userResp.equals("basic")) {
                        System.out.println("hola mi amigo");



                }
            }

            else { // **CHANGE: Handle non-integer input or "null"**
            System.out.println("That is not a valid response. Please type 1, 2, or 3.");


        }
        
//if(userResp == null){
                //System.out.println("Please type 1, 2, or 3 depending on what you want to learn");
                 //}
               
               //else{
                //System.out.println("Please type 1,2, or 3 depending on what you want to learn");
               //}
                        } 

       } 

       


        


        //You will need to make sure your chatbot continues looping until it sees certain keywords from the user such as "bye","goodbye"...
        // do you need a while loop or a for loop?
          
        //Consider: How do I check what the user says and compare it to my keywords? What methods do I have?
             


       //Create other methods that might be helpful down here. 
       //For example a method called checkWord where the user traverses through an array to check if a word matches.
       
       //One method you might need is getRandomResponse()
       public static String getRandomResponse(){
            return "";
       }
       // It'll generate a random response when the chatbot doesn't understand what to say

       //Here is an example of a method you might use.
         public static String getResponse(String statement)
         {
                 String response = "";
                 if (statement.indexOf("no") >= 0)
                 {
                         response = "Why so negative?";
                 }
                 else if (statement.indexOf("mother") >= 0
                                 || statement.indexOf("father") >= 0
                                 || statement.indexOf("sister") >= 0
                                 || statement.indexOf("brother") >= 0)
                 {
                         response = "Tell me more about your family.";
                 }
                 else
                 {
                         //respoonse = getRandomResponse() <--- yo uwill need to create this methodd.
                 }
                 return response;
         }

        }    
