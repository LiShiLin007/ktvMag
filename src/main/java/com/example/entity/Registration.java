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
    public class Registration implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 包间
     */
      private Integer id;

      /**
     * 时长
     */
      private Integer useTime;

      /**
     * 用户
     */
      private String userName;

    private String phone;

    private String area;

      /**
     * 费用
     */
      private Float cost;


}
