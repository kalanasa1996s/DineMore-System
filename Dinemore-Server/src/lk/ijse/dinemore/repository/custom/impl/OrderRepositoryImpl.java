/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.repository.custom.impl;

import java.util.List;
import lk.ijse.dinemore.entity.Orders;
import lk.ijse.dinemore.repository.custom.OrderRepository;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class OrderRepositoryImpl implements OrderRepository{
    
    private Session session;

    @Override
    public void setSesstion(Session session) {
        this.session =session;
    }

    @Override
    public boolean save(Orders t) throws Exception {
        return (session.save(t) !=null);
      
    }

    @Override
    public boolean delete(Orders t) throws Exception {
        session.delete(t);
        return false;
    }

    @Override
    public boolean update(Orders t) throws Exception {
        session.update(t);
        return false;
    }

    @Override
    public Orders findByID(String id) throws Exception {
        return session.get(Orders.class, id);
    }

    @Override
    public List<Orders> findAll() throws Exception {
         return session.createQuery("FROM Orders").list();
    }
}
