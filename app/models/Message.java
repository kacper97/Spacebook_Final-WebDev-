package models;

import javax.persistence.*;
import play.db.jpa.*;

@Entity
public class Message extends Model
{
  public String messageText;
  
  public String messageSubject;
  @ManyToOne
  public User from;

  @ManyToOne
  public User to;

  public Message(User from, User to, String messageSubject, String messageText)
  {
    this.from = from;
    this.to = to;
    this.messageSubject = messageSubject;
    this.messageText = messageText;
  }
}