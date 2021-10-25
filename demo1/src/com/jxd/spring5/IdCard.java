package com.jxd.spring5;

/**
 * @author jxd
 * @date 2021/10/25 9:06
 */
public class IdCard {
    private Integer idNumber;
    private String date;

    public IdCard(Integer idNumber, String date) {
        this.idNumber = idNumber;
        this.date = date;
    }

    public IdCard() {
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
