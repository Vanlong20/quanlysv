/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asmjava3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class Userdao {
    List<User> ls = new ArrayList<>();

    public Userdao() {
        ls.add(new User("admin","1234", true) );
        ls.add(new User("Teo","1234", true) );
        ls.add(new User("Long","1234", true) );
        ls.add(new User("Khanh","1234", true) );
        ls.add(new User("Thanh","1234", true) );
        
    }
    public boolean Checklogin(String User, String Password){
        for (User us : ls) {
            if(us.getUser().equals(User) && us.getPassword().equals(Password)){
                return true;
            }
            
        }
        return false;
    }
    
}
