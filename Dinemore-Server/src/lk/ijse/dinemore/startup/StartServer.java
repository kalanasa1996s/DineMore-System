/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.startup;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.dinemore.service.impl.ServiceFactoryImpl;

/**
 *
 * @author User
 */
public class StartServer {
    
 
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(2025);
            registry.rebind("POS", ServiceFactoryImpl.getInstance());
            System.out.println("Server Has Been Strated Successfully");
        } catch (Exception ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    
    }

