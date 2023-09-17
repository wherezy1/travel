package com.wherezy.travle.cart.domain.customer.gateway;

import com.wherezy.travle.cart.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
