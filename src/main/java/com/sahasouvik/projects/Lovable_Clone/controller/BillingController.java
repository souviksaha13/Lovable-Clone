package com.sahasouvik.projects.Lovable_Clone.controller;

import com.sahasouvik.projects.Lovable_Clone.dto.subscription.CheckoutRequest;
import com.sahasouvik.projects.Lovable_Clone.dto.subscription.CheckoutResponse;
import com.sahasouvik.projects.Lovable_Clone.dto.subscription.PlanResponse;
import com.sahasouvik.projects.Lovable_Clone.dto.subscription.SubscriptionResponse;
import com.sahasouvik.projects.Lovable_Clone.service.PlanService;
import com.sahasouvik.projects.Lovable_Clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillingController {
    private final PlanService planService;
    private final SubscriptionService subscriptionService;

    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans() {
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription() {
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription(userId));
    }

    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest request
            ) {
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(request, userId));
    }
}
