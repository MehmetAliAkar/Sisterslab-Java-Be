create database library;

create table book(
    id serial primary key ,
    name varchar(50),
    publication_year int,
    author varchar(50)
);

drop table book;

insert into book (name, publication_year, author)
values ('Melekler ve Şeytanlar', 1990, 'Dan Brown');

select * from book;

insert into book(name, publication_year, author)
values('Nutuk',1925,'Mustafa Kemal Atatürk'),
      ('Aklından Bir Sayı Tut',1990,'John Verdon');

delete from book where id = 6 Or id =7;

insert into book(name, publication_year, author)
values('Ünvansız Lider',1980,'Robin Sharma'),
      ('Toplum Sözleşmesi',1870,'J.J. Rousseu');

create table student(
    id serial primary key ,
    stu_name varchar,
    taken_book_id int,
    foreign key (taken_book_id) references book(id)
);

insert into student(stu_name, taken_book_id)
values('Mehmet Ali', DEFAULT);

select * from student;

delete from student where stu_name = 'Mehmet Ali';

insert into student(stu_name, taken_book_id)
values('Mehmet Ali', 1),
      ('Mete',3),
      ('Okan',2),
      ('Ali',6),
      ('Mehmet',7);

/*insert into student(stu_name, taken_book_id)
values('Mehmet Ali', 9); 9 id olmadığı için hata alıyor*/

select student.stu_name, book.name
from student, book
where stu_name='Mehmet Ali' and book.id=student.taken_book_id;

SELECT student.stu_name, book.name
FROM student
         JOIN book ON book.id = student.taken_book_id;

insert into student(stu_name, taken_book_id)
values('Mehmet Ali', 3);

select * from student;

select student.stu_name, count(book.id) as book_count
from student
join book on book.id = student.taken_book_id
group by student.id
having count(book.id) > 1;

select count(*) from student;
