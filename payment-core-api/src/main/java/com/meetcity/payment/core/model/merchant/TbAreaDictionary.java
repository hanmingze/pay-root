package com.meetcity.payment.core.model.merchant;

import lombok.Data;

/*
使用lombok
 */
@Data
public class TbAreaDictionary {
    private Integer areaId;

    private String areaName;

    private Integer areaCode;

    private String upAreaName;

    private Integer upAreaOde;


}