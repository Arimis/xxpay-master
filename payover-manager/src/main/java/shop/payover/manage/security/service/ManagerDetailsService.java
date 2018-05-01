package shop.payover.manage.security.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import shop.payover.datalib.dao.mapper.RoleMapper;
import shop.payover.datalib.dao.model.Role;
import shop.payover.datalib.dao.mapper.UserMapper;
import shop.payover.datalib.dao.model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("userDetailsService")
public class ManagerDetailsService implements UserDetailsService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug(username);
        
        UserDetails userDetails = null;
        try {
            User user = userMapper.findActiveUserByUsername(username);
            if(user != null) {
                List<Role> urs = roleMapper.listRolesByUserId(user.getId());
                Collection<GrantedAuthority> authorities = new ArrayList<>();
                for(Role ur : urs) {
                    String roleName = ur.getName();
                    SimpleGrantedAuthority grant = new SimpleGrantedAuthority(roleName);
                    authorities.add(grant);
                }
                //封装自定义UserDetails类
                userDetails = new ManagerDetails(user, authorities);
            } else {
                throw new UsernameNotFoundException("该用户不存在！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userDetails;
    }

}
