package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
    public class Bill implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 包间编号
     */
      private Integer roomId;

      /**
     * 包间账单
     */
      private Float roomBill;

      /**
     * 付款状态
     */
      @TableField("isPay")
    private String isPay;


}
