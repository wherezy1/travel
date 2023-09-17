package com.wherezy.travle.article.domain.customer.gateway;

import com.wherezy.travle.article.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
