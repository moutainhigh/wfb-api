/**
 * Copyright (c) 2018 仙宝框架 All rights reserved.
 * <p>
 * https://www.ruitukeji.com
 * <p>
 * 版权所有，侵权必究！
 */

package shop.xianbao.modules.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import shop.xianbao.common.dto.XianbaoBaseDTO;

import java.util.Date;

/**
 * 邮件发送记录
 *
 * @author Tim tim@ruitukeji.com
 */
@Data
@ApiModel(value = "邮件发送记录")
public class SysMailLogDTO extends XianbaoBaseDTO {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "邮件模板ID")
    private Long templateId;

    @ApiModelProperty(value = "发送者")
    private String mailFrom;

    @ApiModelProperty(value = "收件人")
    private String mailTo;

    @ApiModelProperty(value = "抄送者")
    private String mailCc;

    @ApiModelProperty(value = "邮件主题")
    private String subject;

    @ApiModelProperty(value = "邮件正文")
    private String content;

    @ApiModelProperty(value = "发送状态  0：失败  1：成功")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date createDate;

}