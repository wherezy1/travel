package com.wherezy.travle.domain.customer.gateway;

import com.wherezy.travle.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
