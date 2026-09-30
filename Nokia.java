import java.util.Scanner;

public class Nokia{ 

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

String prompt = """

Welcome to NOKIA MENU

Press

1.  Phone book
2.  Messages
3.  Chat
4.  Call register
5.  Tones
6.  Settings
7.  Call divert
8.  Music
9.  Games
10. Calculator
11. Reminders
12. Clock
13. Profiles
14. Services

""";


		System.out.println(prompt);
		int menuChoice = input.nextInt();

		switch(menuChoice){

			case 1 -> {

System.out.println("Phone book");
  
String phonebookPrompt = """

Press

1.  Search
2.  Service Nos
3.  Add name
4.  Erase
5.  Edit
6.  Copy
7.  Assign tone
8.  Send b’card
9.  Options 
""";
			System.out.println(phonebookPrompt);
			int phonebookMenuChoice = input.nextInt();

            switch(phonebookMenuChoice){

			    case 1 -> System.out.println("Search"); 
			    case 2 -> System.out.println("Service Nos"); 
			    case 3 -> System.out.println("Add name");		
                case 4 -> System.out.println("Erase");
                case 5 -> System.out.println("Edit");
                case 6 -> System.out.println("Copy");
                case 7 -> System.out.println("Assign tone");
                case 8 -> System.out.println("Send b'card");
                case 9 -> System.out.println("Option");
                case 10 -> System.out.println("Speed dials");
                case 11 -> System.out.println("Voice tags");               
                    }   
                }
	        case 2 -> {
System.out.println("Messages"); 

String messagesPrompt = """

Press

1.  Write messages
2.  Inbox
3.  Outbox
4.  Picture messages
5.  Templates
6.  Smileys
7.  Message settings
8.  Info service
9.  Voice mailbox number
10. Service command editor

""";
		 System.out.println(messagesPrompt);
			int messagesMenuChoice = input.nextInt();

           switch(messagesMenuChoice){
            
              case 1 -> System.out.println("Write messages");
              case 2 -> System.out.println("Inbox");
              case 3 -> System.out.println("Outbox");
              case 4 -> System.out.println("Picture messages");
              case 5 -> System.out.println("Templates");
              case 6 -> System.out.println("Smiley");
              case 7 -> System.out.println("Message setting");
              case 8 -> System.out.println("Info service");
              case 9 -> System.out.println("Voice mailbox number");
              case 10 -> System.out.println("service command editor");                         
              }       
          }
			case 3 ->System.out.println("Chat"); 
            
            case 4 -> {
System.out.println("Call register"); 

String callregisterPrompt = """

Press

1.  Missed calls
2.  Received calls
3.  Dialled numbers
4.  Erase recent call lists
5.  Show call duration
6.  Show call costs
7.  Call cost settings
8.  Prepaid

""";
            System.out.println(callregisterPrompt);
			int callregisterMenuChoice = input.nextInt();

           switch(callregisterMenuChoice){
            
                case 1 -> System.out.println("Missed calls");
                case 2 -> System.out.println("Received calls");
                case 3 -> System.out.println("Dialled numbers");
                case 4 -> System.out.println("Erase recent call lists");
                case 5 -> {

                  System.out.println("Show call duration");

			      int callDuration = input.nextInt();
                  switch(callDuration){
                      case 1 -> System.out.println("Last call duration");
                      case 2 -> System.out.println("All calls’ duration");
                      case 3 -> System.out.println("Received calls’ duration");
                      case 4 -> System.out.println("Dialled calls’ duration");
                      case 5 -> System.out.println("Clear timers");
                      }
               }       
                  case 6 -> {
                    System.out.println("Show call costs");

                    int callCosts = input.nextInt();             
                    switch(callCosts){
                      case 1 -> System.out.println("Last call cost");
                      case 2 -> System.out.println("All calls’ cost");
                      case 3 -> System.out.println("Clear counters");
                        }
                    } 
                   case 7 -> { 
                    System.out.println("Call cost settings"); 
                    int callcostsettings = input.nextInt();             
                    switch(callcostsettings){

                        case 1 -> System.out.println("Call cost limit");
                        case 2 -> System.out.println("Show costs in");
                    }
                }
               case 8 -> System.out.println("Prepaid");               
            }
        }

		    case 5 -> { System.out.println("Tones"); 
             
            String tonesPrompt = """

Press

1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Message alert tone
5. Keypad tones
6. Warning tones
7. Vibrating alert
8. Screen saver
""";
			System.out.println(tonesPrompt);
			int tonesMenuChoice = input.nextInt();

            switch(tonesMenuChoice){

			    case 1 -> System.out.println("Ringing tone"); 
			    case 2 -> System.out.println("Ringing volume"); 
			    case 3 -> System.out.println("Incoming call alert");		
                case 4 -> System.out.println("Message alert tone");
                case 5 -> System.out.println("Keypad tones");
                case 6 -> System.out.println("Warning tones");
                case 7 -> System.out.println("Assign tone");
                case 8 -> System.out.println("Vibrating alert");
                case 9 -> System.out.println("Option");
                case 10 -> System.out.println("Speed dials");
                case 11 -> System.out.println("Screen saver");               
                    }   
                }

            case 6 -> {
            System.out.println("Settings"); 

String settingsPrompt = """

Press

1. Call settings
2.  Phone settings
3.  Security settings
4.  Restore factory settings

""";
            System.out.println(settingsPrompt);
			int settingsMenuChoice = input.nextInt();

           switch(settingsMenuChoice){
            
                case 1 -> {

                    System.out.println("Call settings");

			      int callSettingsChoice = input.nextInt();
                  switch(callSettingsChoice){ 
                      case 1 -> System.out.println("Automatic redial");
                      case 2 -> System.out.println("Speed dialling");
                      case 3 -> System.out.println("Call waiting options");
                      case 4 -> System.out.println("Own number sending");
                      case 5 -> System.out.println("Phone line in use");
                      case 6 -> System.out.println("Automatic answer");
                      }
                }

                case 2 -> {

                    System.out.println("Phone settings");

                  int phoneSettingsChoice = input.nextInt();
                  switch(phoneSettingsChoice){
                      case 1 -> System.out.println("Language");
                      case 2 -> System.out.println("Cell info display");
                      case 3 -> System.out.println("Welcome note");
                      case 4 -> System.out.println("Network selection");
                      case 5 -> System.out.println("Phone line in use");
                      case 6 -> System.out.println("Confirm SIM service actions");
                      default-> System.out.println("Exit"); 
                      }
               }  
                
                case 3 -> {
                    System.out.println("Security settings");

                    int securitySettingsChoice = input.nextInt();
                  switch(securitySettingsChoice){
                      case 1 -> System.out.println("PIN code request");
                      case 2 -> System.out.println("Call barring service");
                      case 3 -> System.out.println("Fixed dialling");
                      case 4 -> System.out.println("Closed user group");
                      case 5 -> System.out.println("Security level");
                      }
                }
            }
        }
            case 7 -> System.out.println("Call divert"); 
            case 8 -> { System.out.println("Music"); 
             String musicPrompt = """

Press

1. Music player
2. Radio
3. Recorder
4. Track list

""";
            
            }
            case 9 -> System.out.println("Games"); 
            case 10 -> System.out.println("Calculator"); 
            case 11 -> System.out.println("Reminders"); 
            case 12 ->{
    System.out.println("Clock"); 
    String clockPrompt = """

Press

1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time2
""";
                 System.out.println(clockPrompt); 

                    int clockChoice = input.nextInt();
                  switch(clockChoice){
                      case 1 -> System.out.println("Alarm clock");
                      case 2 -> System.out.println("Clock settings");
                      case 3 -> System.out.println("Date setting");
                      case 4 -> System.out.println("Stopwatch");
                      case 5 -> System.out.println("Countdown timer");
                      case 6 -> System.out.println("Auto update of date and time");
                      default -> System.out.println("Exit");
			
                      }
                }
            
            case 13 -> System.out.println("Profiles"); 
            case 14 -> System.out.println("Services"); 
        }
    }
}

