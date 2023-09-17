package com.wherezy.travle.cart.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.cart.dto.CustomerAddCmd;
import com.wherezy.travle.cart.dto.CustomerListByNameQry;
import com.wherezy.travle.cart.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
