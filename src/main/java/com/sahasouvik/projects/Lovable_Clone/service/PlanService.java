package com.sahasouvik.projects.Lovable_Clone.service;

import com.sahasouvik.projects.Lovable_Clone.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
