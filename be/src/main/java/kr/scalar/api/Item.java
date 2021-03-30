package kr.scalar.api;

import lombok.Data;

import javax.persistence.*;

@Entity @Table(name="items") @Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_no") long itemNo;
    @Column(name="item_name") String itemName;
    @Column(name="item_desc") String itemDesc;
    @Column(name="item_price") String itemPrice;

}
