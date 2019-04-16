CREATE TABLE `t_role` (
  `id`        BIGINT(20)  NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(20) NOT NULL,
  `note`      VARCHAR(200)         DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

CREATE TABLE t_user (
  id        INT(12)     NOT NULL,
  user_name VARCHAR(60) NOT NULL,
  password  VARCHAR(60) NOT NULL,
  sex       CHAR(1)     NOT NULL,
  mobile    VARCHAR(20) NOT NULL,
  tel       VARCHAR(20),
  email     VARCHAR(60),
  note      VARCHAR(512),
  PRIMARY KEY (id)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

# 级联相关表

DROP TABLE IF EXISTS t_female_health_from;
DROP TABLE IF EXISTS t_male_health_from;
DROP TABLE IF EXISTS t_task;
DROP TABLE IF EXISTS t_work_card;
DROP TABLE IF EXISTS t_employee_task;
DROP TABLE IF EXISTS t_employee;

/* ================================================== */
/* Table: t_employee                               */
/* ================================================== */

CREATE TABLE t_employee (
  id        INT(12)     NOT NULL AUTO_INCREMENT,
  real_name VARCHAR(60) NOT NULL COMMENT '姓名',
  sex       INT(2)      NOT NULL COMMENT '性别 1-男 0-女',
  birthday  DATE        NOT NULL COMMENT '出生日期',
  mobile    VARCHAR(20) NOT NULL COMMENT '手机',
  email     VARCHAR(20) NOT NULL COMMENT '邮箱',
  POSITION  VARCHAR(20) NOT NULL COMMENT '职位',
  note      VARCHAR(256) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '雇员表';

/* ================================================== */
/* Table: t_employee_task                               */
/* ================================================== */

CREATE TABLE t_employee_task (
  id        INT(20)     NOT NULL,
  emp_id    INT(12)     NOT NULL COMMENT '雇员编号',
  task_id   INT(12)     NOT NULL COMMENT '任务编号',
  task_name VARCHAR(60) NOT NULL COMMENT '任务名称',
  note      VARCHAR(256) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '员工任务表';

/* ================================================== */
/* Table: t_female_health_form                               */
/* ================================================== */

CREATE TABLE t_female_health_form (
  id     INT(12)     NOT NULL AUTO_INCREMENT,
  emp_id INT(12)     NOT NULL COMMENT '雇员编号',
  heart  VARCHAR(64) NOT NULL COMMENT '心',
  liver  VARCHAR(64) NOT NULL COMMENT '肝',
  spleen VARCHAR(64) NOT NULL COMMENT '脾',
  lung   VARCHAR(64) NOT NULL COMMENT '肺',
  kidney VARCHAR(64) NOT NULL COMMENT '肾',
  uterus VARCHAR(64) NOT NULL COMMENT '子宫',
  note   VARCHAR(256) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '女性体检表';

/* ================================================== */
/* Table: t_male_health_form                               */
/* ================================================== */

CREATE TABLE t_male_health_form (
  id     INT(12)     NOT NULL AUTO_INCREMENT,
  emp_id INT(12)     NOT NULL COMMENT '雇员编号',
  heart  VARCHAR(64) NOT NULL COMMENT '心',
  liver  VARCHAR(64) NOT NULL COMMENT '肝',
  spleen VARCHAR(64) NOT NULL COMMENT '脾',
  lung   VARCHAR(64) NOT NULL COMMENT '肺',
  kidney VARCHAR(64) NOT NULL COMMENT '肾',
  prostate VARCHAR(64) NOT NULL COMMENT '前列腺',
  note   VARCHAR(256) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '男性体检表';

/* ================================================== */
/* Table: t_task                               */
/* ================================================== */

CREATE TABLE t_task (
  id      INT(12)      NOT NULL,
  title   VARCHAR(60)  NOT NULL COMMENT '任务标题',
  context VARCHAR(256) NOT NULL COMMENT '任务内容',
  note    VARCHAR(256) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '任务表';

/* ================================================== */
/* Table: t_work_card                               */
/* ================================================== */

CREATE TABLE t_work_card (
  id         INT(12)     NOT NULL AUTO_INCREMENT,
  emp_id     INT(12)     NOT NULL COMMENT '雇员编号',
  real_name  VARCHAR(60) NOT NULL COMMENT '姓名',
  department VARCHAR(20) NOT NULL COMMENT '部门',
  mobile     VARCHAR(20) NOT NULL COMMENT '手机',
  POSITION   VARCHAR(30) NOT NULL COMMENT '职位',
  note       VARCHAR(256) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '工牌表';

ALTER TABLE t_employee_task
  ADD CONSTRAINT FK_Reference_4 FOREIGN KEY (emp_id) REFERENCES t_employee (id)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT;
ALTER TABLE t_employee_task
  ADD CONSTRAINT FK_Reference_8 FOREIGN KEY (task_id) REFERENCES t_task (id)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT;
ALTER TABLE t_female_health_form
  ADD CONSTRAINT FK_Reference_5 FOREIGN KEY (emp_id) REFERENCES t_employee (id)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT;
ALTER TABLE t_male_health_form
  ADD CONSTRAINT FK_Reference_6 FOREIGN KEY (emp_id) REFERENCES t_employee (id)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT;
ALTER TABLE t_work_card
  ADD CONSTRAINT FK_Reference_7 FOREIGN KEY (emp_id) REFERENCES t_employee (id)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT;
