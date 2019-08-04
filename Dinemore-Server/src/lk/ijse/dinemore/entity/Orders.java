/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */

@Entity
public class Orders {
    
     @Id
    private String order_id;
    private String reception_id;
    private String date;
    private String time;
    private String cus_name;
    private String tp_no;
    private int qty;
    private String status;

    public Orders() {
    }

    public Orders(String order_id, String reception_id, String date, String time, String cus_name, String tp_no, int qty, String status) {
        this.order_id = order_id;
        this.reception_id = reception_id;
        this.date = date;
        this.time = time;
        this.cus_name = cus_name;
        this.tp_no = tp_no;
        this.qty = qty;
        this.status = status;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getReception_id() {
        return reception_id;
    }

    public void setReception_id(String reception_id) {
        this.reception_id = reception_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getTp_no() {
        return tp_no;
    }

    public void setTp_no(String tp_no) {
        this.tp_no = tp_no;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
