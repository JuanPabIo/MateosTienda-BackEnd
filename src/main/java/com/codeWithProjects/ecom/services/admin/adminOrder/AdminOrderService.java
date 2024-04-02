package com.codeWithProjects.ecom.services.admin.adminOrder;

import com.codeWithProjects.ecom.dto.AnalyticsResponse;
import com.codeWithProjects.ecom.dto.OrderDto;

import java.util.List;

public interface AdminOrderService {

    List<OrderDto> getAllPlacedOrders();

    OrderDto changeOrderStatus(Long orderId, String status);

    AnalyticsResponse calculateAnalytics();
}
