package com.wherezy.travle.coupon.domain.customer.gateway;

import com.wherezy.travle.coupon.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
