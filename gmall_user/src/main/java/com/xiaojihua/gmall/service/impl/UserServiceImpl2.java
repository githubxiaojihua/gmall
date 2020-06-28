package com.xiaojihua.gmall.service.impl;

import com.xiaojihua.gmall.bean.UserAddress;
import com.xiaojihua.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * 实现UserService，模拟DAO返回数据
 */
public class UserServiceImpl2 implements UserService {

    /**
     * 返回地址列表
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....new...");
        // TODO Auto-generated method stub
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        return Arrays.asList(address1,address2);
    }
}
