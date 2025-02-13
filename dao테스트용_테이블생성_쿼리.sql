alter table review add constraint foreign key(user_id) references user(user_id) on update cascade on delete cascade;
alter table review add constraint foreign key(cafe_num) references cafe(cafe_num) on update cascade on delete cascade;
alter table review add constraint check (rating between 1 and 5);
alter table review add constraint foreign key(nickname) references user(nickname) on update cascade on delete cascade;

desc cafe;

insert into cafe values(
null, '카페이름1','카페위치1','010-1234-5678', '사진1','설명1','x좌표1','y좌표1' 
);

insert into cafe values(
null, '카페이름2','카페위치2','010-4321-8765', '사진2','설명2','x좌표2','y좌표2' 
);

select * from cafe;

desc user;

insert into user values(
'아이디1','비번1','이메일1','닉네임1'
);

insert into user values(
'아이디2','비번2','이메일2','닉네임2'
);

select * from user;

desc review;

select * from review;

insert into review values(
null, '아이디1', '닉네임1', 1, '내용1', 1, now()
);

insert into review values(
null, '아이디2', '닉네임2', 2, '내용2', 1.5, now()
);