package com.klef.fsad.exam;

import javax.persistence.*;

@Entity
@Table(name="inventory")
public class Inventory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String date;
    private String status;

    public Inventory()
    {
        
    }

    public Inventory(String name, String description, String date, String status)
    {
        this.name = name;
        this.description = description;
        this.date = date;
        this.status = status;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
