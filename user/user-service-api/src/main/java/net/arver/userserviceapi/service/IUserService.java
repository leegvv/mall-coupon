package net.arver.userserviceapi.service;

import net.arver.userserviceapi.vo.UserVo;

/**
 * 用户服务.
 */
public interface IUserService {

    UserVo getUserById(int id);
}
