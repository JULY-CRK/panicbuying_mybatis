package com.panicbuying.demo.mapper;

import com.panicbuying.demo.pojo.PurchaseRecordPo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**** imports ****/
//@Mapper
public interface PurchaseRecordDao {
   /* @Insert("insert into t_purchase_record(\n" +
            "\t\tuser_id, product_id, price, quantity, sum, purchase_date, note)\n" +
            "\t\tvalues(#{userId}, #{productId}, #{price}, #{quantity},\n" +
            "\t\t#{sum}, now(), #{note})")*/
    public int insertPurchaseRecord(PurchaseRecordPo pr);
}
