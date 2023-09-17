package com.wherezy.travle.coupon.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wherezy.travle.coupon.dto.CustomerAddCmd;
import com.wherezy.travle.coupon.dto.CustomerListByNameQry;
import com.wherezy.travle.coupon.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
