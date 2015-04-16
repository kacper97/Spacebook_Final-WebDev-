package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class PublicProfile extends Controller
{
  public static void index()
  {
    render();
  }
  
  public static void visit(Long id)
  {
    User user = User.findById(id);
    Logger.info("Just visiting the page for " + user.firstName + ' ' + user.lastName );
    render(user);
  }  
}