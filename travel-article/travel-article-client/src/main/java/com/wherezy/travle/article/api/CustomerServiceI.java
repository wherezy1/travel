package com.wherezy.travle.article.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.article.dto.CustomerAddCmd;
import com.wherezy.travle.article.dto.CustomerListByNameQry;
import com.wherezy.travle.article.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
