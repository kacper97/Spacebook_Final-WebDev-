package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Accounts extends Controller
{
  public static void signup()
  {
    render();
  }

  public static void login()
  {
    render();
  }

  public static void logout()
  {
    index();
  }

  public static void index()
  {
    render();
  }
}