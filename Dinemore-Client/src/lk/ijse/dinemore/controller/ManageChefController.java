/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.controller;

import java.util.List;
import lk.ijse.dinemore.dto.OrderDTO;
import lk.ijse.dinemore.proxy.ProxyHandler;
import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.custom.OrderService;

/**
 *
 * @author User
 */
public class ManageChefController {
    
     public static boolean updateCustomer(OrderDTO orderDTO) throws Exception{
        OrderService orderService = (OrderService) ProxyHandler.getInstance()
                        .getService(ServiceFactory.ServiceType.ORDER);
        return orderService.updateStatus(orderDTO);
    }
     
     public static List<OrderDTO> getAllCustomers() throws Exception{
        OrderService orderService = (OrderService) ProxyHandler.getInstance()
                        .getService(ServiceFactory.ServiceType.ORDER);
        return orderService.getAllOrder();
    }
    
}
