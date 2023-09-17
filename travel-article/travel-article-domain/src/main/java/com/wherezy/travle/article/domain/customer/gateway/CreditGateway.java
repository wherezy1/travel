package com.wherezy.travle.article.domain.customer.gateway;

import com.wherezy.travle.article.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
