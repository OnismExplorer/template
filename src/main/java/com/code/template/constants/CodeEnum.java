package com.code.template.constants;

/**
 * 系统状态常量
 * @author HeXin
 */

public enum CodeEnum {
    /**
     * 成功标志
     */
    SUCCESS(200, "成功！"),

    /**
     * 参数异常
     */
    PARAMETER_ERROR(400, "参数异常！"),

    /**
     * 邮箱为空
     */
    EMAIL_EMPTY(265, "邮箱为空！"),

    /**
     * 邮箱格式错误
     */
    EMAIL_FORMAT_ERROR(275, "邮箱格式错误！"),

    /**
     * 邮件发送失败
     */
    EMAIL_SEND_ERROR(295, "邮件发送失败，请稍后重试！"),

    /**
     * 验证码错误
     */
    CODE_ERROR(285, "验证码错误！"),

    /**
     * 验证码失效
     */
    CODE_EXPIRED(205, "验证码已过期！"),
    /**
     * 数据不存在
     */
    DATA_NOT_EXIST(429,"当前查询的数据不存在,请稍后再试"),

    /**
     * 未登录
     */
    NOT_LOGIN(300, "未登陆，请登陆后再进行操作！"),

    /**
     * 登录过期
     */
    LOGIN_EXPIRED(305, "登录已过期，请重新登陆！"),

    /**
     * 系统维护
     */
    SYSTEM_REPAIR(501, "系统维护中，请稍后！"),

    /**
     * 服务异常
     */
    FAIL(500, "服务异常！"),

    /**
     * 用户不存在
     */
    USER_NOT_FOUND(255, "用户不存在"),

    /**
     * 密码错误
     */
    PASSWORD_ERROR(290, "密码错误"),

    /**
      * 两次密码不一致
      */
    PASSWORD_NOT_MATCH(291, "两次密码不一致"),
    /**
     * 系统异常
     */
    SYSTEM_ERROR(502, "服务器异常！"),

    /**
     * 没有权限
     */
    NOT_AUTHORITY(403, "没有操作权限！"),
    USERNAME_EXIST(229, "该用户名已存在！"),
    UNSUPPORT_TYPE(295,"不支持该类型！");

    private final int code;
    private final String msg;

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
