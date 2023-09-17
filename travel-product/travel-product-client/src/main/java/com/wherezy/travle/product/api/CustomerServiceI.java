package com.wherezy.travle.product.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.product.dto.CustomerAddCmd;
import com.wherezy.travle.product.dto.CustomerListByNameQry;
import com.wherezy.travle.product.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
