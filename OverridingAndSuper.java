/* Problem Statement:
Objective: To understand the concept of method overriding and super keyword.

 

Problem Description: A college cultural event "Show Your talent" is being conducted and the organizing committee has decided to come up with online registration for the same. Initially, the registration fee for single and team events was the same, but later the organizing committee decided to calculate the registration fee based on the number of participants.

The students can participate in single events as well as team events. The portal displays the team number for a team and the participant number for a participant.

Create a Java Project with the name OverridingAndSuper Implement the class EventRegistration, SingleEventRegistration, and TeamEventRegistration.

 

Class Description:

EventRegistration:

This is the parent class for SingleEventRegistration and TeamEventRegistration classes. It sets the name, name of the event, and registration fee.

 

ex33.1
Methods Description:

registerEvent(): In the class EventRegistration it displays the registration fee based on the event for which the participant is going to register.
 

Events	Base Fee
ShakeALeg	100
Sing&Win	150
Actathon	70
PlayAway	130
SingleEventRegistration:

This class is used to register the participants for Singles Events.

 

ex33.3
Method Description:

registerEvent(): In class SingleEventRegistration this method calculates the registration fee and displays the participant number. The single event registration is only for three events given in the table below:
 

Events	Base Fee
ShakeALeg	100
Sing&Win	150
PlayAway	130
TeamEventRegistration:

This class is used to register participants for Team Events.

ex33.5
Method Description:

registerEvent(): In class TeamEventRegistration the registrationFee is calculated based on the number of participants:
registrationFee = baseFee x noOfParticipants

This method also displays the team number. The base fee for the events per participants is shown below-

Events	Base Fee
ShakeALeg	50
Sing&Win	60
Actathon	80
PlayAway	100
Create a class ShowYourTalentRegistration and implement the main method as given below:

 
public class ShowYourTalentRegistration{
   public static void main(String[] args){
      //TO-DO :Create an instance of SingleEventRegistration with reference of EventRegistration
      //as participant1, and initialize the same with values given
      //TO-DO :Invoke the method registerEvent using participant1
      //TO-DO :Create an instance of TeamEventRegistration with reference of EventRegistration
      //as team1, and initialize the same with values given
      //TO-DO :Invoke the method registerEvent using team1
      //TO-DO :Create an instance of SingleEventRegistration with reference of EventRegistration
      //as participant2, and initialize the same with values given
      //TO-DO :Invoke the method registerEvent using participant2
    }
}
 

Initialize the instances of SingleEventRegistration and TeamEventRegistration with the values given:

Inputs (For SingleEventRegistration):

Attributes	Values
name	Jenny
nameOfEvent	Sing&Win
participantNo	1 
Attributes	Values
name	Hudson
nameOfEvent	PlayAway
participantNo	2
Input (For TeamEventRegistration):

Attributes	Values
name	Aura
nameOfEvent	ShakeALeg
teamNo	1
noOfParticipants	5 */






import java.util.*;
public class OverridingAndSuper
{
    
        public static class EventRegistration
        {
            String name;
            String nameOfEvent;
            double registrationFee;

            EventRegistration(String name, String nameOfEvent)
            {
                this.name = name;
                this.nameOfEvent = nameOfEvent;
            }
            void setregitrationFee(double registrationFee)
            {
                this.registrationFee = registrationFee;
            }
            String getname()
            {
                return name;
            }
            String getnameOfEvent()
            {
                return nameOfEvent;
            }
            double getregitrationFee()
            {
                return registrationFee;
            }
            void registerEvent()
            {
                System.out.println(" Events	Base Fee \n ShakeALeg	100\n Sing&Win	150\n Actathon	70\n PlayAway	130");
            }
        }
        public static class SingleEventRegistration extends EventRegistration
        {
            int participantNo = 0;

            int getParticipantNo()
            {
                participantNo = participantNo + 1;
                return participantNo;
            }

            SingleEventRegistration(String name, String nameOfEvent)
            {
                super(name, nameOfEvent);
            }            
            void registerEvent()
            { 
                if(super.getnameOfEvent() == "ShakeALeg")
                {
                    System.out.println("Thank You " + super.getname() + " for your participation.Your registration fee is : 100");
                    System.out.println("You are participant no : " + getParticipantNo());
                }
                else if(super.getnameOfEvent() == "Sing&Win")
                {
                    System.out.println("Thank You " + super.getname() + " for your participation.Your registration fee is : 150");
                    System.out.println("You are participant no : " + getParticipantNo());
                }
                else if(super.getnameOfEvent() == "PlayAway")
                {
                    System.out.println("Thank You " + super.getname() + " for your participation.Your registration fee is : 150");
                    System.out.println("You are participant no : " + getParticipantNo());
                }
                else
                {
                    System.out.println("Choose Vaild Event");
                }
            }
        }
        public static class TeamEventRegistration extends EventRegistration
        {
            int participantNo = 0;

