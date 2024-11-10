package com.javapandeng.service.impl;

import com.javapandeng.base.BaseDao;
import com.javapandeng.base.BaseServiceImpl;
import com.javapandeng.mapper.AddressMapper;
import com.javapandeng.po.Address;
import com.javapandeng.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends BaseServiceImpl<Address> implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public BaseDao<Address> getBaseDao() {
        return addressMapper;
    }
}
