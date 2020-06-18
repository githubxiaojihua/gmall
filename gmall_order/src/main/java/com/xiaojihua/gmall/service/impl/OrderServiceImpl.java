package com.xiaojihua.gmall.service.impl;

import com.xiaojihua.gmall.bean.UserAddress;
import com.xiaojihua.gmall.service.OrderService;
import com.xiaojihua.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 模拟订单服务实现类
 */
//注意这里使用的是spring的service注解
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    /**
     * 初始化订单，返回用户地址列表
     * @param userId
     * @return
     */
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
