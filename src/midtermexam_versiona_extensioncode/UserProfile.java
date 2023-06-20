

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 * 
 * 
 */



public class TestUserProfile 
{
    
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display available genres
        System.out.println("Available Genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter the number: ");
        int genreChoice = input.nextInt();
        input.nextLine(); // Consume the newline character
        
        // Validate genre choice
        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice.");
            return;
        }
        
        String favoriteGenre = genres[genreChoice - 1];
        
        // Create user profile
        UserProfile userProfile = new UserProfile(name, favoriteGenre);
        
        // Display success message
        System.out.println("User profile created");
        System.out.println("Name: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }
    
    
    
}//end class
