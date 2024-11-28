drop database masv_hoten_asm;
go 
create database asm_java3;
use asm_java3;
go 
-- tạo bảng user pass
create table users
(
username nvarchar(30),
password nvarchar(30) not null,
role nvarchar(50) not null,
PRIMARY key(username) 
);
go 
-- tạo bảng Student
create table Student
(
	masv nvarchar(50),
	hoten nvarchar(50),
	email nvarchar(50),
	soDT nvarchar(15),
	gioitinh bit,
	diachi nvarchar(50),
	hinh nvarchar(50),
	primary key(masv)

);
go 
-- 3 tạo bảng GRADE
drop table Grade; 
create table Grade
(
id int identity(1,1),
masv nvarchar(50) references Student(masv),
tiengAnh int,
tinHoc int,
GDTC int,
primary key(id)
);
go 
-- thêm dữ liệu user 
insert into users
values 
('long','123','admim');
go 
insert into users
values ('thanh','123','admin');
go 
insert into users
values ('dj','123','admin');
go
insert into Student
values ('SV001',N'Nguyễn Văn Tèo','teonv@gmail.com','0976556548',1,N'Quạn 1 HCM','teo.jpg'),
('SV002',N'Lê thị ơi ','oilt@gmail.com','0976556590',0,N'Quạn 2 HCM','oi.jpg'),
('SV003',N'Nguyễn thị thu ','thunt@gmail.com','0976556567',1,N'Quạn 3 HCM','thu.jpg'),
('SV004',N'Lê thị hiền','hienlt@gmail.com','09765565789',0,N'Quạn 4 HCM','hien.jpg'),
('SV005',N'Dao mai','maid@gmail.com','0976556544',0,N'Quạn 5 HCM','mai.jpg');
go 
-- thêm dữ liệu vào bảng Grade
insert into Grade
values('SV001',8,9,10),
	('SV002',8,9,10),
	('SV003',7,8,7),
	('SV004',4,8,9),
	('SV005',5,6,9);
go 

select Student.masv, hoten, tinHoc,tiengAnh,GDTC, (tinHoc+tiengAnh+GDTC)/3 as 'DiemTb'
from Student,Grade
where Student.masv = Grade.masv
go 
