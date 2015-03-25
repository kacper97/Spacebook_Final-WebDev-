package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Home extends Controller
{
  public static void index()
  {
    String userId = session.get("logged_in_userid");
    User user = User.findById(Long.parseLong(userId));
    render(user);
  }
}