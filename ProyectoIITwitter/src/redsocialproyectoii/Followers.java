/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocialproyectoii;

/**
 *
 * @author user
 */
public class Followers {
    private String[] usernames;
    private int numFollowers;
    
        public Followers(int maxFollowers) {
        usernames = new String[maxFollowers];
        numFollowers = 0;
        }
        
        
         public boolean agregarFollower(String username) {
        for (int i = 0; i < numFollowers; i++) {
            if (usernames[i].equals(username)) {
                return false; 
            }
        }
        if (numFollowers < usernames.length) {
            usernames[numFollowers++] = username;
            return true;
        }
        return false; 
    }
         
       public boolean eliminarFollower(String username) {
        for (int i = 0; i < numFollowers; i++) {
            if (usernames[i].equals(username)) {
                for (int j = i; j < numFollowers - 1; j++) {
                    usernames[j] = usernames[j + 1];
                }
                usernames[--numFollowers] = null; 
                return true; 
            }
        }
        return false; 
    }   
       
       
         public String[] getFollowers() {
        return usernames;
    }

    public int getNumFollowers() {
        return numFollowers;
    }
}
