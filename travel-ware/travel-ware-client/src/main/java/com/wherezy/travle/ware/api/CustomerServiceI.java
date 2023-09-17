package com.wherezy.travle.ware.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.ware.dto.CustomerAddCmd;
import com.wherezy.travle.ware.dto.CustomerListByNameQry;
import com.wherezy.travle.ware.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
