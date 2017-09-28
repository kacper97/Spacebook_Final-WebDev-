package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Members extends Controller
{
  public static void index(Long id)
  {
    List<User> users = User.findAll();
    String userId = session.get("logged_in_userid");
    User current = User.findById(Long.parseLong(userId));
    users.remove(current);
    render(users);
  }
  
  public static void follow(Long id)
  {
    User friend = User.findById(id);
    
    String userId = session.get("logged_in_userid");
    User me = User.findById(Long.parseLong(userId));
    
    me.befriend(friend);
    Home.index();
  }
}