package com.wherezy.travle.seckill.domain.customer.gateway;

import com.wherezy.travle.seckill.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
