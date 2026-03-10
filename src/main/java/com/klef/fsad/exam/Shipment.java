package com.klef.fsad.exam;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="shipment")
public class Shipment 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date shipdate;

    private String status;

    private String source;

    private String destination;

    public Shipment() {}

    public Shipment(String name, Date shipdate, String status, String source, String destination) 
    {
        this.name = name;
        this.shipdate = shipdate;
        this.status = status;
        this.source = source;
        this.destination = destination;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public Date getShipdate() 
    {
        return shipdate;
    }

    public String getStatus() 
    {
        return status;
    }

    public String getSource() 
    {
        return source;
    }

    public String getDestination() 
    {
        return destination;
    }
}