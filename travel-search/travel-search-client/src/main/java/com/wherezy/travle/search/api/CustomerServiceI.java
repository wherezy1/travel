package com.wherezy.travle.search.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.search.dto.CustomerAddCmd;
import com.wherezy.travle.search.dto.CustomerListByNameQry;
import com.wherezy.travle.search.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
