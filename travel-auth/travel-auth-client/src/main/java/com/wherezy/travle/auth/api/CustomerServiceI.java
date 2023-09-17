package com.wherezy.travle.auth.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.auth.dto.CustomerAddCmd;
import com.wherezy.travle.auth.dto.CustomerListByNameQry;
import com.wherezy.travle.auth.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
