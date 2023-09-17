package com.wherezy.travle.domain.customer.gateway;

import com.wherezy.travle.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
