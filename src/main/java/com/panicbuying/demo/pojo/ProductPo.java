package com.panicbuying.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**** imports ****/
// MyBatis别名定义
@TableName("t_product")
public class ProductPo implements Serializable {
    private static final long serialVersionUID = 3288311147760635602L;
   @TableId(type = IdType.AUTO)
    private Long id;
    private String productName;
    private int stock;
    private double price;
    private int version;
    private String note;
    /**** setter and getter ****/
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
