create table if not exists user
(
    id              bigint auto_increment            primary key comment '主键ID',
    username        varchar(30)                         not null comment '用户名',
    password        varchar(30)                         not null comment '密码',
    nickname        varchar(30)                         not null comment '用户昵称',
    create_time     timestamp default CURRENT_TIMESTAMP not null comment '账号创建时间'
);
