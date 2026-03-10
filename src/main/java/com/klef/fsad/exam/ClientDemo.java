package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo
{
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // Insert Record
        Inventory inv = new Inventory(
                "Laptop",
                "Dell Laptop",
                "10-03-2026",
                "Available"
        );

        session.save(inv);

        tx.commit();

        System.out.println("Record Inserted Successfully");

        // Delete Record
        Transaction tx2 = session.beginTransaction();

        Inventory obj = session.get(Inventory.class, 1);

        if(obj != null)
        {
            session.delete(obj);
            System.out.println("Record Deleted");
        }
        else
        {
            System.out.println("Record Not Found");
        }

        tx2.commit();

        session.close();
        sf.close();
    }
}
