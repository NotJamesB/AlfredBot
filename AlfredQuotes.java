import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return String.format("Hello %s, Hope you're doing well today!", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("Today is %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") > -1){
            return("I hardly know that name, But i may be of assistance");
        }
        else if(conversation.indexOf("Alfred") > -1){
            return("Right away sir.");
        }
        else{
            return "I don't think he's talking to me...";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

