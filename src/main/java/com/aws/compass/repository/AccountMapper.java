package com.aws.compass.repository;

import com.aws.compass.entity.Academy;
import com.aws.compass.entity.AcademyRegistration;
import com.aws.compass.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AccountMapper {
    public int updateUser(User user);
    public User findUserByEmail(String email);
    public int updateEnabledToEmail(String email);
    public int checkDuplicateAndIdNot(User user);

    public int getLikeState(int userId, int academyId);
    public int insertLike(int userId, int academyId);
    public int deleteLike(int userId, int academyId);

    public int getLikeCountByUserId(int userId);
    public List<Academy> getLikeAcademies(int userId);

    public int getLikeCountByAcademyId(int academyId);
}
