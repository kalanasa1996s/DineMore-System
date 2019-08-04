/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.dinemore.buisness.custom.OrderBO;
import lk.ijse.dinemore.dto.OrderDTO;
import lk.ijse.dinemore.entity.Orders;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.OrderRepository;
import lk.ijse.dinemore.resource.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class OrderBOImpl implements OrderBO{
    
    private OrderRepository orderRepository;
    
    public OrderBOImpl(){
    
        orderRepository = (OrderRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ORDER);
    
    }

    @Override
    public boolean placeOrder(OrderDTO orderDTO) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        orderRepository.setSesstion(session);
        session.beginTransaction();
        Orders order = new Orders(
        
              orderDTO.getOrder_id(),
                    orderDTO.getReception_id(),
                    orderDTO.getDate(),
                    orderDTO.getTime(),
                    orderDTO.getCus_name(),
                    orderDTO.getTp_no(),
                    orderDTO.getQty(),
                    orderDTO.getStatus()
        );
         boolean result = orderRepository.save(order);
            session.getTransaction().commit();
        return result;
        
        
        
    }

    @Override
    public boolean deleteOrder(String oid) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderDTO searchOrder(String oid) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateStatus(OrderDTO orderDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OrderDTO> getAllOrder() throws Exception {
        
        Session session = HibernateUtil.getSessionFactory().openSession();{
    
        orderRepository.setSesstion(session);
        session.beginTransaction();
        List<Orders> orders =orderRepository.findAll();
        session.getTransaction().commit();
         if (orders != null) {
                System.out.println("Not Null");
                List<OrderDTO> alorder = new ArrayList<>();
                for (Orders order : orders) {
                    OrderDTO orderDTO = new OrderDTO(
                            order.getOrder_id(),
                            order.getReception_id(),
                            order.getDate(),
                            order.getTime(),
                            order.getCus_name(),
                            order.getTp_no(),
                            order.getQty(),
                            order.getStatus()
                    );
    
                     System.out.println("Hello :" + order.getOrder_id());
                    alorder.add(orderDTO);
    }
        return alorder; 
    }else{
             return null;
         }
    
}
    }  
}  
