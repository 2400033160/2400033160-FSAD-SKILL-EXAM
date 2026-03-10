package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Date;

public class ClientDemo 
{
    public static void main(String[] args) 
    {

        SessionFactory sf = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        /* INSERT RECORD */

        Transaction tx = session.beginTransaction();

        Shipment s = new Shipment(
                "Electronics Shipment",
                new Date(),
                "Shipped",
                "Hyderabad",
                "Delhi"
        );

        session.save(s);

        tx.commit();

        System.out.println("Shipment Inserted Successfully");

        /* GET GENERATED ID */

        int id = s.getId();

        System.out.println("Inserted ID = " + id);

        /* DELETE USING HQL */

        Transaction tx2 = session.beginTransaction();

        Query q = session.createQuery(
                "delete from Shipment where id = :sid"
        );

        q.setParameter("sid", id);

        int result = q.executeUpdate();

        tx2.commit();

        System.out.println("Records Deleted = " + result);

        session.close();
        sf.close();
    }
}