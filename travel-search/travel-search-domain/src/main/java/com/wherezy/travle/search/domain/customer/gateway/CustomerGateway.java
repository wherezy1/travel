package com.wherezy.travle.search.domain.customer.gateway;

import com.wherezy.travle.search.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
