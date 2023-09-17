package com.wherezy.travle.product.domain.customer.gateway;

import com.wherezy.travle.product.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
