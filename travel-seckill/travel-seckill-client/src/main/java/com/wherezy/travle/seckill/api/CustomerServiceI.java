package com.wherezy.travle.seckill.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.seckill.dto.CustomerAddCmd;
import com.wherezy.travle.seckill.dto.CustomerListByNameQry;
import com.wherezy.travle.seckill.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
