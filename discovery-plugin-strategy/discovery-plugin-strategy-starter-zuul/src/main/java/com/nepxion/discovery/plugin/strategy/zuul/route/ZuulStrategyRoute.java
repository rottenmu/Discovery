package com.nepxion.discovery.plugin.strategy.zuul.route;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Ning Zhang
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.List;

import com.nepxion.discovery.plugin.strategy.zuul.entity.ZuulStrategyRouteEntity;

public interface ZuulStrategyRoute {
    void add(ZuulStrategyRouteEntity zuulStrategyRouteEntity);

    void modify(ZuulStrategyRouteEntity zuulStrategyRouteEntity);

    void delete(String routeId);

    void updateAll(List<ZuulStrategyRouteEntity> zuulStrategyRouteEntityList);

    void updateAll(String zuulStrategyRouteConfig);

    ZuulStrategyRouteEntity view(String routeId);

    List<ZuulStrategyRouteEntity> viewAll();
}