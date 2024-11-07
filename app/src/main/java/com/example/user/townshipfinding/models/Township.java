package com.example.user.townshipfinding.models;

public class Township
{
    private String LocMMName;

    private String locAreaCode;

    private String location;

    private String locENGName;

    private String locState;

    private String locID;

    public String getLocMMName ()
    {
        return LocMMName;
    }

    public void setLocMMName (String LocMMName)
    {
        this.LocMMName = LocMMName;
    }

    public String getLocAreaCode ()
    {
        return locAreaCode;
    }

    public void setLocAreaCode (String locAreaCode)
    {
        this.locAreaCode = locAreaCode;
    }

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public String getLocENGName ()
    {
        return locENGName;
    }

    public void setLocENGName (String locENGName)
    {
        this.locENGName = locENGName;
    }

    public String getLocState ()
    {
        return locState;
    }

    public void setLocState (String locState)
    {
        this.locState = locState;
    }

    public String getLocID ()
    {
        return locID;
    }

    public void setLocID (String locID)
    {
        this.locID = locID;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [LocMMName = "+LocMMName+", locAreaCode = "+locAreaCode+", location = "+location+", locENGName = "+locENGName+", locState = "+locState+", locID = "+locID+"]";
    }
}
			
			