--DROP DATABASE IF EXISTS  _library;

--CREATE DATABASE _library;
--
-- ͼ����Ϣ��
--
USE _library;
 if exists (select *
             from INFORMATION_SCHEMA.tables
             where table_name = 'receive'
             )DROP TABLE receive;
CREATE TABLE receive(
    id          VARCHAR(60)  PRIMARY KEY NOT NULL,
    name        VARCHAR(60)   NOT NULL,
    managerid   INT           NOT NULL,
    signs       VARCHAR(10)   NOT NULL,--�Ƿ�ǩ��
    receivedate VARCHAR(100)          NOT NULL,
    receivephone VARCHAR(50)          NOT NULL,
    receivename VARCHAR(50)   NOT NULL,
    receiveadress  VARCHAR(1000)  NOT NULL,
    scanid      VARCHAR(50)   NOT NULL,
    sends       VARCHAR(50)   NOT NULL,--�ɼ���ʽ
    sendname     VARCHAR(50)  NOT NULL,
    dotime      VARCHAR(100)           NOT NULL,
    doname      VARCHAR(50)   NOT NULL,
    signtime    VARCHAR(100) ,
    settlement  VARCHAR(50)  NOT NULL,--���㷽ʽ
    cost        FLOAT     ,
    daicost     FLOAT,
    yingcost    FLOAT,
    shicost     FLOAT,
    beizhu      VARCHAR(2000) ,  
    riqi        date     Not NUll, 
);
--
-- ������Ϣ��
--
 if exists (select *
             from INFORMATION_SCHEMA.tables
             where table_name = 'send'
             )DROP TABLE send;
CREATE TABLE send(
    id          VARCHAR(60)  PRIMARY KEY NOT NULL,
    name        VARCHAR(60)   NOT NULL,
    sendtime    VARCHAR(100)  NOT NULL,
    sendname     VARCHAR(50)  NOT NULL,
    sendphone   INT          NOT NULL,
    sendadress  VARCHAR(1000) NOT NULL,
    senddanwei  VARCHAR(1000)  NOT NULL,
    receivename VARCHAR(50)   NOT NULL,  
    receivephone VARCHAR(50)          NOT NULL,
    receivedanwei VARCHAR(1000) NOT NULL, 
    receiveadress  VARCHAR(1000)  NOT NULL,
    price       FLOAT         NOT NULL,
    sheng       VARCHAR(50)   NOT NULL,
    shi          VARCHAR(50)  NOT NULL,
    quxian      VARCHAR(50)    NOT NULL,
    signs       VARCHAR(10)  NOT NULL,
    neirong      VARCHAR(10)  NOT NULL,
    zhongliang   FLOAT      NOT NULL,
    yunfei      FLOAT       NOT NULL,
    settlement  VARCHAR(50)  NOT NULL,
    managerid   INT           NOT NULL,  
    scanid      INT   NOT NULL,
    beizhu      VARCHAR(2000) ,
    riqi        date    NOT NULL,
);

--
-- ������Ϣ��
--
-- ע�⣺is_back�ֶλ����ֵΪ0�����Ϊ1
--

 if exists (select *
             from INFORMATION_SCHEMA.tables
             where table_name = 'library_borrow'
             )DROP TABLE library_borrow;
--
-- �û���Ϣ��
--
-- ע�⣺is_admin�ֶι���ԱֵΪ0����ͨ�û�ֵΪ1
--
 if exists (select *
             from INFORMATION_SCHEMA.tables
             where table_name = 'library_user'
             )DROP TABLE library_user;
CREATE TABLE library_user(
    --id          INT  NOT NULL PRIMARY KEY,
    login_id    VARCHAR(50) NOT NULL unique ,
    name        varchar(50),
    pass        varchar(50) not null,
    is_admin    int 
);
CREATE INDEX user_index ON library_user (login_id);

--
-- Ĭ�ϵ�¼��������
--
insert into library_user (login_id,name,pass,is_admin) values('001','admin','admin',0);
