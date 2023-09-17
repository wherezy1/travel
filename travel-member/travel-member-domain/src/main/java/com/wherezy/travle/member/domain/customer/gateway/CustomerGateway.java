package com.wherezy.travle.member.domain.customer.gateway;

import com.wherezy.travle.member.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
