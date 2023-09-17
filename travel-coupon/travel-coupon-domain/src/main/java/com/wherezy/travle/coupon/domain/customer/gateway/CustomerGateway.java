package com.wherezy.travle.coupon.domain.customer.gateway;

import com.wherezy.travle.coupon.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
