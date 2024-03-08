# 项目启动模版
## SpringBoot + MyBatisPlus + MySQL + Redis + Satoken(权限认证)
本项目采用 SpringBoot3 与 MySQL 5.7进行个人搭建的模版，后端开发文档采用的是 Knife4j 的 Swagger 文档。<br>
后端开发文档地址为：<a herf="http://localhost:8391/doc.html">http://localhost:8391/doc.html </a><br>
启动项目之前先修改补充 application.xml 中`$$$`、`XXX`部分信息，以及数据库连接相关信息。<br>
默认超级管理员账号：admin 密码：123456<br>
非自增id采用的自定义改进版(缩短版)雪花算法，因为完整的雪花算法超过前端number的18位长度限制，会导致传回时丢失精度。