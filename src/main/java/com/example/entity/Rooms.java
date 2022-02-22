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
    public class Rooms implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 包间编号
     */
      private Integer id;

      /**
     * 包间规格
     */
      private String specs;

      /**
     * 包间状态
     */
      private String status;

      /**
     * 区域
     */
      private String area;

      /**
     * 0-空，1-占
     */
      private Integer statusId;

      /**
     * 一小时价格
     */
      private Integer hourPrice;


}
