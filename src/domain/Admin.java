/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author DELL
 */
public class Admin implements Ilogin{
    private int id;
    private String user_name,password;
    public Admin(int id, String name, String password) {
        this.id = id;
        this.user_name = name;
        this.password = password;
    }

    public Admin() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return user_name;
    }

    public void setName(String name) {
        this.user_name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public boolean login(String userName, String Pass) {

        return userName.equals("Admin@yahoo.com") && Pass.equals("12345678");

    }

    
    
    
}