            int getParticipantNo()
            {
                participantNo = participantNo + 1;
                return participantNo;
            }

            int noOfParticipants;
            int teamNo;
            TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo)
            {
                super(name, nameOfEvent);
                this.noOfParticipants = noOfParticipants;
                this.teamNo = teamNo;
            }
            int getNoOfParticipants()
            {
                return noOfParticipants;
            }
            int getTeamNo()
            {
                return teamNo;
            }
            void registerEvent()
            {
                if(super.getnameOfEvent() == "ShakeALeg")
                {
                    System.out.println("Thank You " + super.getname() + " for your participation.Your registration fee is : " + getNoOfParticipants() * 50);
                    System.out.println("You are participant no : " + getParticipantNo());
                }
                else if(super.getnameOfEvent() == "Sing&Win")
                {
                    System.out.println("Thank You " + super.getname() + " for your participation.Your registration fee is : " + getNoOfParticipants() * 60);
                    System.out.println("You are participant no : " + getParticipantNo());
                }
                else if(super.getnameOfEvent() == "Actathon")
                {
                    System.out.println("Thank You " + super.getname() + " for your participation.Your registration fee is : " + getNoOfParticipants() * 80);
                    System.out.println("You are participant no : " + getParticipantNo());
                }
                else if(super.getnameOfEvent() == "PlayAway")
                {
                    System.out.println("Thank You " + super.getname() + " for your participation.Your registration fee is : "  + getNoOfParticipants() * 100);
                    System.out.println("You are participant no : " + getParticipantNo());
                }
                else
                {
                    System.out.println("Choose Vaild Event");
                }
            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int i = 1;
            while(i != 0)
            {
                System.out.println("Enter 1 for Single Participant and Enter 2 for Team Participants");
                int de = sc.nextInt();
                sc.nextLine();
                if (de == 1) 
                {
                    System.out.println("Event No\tEvent Name\tEvent Fee");
                    System.out.println("1\tShakeALeg\t100");
                    System.out.println("2\tSing&Win\t150");
                    System.out.println("3\tPlayAway\t130");
                    System.out.println("Enter the Event Number You want to Participate : ");
                    int ev = sc.nextInt();
                    sc.nextLine();
                    String eventName = "";
                    if (ev == 1) 
                    {
                        eventName = "ShakeALeg";
                    } else if (ev == 2) 
                    {
                        eventName = "Sing&Win";
                    } else if (ev == 3) 
                    {
                        eventName = "PlayAway";
                    } else 
                    {
                        System.out.println("Invalid Event Number");
                        return;
                    }
        
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();
                    SingleEventRegistration q = new SingleEventRegistration(name, eventName);
                    q.registerEvent();

                }
                else if (de == 2)
                {
                    System.out.println("Event No\tEvent Name\tEach Participant Fee");
                    System.out.println("1\tShakeALeg\t50");
                    System.out.println("2\tSing&Win\t60");
                    System.out.println("3\tActathon\t80");
                    System.out.println("4\tPlayAway\t100");
                    System.out.println("Enter the Event Number You want to Participate: ");
                    int ev = sc.nextInt();
                    sc.nextLine();
                    String eventName = "";
                    if (ev == 1) 
                    {
                        eventName = "ShakeALeg";
                    } 
                    else if (ev == 2) 
                    {
                        eventName = "Sing&Win";
                    } 
                    else if (ev == 3) 
                    {
                        eventName = "Actathon";
                    } 
                    else if (ev == 4) 
                    {
                        eventName = "PlayAway";
                    } 
                    else 
                    {
                        System.out.println("Invalid Event Number");
                        return;
                    }
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter your team's number : ");
                    int tN = sc.nextInt();
                    System.out.println("Enter number of participant : ");
                    int NoOfP = sc.nextInt();
                    TeamEventRegistration w = new TeamEventRegistration(name, eventName, tN, NoOfP);
                    w.registerEvent();             
                }
                 else 
                {
                    System.out.println("Enter Valid Input");
                }
                System.out.println("Do you want to register another participant? (Y/N)");
                String dev  = sc.nextLine();
                i = dev.equals("N") ? 0 : 1; 
            }
            sc.close();
        }
}








// Please analyze the following Java code for both logic and syntax errors. Provide feedback on each line and word, highlighting any issues you find. If there are no errors, please confirm that the code is correct.