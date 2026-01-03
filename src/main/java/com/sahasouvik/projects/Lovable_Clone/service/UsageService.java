package com.sahasouvik.projects.Lovable_Clone.service;

import com.sahasouvik.projects.Lovable_Clone.dto.subscription.PlanLimitsResponse;
import com.sahasouvik.projects.Lovable_Clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getSubscriptionLimitsOfUser(Long userId);
}
