package com.wherezy.travle.order.domain.customer.gateway;

import com.wherezy.travle.order.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
