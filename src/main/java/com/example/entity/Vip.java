package com.example.entity;

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
    public class Vip implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * id
     */
      private String id;

      /**
     * 姓名
     */
      private String name;

      /**
     * 会员id
     */
      @TableField("vipID")
    private String vipID;

      /**
     * 密码
     */
      private String password;

      /**
     * 电话
     */
      private String phone;

      /**
     * 会员期限
     */
      @TableField("dateLine")
    private String dateLine;


}
