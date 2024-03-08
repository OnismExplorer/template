package com.code.template.entity.dto;

/**
 * 密码dto
 *
 * @author HeXin
 * @date 2024/03/08
 */
public record PasswordDTO(String oldPassword,String newPassword,String confirmPassword) {
}
