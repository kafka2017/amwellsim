package com.amwell.mapper;

import com.amwell.model.Role;
import com.amwell.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}