package host.sdyy.impl;


import host.sdyy.GetUserInfoService;
import host.sdyy.entity.MybatisDemoUser;
import host.sdyy.mapper.MybatisDemoUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;



/*
 *
 * @author paida 派哒 zeyu.pzy@alibaba-inc.com
 * @date 2020/10/27
 */

@Service
public class GetUserInfoServiceImpl implements GetUserInfoService{

    @Autowired
    protected MybatisDemoUserMapper mybatisDemoUserMapper;

    @Override
    public void getUserInfoById(String id, Model model)
    {


        //search by id, get UserInfo
        List<MybatisDemoUser> users = mybatisDemoUserMapper.findAll();
        model.addAttribute("users", users);
    }
}
