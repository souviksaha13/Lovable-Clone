package com.sahasouvik.projects.Lovable_Clone.service;

import com.sahasouvik.projects.Lovable_Clone.dto.subscription.CheckoutRequest;
import com.sahasouvik.projects.Lovable_Clone.dto.subscription.CheckoutResponse;
import com.sahasouvik.projects.Lovable_Clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);
}
