package com.wherezy.travle.order.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.order.dto.CustomerAddCmd;
import com.wherezy.travle.order.dto.CustomerListByNameQry;
import com.wherezy.travle.order.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
