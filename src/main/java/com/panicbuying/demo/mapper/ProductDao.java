package com.panicbuying.demo.mapper;

import com.panicbuying.demo.pojo.ProductPo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**** imports ****/
@Mapper
public interface ProductDao {
    // 获取产品
   /* @Select("select id, product_name as productName,\n" +
            "\t\tstock, price, version, note from t_product\n" +
            "\t\twhere id=#{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "productName", column = "product_name"),
            @Result(property = "stock", column = "stock"),
            @Result(property = "price", column = "price"),
            @Result(property = "note", column = "note")
    })*/
    public ProductPo getProduct(Long id);

    //减库存，而@Param标明MyBatis参数传递给后台
    /*@Insert("update t_product set stock = stock - #{quantity},\n" +
            "\t\tversion = version +1\n" +
            "\t\twhere id = #{id}")*/
    public int decreaseProduct(@Param("id") Long id, @Param("quantity") int quantity);

//    public int decreaseProduct(@Param("id") Long id,
//    	    @Param("quantity") int quantity, @Param("version") int version);
}