/**
 * Copyright (c) 2018 仙宝框架 All rights reserved.
 * <p>
 * https://www.ruitukeji.com
 * <p>
 * 版权所有，侵权必究！
 */

package shop.xianbao.modules.sys.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import shop.xianbao.common.dto.XianbaoBaseDTO;

import java.math.BigDecimal;

/**
 * 系统数据
 *
 * @author Tim tim@ruitukeji.com
 * @since 1.0.0
 */
@Data
@ApiModel(value = "系统数据")
public class SystemDTO extends XianbaoBaseDTO {
    private static final long serialVersionUID = 1L;

    private Long sysTime;

    private String osName;

    private String osArch;

    private String osVersion;

    private String userLanguage;

    private String userDir;

    private Long totalPhysical;

    private Long freePhysical;

    private BigDecimal memoryRate;

    private Integer processors;

    private String jvmName;

    private String javaVersion;

    private String javaHome;

    private Long javaTotalMemory;

    private Long javaFreeMemory;

    private Long javaMaxMemory;

    private String userName;

    private BigDecimal systemCpuLoad;

    private String userTimezone;

}
