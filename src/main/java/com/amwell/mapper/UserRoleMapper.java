package com.amwell.mapper;

import com.amwell.model.UserRole;
import com.amwell.util.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}