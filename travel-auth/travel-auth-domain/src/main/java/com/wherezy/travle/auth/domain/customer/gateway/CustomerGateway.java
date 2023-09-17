package com.wherezy.travle.auth.domain.customer.gateway;

import com.wherezy.travle.auth.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
