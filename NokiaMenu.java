import java.util.Scanner;
public class NokiaMenu{
public static void main (String[] args){
Scanner input =new Scanner(System.in);

System.out.println("""
...................Nokia Main Menu...................

1.Phone book
2.Messages
3.Chat
4.Call register
5.Tones
6.Settings
7.Call divert
8.Music
9.Games
10.Calculator
11.Reminders
12.Clock
13.Profiles
14.Services
15.SIM services
.....................................................
""");
System.out.print("Select one: ");
int mainMenuOPtion = input.nextInt();

switch (mainMenuOPtion){


case 1:
  System.out.println("""
  ..................Phone Book Menu...................
  1.Search
  2.Service Nos
  3.Add name
  4.Erase
  5.Edit
  6.Copy
  7.Assign tone
  8.Send b'card
  9.Options
  10.Speed dails
  11.Voicetags
  ....................................................
    """);
  System.out.println("Select one: ");
  int phoneBookoption = input.nextInt();
  
    switch (phoneBookoption){
    case 1:
    System.out.println("Searching...");
    break;
    case 2:
    System.out.println("07040088885");
    break;
    case 3:
    System.out.println("Deborah Olusegun ");
    break;
    case 4:
    System.out.println("Erasing...");
    break;
    case 5:
    System.out.println("You have edited this contact successfully");
    break;
    case 6:
    System.out.println("Copy details ");
    break;
    case 7:
    System.out.println("Assigning tone");
    break;
    case 8:
    System.out.println("Send birthday card");
    break;
    case 9:
    System.out.println("""
    ......................Options..................
    1.Memory in use
    2.Type of view
    3.Memory status
    ...............................................
      """);
      System.out.println("Select an option: ");
      int option = input.nextInt();
    switch(option){
    case 1:
    System.out.println("Nokia 33 Memory in use");
    break;
    case 2:
    System.out.println("Full View");
    break;
    case 3:
    System.out.println("5 GByte");
    break;
    }
    case 10:
    System.out.println("Speed dailing");
    break;
    case 11:
    System.out.println("Voicetags");
    break;
  }
  break;
  
  
  
  case 2:
  System.out.println("""
  .......................Message Menu..............
  1.Write messages
  2.Inbox
  3.Outbox
  4.Picture Messages
  5.Templates
  6.Smileys
  7.Message Settings
  8.Info service
  9.Voice mailbox number
  10.Service command editor
  ...................................................
  """);
  System.out.println("Select one: ");
  int messageOption = input.nextInt();
  switch (messageOption) {
    case 1:
    System.out.println("Written Message");
    break;
    case 2:
    System.out.println("My Inbox");
    break;
    case 3:
    System.out.println("My Outbox ");
    break;
    case 4:
    System.out.println("My Picture Messages ");
    break;
    case 5:
    System.out.println("My Templates");
    break;
    case 6:
    System.out.println("My Smileys ");
    break;
    case 7:
    System.out.println("""
    ...................Message settings..................
    1. Set 1
    2. Common
    .....................................................
    """);
    System.out.println("Select one: ");
    int messageSettings = input.nextInt();
      switch (messageSettings){
      
      case 1:
      System.out.println("""
      ..................Set 1..................
      1. Message centre number 
      2. Messages sent as 
      3. Message validity
      .........................................
      """);
      System.out.println("Select one: ");
      int setOptions = input.nextInt();
      switch (setOptions){
      case 1:
      System.out.println("My Message centre number ");
      break;
      case 2:
      System.out.println("This Message was sent as a ... ");
      break;
      case 3:
      System.out.println("This Message is valid  ");
      break;
      }
      break;
      
      case 2:
      System.out.println("""
      ..................Common..................
      1. Delivery reports 
      2. Reply via same centre 
      3. Character support
      .........................................
      """);
      System.out.println("Select one: ");
      int commonOptions = input.nextInt();
      switch (commonOptions){
      case 1:
      System.out.println("My Delivery reports ");
      break;
      case 2:
      System.out.println("Please reply via same centre ");
      break;
      case 3:
      System.out.println("My Character support  ");
      break;
      }
      break;
      }
    break;
    
    case 8:
    System.out.println("My Info service ");
    break;
    case 9:
    System.out.println("My Voice mailbox number ");
    break;
    case 10:
    System.out.println("My Service command editor  ");
  }
  break;
  
  
  case 3:
  System.out.println("Chat anyone in your contacts ");
  break;
  
  
  
  case 4:
  System.out.println("""
  .......................Call Register Menu..............
  1. Missed calls
  2. Received calls 
  3. Dialled numbers 
  4. Erase recent call lists 
  5. Show call duration
  6. Show call costs
  7. Call cost settings
  8. Prepaid credit
  ...................................................
  """);
  System.out.println("Select one: ");
  int callRegister = input.nextInt();
  switch (callRegister) {
    case 1:
    System.out.println("Your missed calls");
    break;
    case 2:
    System.out.println("Your received calls ");
    break;
    case 3:
    System.out.println("You dialed these numbers  ");
    break;
    case 4:
    System.out.println("You have erased your recent call list ");
    break;
    
    case 5:
    System.out.println("""
      ..................Call duration..................
      1. Last call duration 
      2. All calls’ duration 
      3. Received calls’ duration 
      4. Dialed calls’ duration 
      5. Clear timer
      .........................................
      """);
      System.out.println("Select one: ");
      int callDuration = input.nextInt();
      switch (callDuration){
      case 1:
      System.out.println("Your Last call duration ");
      break;
      case 2:
      System.out.println("All your calls’ duration ");
      break;
      case 3:
      System.out.println("Your Received calls’ duration  ");
      break;
      case 4:
      System.out.println("Your Dialed calls’ duration  ");
      break;
      case 5:
      System.out.println("Timer Cleared ");
      break;
      }
      break;
    
    case 6:
    System.out.println("""
      ..................Show call costs..................
      1. Last call cost 
      2. All calls’ cost 
      3. Clear counters
      ..................................................
      """);
      System.out.println("Select one: ");
      int callCost = input.nextInt();
      switch (callCost){
      case 1:
      System.out.println("Your Last call cost... ");
      break;
      case 2:
      System.out.println("All calls’ cost...");
      break;
      case 3:
      System.out.println("Counters Cleared  ");
      break;
      }
    break;
    
    case 7:
    System.out.println("""
      ..................Call cost settings..................
      1. Call cost limit 
      2. Show costs in
      ......................................................
      """);
      System.out.println("Select one: ");
      int callCostSetting = input.nextInt();
      switch (callCostSetting){
      case 1:
      System.out.println("Your Call cost limit is... ");
      break;
      case 2:
      System.out.println("Show costs in Naira ");
      break;
      }
    break;
    
    case 8:
    System.out.println("Your Prepaid Credit Details ");
    break;
    }
    break;
  
  

  case 5:
  System.out.println("""
  .......................Tones Menu..............
  1. Ringing tone 
  2. Ringing volume 
  3. Incoming call alert 
  4. Message alert tone 
  5. Keypad tones
  6. Warning tones 
  7. Vibrating alert 
  8. Screen saver
  ...................................................
  """);
  System.out.println("Select one: ");
  int toneOption = input.nextInt();
  switch (toneOption) {
    case 1:
    System.out.println("Playing Ringing tone");
    break;
    case 2:
    System.out.println("Ringing volume:5 ");
    break;
    case 3:
    System.out.println("Incoming call alert...");
    break;
    case 4:
    System.out.println("Message alert tone: Tone 5 ");
    break;
    case 5:
    System.out.println("Keypad tone: Tone 3 ");
    break;
    case 6:
    System.out.println("Playing Warning tone ");
    break;
    case 7:
    System.out.println("Vibrating alert");
    break;
    case 8:
    System.out.println("Screen saver");
    break;
    }
   break;
  
  
  
  case 6:
  System.out.println("""
  .......................Settings Menu..............
  1. Call settings 
  2. Phone settings 
  3. Security settings 
  4. Restore factory settings 
  ...................................................
  """);
  System.out.println("Select one: ");
  int generalSettingOption = input.nextInt();
  switch (generalSettingOption) {
    case 1:
    System.out.println("""
  .......................Call Settings Menu..............
  1. Automatic redial 
  2. Speed dialing 
  3. Call waiting options 
  4. Own number sending 
  5. Phone line in use 
  6. Automatic answer 
  ...................................................
  """);
  System.out.println("Select one: ");
  int callSettingMenu = input.nextInt();
  switch (callSettingMenu) {

    case 1:
    System.out.println("Redialing...");
    break;
    case 2:
    System.out.println("Dailing...");
    break;
    case 3:
    System.out.println("Abort call");
    System.out.println("H-free");
    System.out.println("H-held");
    break;
    case 4:
    System.out.println("Own number sending...");
    break;
    case 5:
    System.out.println("Phone line in use!");
    break;
    case 6:
    System.out.println("Answering...");
    break;
    }
    break;
    
    case 2:
  System.out.println("""
  .......................Phone Settings Menu..............
  1. Language 
  2. Cell info display 
  3. Welcome note 
  4. Network selection 
  5. Confirm SIM service actions
  ...................................................
  """);
  System.out.println("Select one: ");
  int phoneSettingOption = input.nextInt();
  switch (phoneSettingOption) {
    case 1:
    System.out.println("English Language");
    break;
    case 2:
    System.out.println("Cell information");
    break;
    case 3:
    System.out.println("Welcome!");
    break;
    case 4:
    System.out.println(" MTN NG ");
    break;
    case 5:
    System.out.println("SIM service actions confirmed"); 
    break;
    }
    break;
    
    case 3:
    System.out.println("""
  .......................Security Settings Menu..............
 1. PIN code request 
 2. Call barring service 
 3. Fixed dialing 
 4. Closed user group 
 5. Security level 
 6. Change access codes
  ...................................................
  """);
  System.out.println("Select one: ");
  int securityOption = input.nextInt();
  switch (securityOption) {
    case 1:
    System.out.println("PIN code: 1234");
    break;
    case 2:
    System.out.println("Call barred ");
    break;
    case 3:
    System.out.println("Fixed dialing...");
    break;
    case 4:
    System.out.println("Closed user group");
    break;
    case 5:
    System.out.println("Security level: 100%");
    break;
    case 6:
    System.out.println("Access code changed");
    break;
    }
    break;
    
    case 4:
    System.out.println("Restoring factory settings...");
    break;
    }
  break;
  
  
  
  case 7:
  System.out.println("Diverting Call");
  break;
  
  
  case 8:
  System.out.println("""
  .......................Music Menu..............
  1. Music player 
  2. Radio 
  3. Recorder 
  4. Track list 
  ................................................
  """);
  System.out.println("Select one: ");
  int musicMenu = input.nextInt();
  switch (musicMenu) {
    case 1:
    System.out.println("Music player");
    break;
    case 2:
    System.out.println("Radio ");
    break;
    case 3:
    System.out.println("Recording in progress");
    break;
    case 4:
    System.out.println("Track list ");
    break;
    }
  break;
  
  
  
  case 9:
  System.out.println("Games");
  break;
    
    
    
  case 10:
  System.out.println("Calculator App");
  break;
  
  
  case 11:
  System.out.println("Reminders App");
  break;
  
  
  case 12:
  System.out.println("""
  .......................Clock Menu..............
 1. Alarm clock 
 2. Clock settings 
 3. Date setting 
 4. Stopwatch 
 5. Countdown timer 
 6. Auto update of date and time
  .................................................
  """);
  System.out.println("Select one: ");
  int clockMenu = input.nextInt();
  switch (clockMenu) {
    case 1:
    System.out.println("Alarm clock");
    break;
    case 2:
    System.out.println("Clock settings ");
    break;
    case 3:
    System.out.println("Set Date");
    break;
    case 4:
    System.out.println("Stopwatch");
    break;
    case 5:
    System.out.println("Countdown timer");
    break;
    case 6:
    System.out.println("Updating date and time");
    break;
    }
  break;
  
  
  
  case 13:
  System.out.println("Profiles");
  break;
  
  
  
  case 14:
  System.out.println("Services");
  break;
  
  
  
  case 15:
  System.out.println("SIM services 2");
  break;
  
}

}
}
