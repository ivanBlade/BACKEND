package eshop.auth.service;

import eshop.auth.dto.AuthUserDto;
import eshop.auth.entity.AuthUser;
import eshop.auth.entity.TokenDto;

public interface AuthUserService {
    public AuthUser save(AuthUserDto authUserDto);

    public TokenDto login(AuthUserDto authUserDto);

    public TokenDto validate(String token);

}
