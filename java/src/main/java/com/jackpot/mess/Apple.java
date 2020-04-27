package com.jackpot.mess;



import java.math.BigDecimal;

/**
 * @Author: Hanjt
 * @Date: 2018/7/18 15:32
 * @Description:
 */

public class Apple {
    private Integer id;
    private String name;
    private BigDecimal money;
    private Integer num;

    public Apple(Integer id, String name, BigDecimal money, Integer num) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public Integer getNum() {
        return num;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
