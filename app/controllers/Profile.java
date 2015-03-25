package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Profile extends Controller
{
  public static void index()
  {
    render();
  }
  
  public static void changeStatus(String profiletext)
  {
    Logger.info("Status changed to " + profiletext);
    index();
  }  
}