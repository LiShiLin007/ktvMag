package com.example.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2021-11-30
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Drink implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 饮料id
     */
      private Integer id;

      /**
     * 饮料名称
     */
      private String name;

      /**
     * 单价
     */
      private Float price;

      /**
     * 数量
     */
      private Integer nums;

      /**
     * 饮料图片
     */
      private String icon;


}
