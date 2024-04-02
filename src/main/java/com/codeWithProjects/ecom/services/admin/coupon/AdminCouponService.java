package com.codeWithProjects.ecom.services.admin.coupon;

import com.codeWithProjects.ecom.entity.Coupon;

import java.util.List;

public interface AdminCouponService {

    Coupon createCoupon(Coupon coupon);

    List<Coupon> getAllCoupons();
}
