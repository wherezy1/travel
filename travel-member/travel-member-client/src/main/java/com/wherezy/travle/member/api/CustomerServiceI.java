package com.wherezy.travle.member.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.member.dto.CustomerAddCmd;
import com.wherezy.travle.member.dto.CustomerListByNameQry;
import com.wherezy.travle.member.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
