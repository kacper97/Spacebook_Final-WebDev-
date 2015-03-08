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
  
  public static void visit(String name)
  {
    Logger.info("Just visiting the page for " + name);
    render(name);
  }  

}