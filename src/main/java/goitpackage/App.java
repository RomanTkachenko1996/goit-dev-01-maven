package goitpackage;

import com.google.gson.GsonBuilder;
import goitpackage.dto.User;

public class App
{
    public static void main( String[] args ) {
        String name = new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(new User("Roman","Tkachenko"));
        System.out.println(name);
    }
}
