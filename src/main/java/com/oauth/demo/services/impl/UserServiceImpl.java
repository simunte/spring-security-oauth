package com.oauth.demo.services.impl;

import com.oauth.demo.domain.User;
import com.oauth.demo.repository.UserRepository;
import com.oauth.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserDetailsService, UserService {
    private static final String ERROR_NOT_FOUND = "error.not.found";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageSource messageSource;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findTop1ByUsernameAndApprovedDateIsNotNullOrderByCreationDateDesc(s)
                .orElseThrow(() -> new UsernameNotFoundException(messageSource.getMessage(ERROR_NOT_FOUND,
                        new String[]{s},
                        LocaleContextHolder.getLocale())));

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                user.getAuthorities());
    }
}
