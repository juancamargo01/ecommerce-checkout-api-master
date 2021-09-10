package com.juancamargo.ecommerce.checkout.service;

import com.juancamargo.ecommerce.checkout.entity.CheckoutEntity;
import com.juancamargo.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
