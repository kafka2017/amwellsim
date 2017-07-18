package com.amwell.service;

import com.amwell.model.User;
import com.amwell.model.UserRole;
import com.github.pagehelper.PageInfo;

public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

}
