package com.wherezy.travle.ware.domain.customer.gateway;

import com.wherezy.travle.ware.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
