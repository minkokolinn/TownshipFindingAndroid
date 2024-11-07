package com.example.user.townshipfinding.models;

import com.example.user.townshipfinding.models.Township;

import java.util.List;

public class Data
{
    private List<Township> township;

    private String status;

    public List<Township> getTownship() {
        return township;
    }

    public void setTownship(List<Township> township) {
        this.township = township;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [township = "+township+", status = "+status+"]";
    }
}
			
			