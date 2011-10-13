package xcompany.structures.form;

//  @ File Name : Form.java

import java.util.HashMap;

//  @ Date : 11.10.2011




public abstract class Form 
{
    private HashMap<String, String> fields;
    public abstract void initializeFields();
    protected Form()
    {
        fields = new HashMap<String, String>();
        initializeFields();
    }
    public HashMap<String, String> getFields()
    {
        return fields;
    }
    public void setFields(HashMap<String, String> fields)
    {
        this.fields = fields;
    }
    @Override public String toString()
    {
        String str = getClass().getSimpleName() + "\n";
        for(String s : getFields().keySet())
            str += s + ":" + getFields().get(s) + "\n";
        return str;
    }
}
