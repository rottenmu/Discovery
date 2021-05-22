package com.nepxion.discovery.console.resource;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.List;
import java.util.Map;

import org.springframework.cloud.client.ServiceInstance;

import com.nepxion.discovery.common.entity.InstanceEntity;
import com.nepxion.discovery.console.entity.GatewayType;

public interface ServiceResource {
    String getDiscoveryType();

    List<String> getGroups();

    String getGroup(String serviceId);

    List<String> getServices();

    List<String> getGateways();

    List<String> getGatewayList(GatewayType gatewayType);

    List<ServiceInstance> getInstances(String serviceId);

    List<InstanceEntity> getInstanceList(String serviceId);

    Map<String, List<InstanceEntity>> getInstanceMap(List<String> groups);
}