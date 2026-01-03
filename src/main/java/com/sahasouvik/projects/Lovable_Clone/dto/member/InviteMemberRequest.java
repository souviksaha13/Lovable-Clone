package com.sahasouvik.projects.Lovable_Clone.dto.member;

import com.sahasouvik.projects.Lovable_Clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
