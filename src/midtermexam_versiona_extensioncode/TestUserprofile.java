/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scan.nextLine().trim();
        
        System.out.println("Enter genre: \"Comedy\", \"Drama\", \"Action\", \"Mystery\"");
        String genre = scan.next().trim();
        
        UserProfile user = new UserProfile(name, genre);
        System.out.println("User Created.");
    }
}
