package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: pcc
 * @Date: 2022/5/31 19:35
 * @Description:
 */
@ConfigurationProperties(prefix = "sentinel.nacos")
public class NacosPropertiesConfiguration {

    private String serverAddr;

    private String dataId;

    private String groupId = "SENTINEL_GROUP";

    // 默认分组
    private String namespace;

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
