package xcompany.structures;

//  @ File Name : Email.java

import java.io.Serializable;

//  @ Date : 11.10.2011




public class Email  implements Serializable
{
    private String from;
    private String to;
    private String subject;
    private String text;
    public Email()
    {
        this.from = "[email.from]";
        this.to = "[email.to]";
        this.subject = "[email.subject]";
        this.text = "[email.text]";
    }
    public Email(String from, String to, String subject, String text)
    {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }
    public String getFrom()
    {
        return from;
    }
    public void setFrom(String from)
    {
        this.from = from;
    }
    public String getTo()
    {
        return to;
    }
    public void setTo(String to)
    {
        this.to = to;
    }
    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    public String getText()
    {
        return text;
    }
    public void setText(String text)
    {
        this.text = text;
    }
    public void send()
    {
        System.out.println(this);
    }
    @Override public String toString()
    {
        return "From:"+getFrom()+"\nTo:"+getTo()+"\nSubject"+getSubject()+"\n"+getText();
    }
}
