-- Project Name : smile-ranking
-- Date/Time    : 2019/11/30 3:06:29
-- Author       : tetsuji
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

/*
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
*/

-- 顔情報
--* RestoreFromTempTable
create table FACE (
  FACE_SEQ BIGSERIAL not null
  , FACE_GENDER VARCHAR(25)
  , FACE_AGE DECIMAL(5,2)
  , FACE_HAPPINESS DECIMAL(5,2)
  , FACE_SMILE INT not null
  , FACE_IMAGE BLOB not null
  , ENTER_DATE TIMESTAMP not null
  , constraint FACE_PKC primary key (FACE_SEQ)
) ;

comment on table FACE is '顔情報';
comment on column FACE.FACE_SEQ is '顔連番';
comment on column FACE.FACE_GENDER is '性別';
comment on column FACE.FACE_AGE is '年齢';
comment on column FACE.FACE_HAPPINESS is 'ハピネス';
comment on column FACE.FACE_SMILE is 'スマイル';
comment on column FACE.FACE_IMAGE is '顔画像';
comment on column FACE.ENTER_DATE is '登録日';
