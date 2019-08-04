/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.buisness;

import lk.ijse.dinemore.buisness.custom.impl.OrderBOImpl;

/**
 *
 * @author User
 */
public class BOFactory {
    
    public enum BOTypes{
    
        ORDER
    }
    
    public static BOFactory  bOFactory;
    
    
    public BOFactory(){
    
    }
    
    public static BOFactory getInstance(){
        if (bOFactory == null) {
            bOFactory =  new BOFactory();
        }
        return bOFactory;
    
    }
    
    public SuperBO getBO(BOTypes bOType){
    switch(bOType){
    
        case ORDER:
            return (SuperBO) new OrderBOImpl();
            default:return null;
    }
    }
}
