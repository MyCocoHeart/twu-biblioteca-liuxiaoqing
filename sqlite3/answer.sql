select member.name from member where member.id in(
 select checkout_item.member_id from checkout_item where checkout_item.book_id in(
  select book.id from book where book.title="The Hobbit"));
--Anand Beck
select count(*) from member where member.id not in (
 select checkout_item.member_id from checkout_item);
--37
select book.title from book where book.id not in(select checkout_item.book_id from checkout_item where book_id is not null) 
 union all
 select movie.title from movie where movie.id not in(select checkout_item.movie_id from checkout_item where movie_id is not null);
/*
Fellowship of the Ring
1984
Tom Sawyer
Catcher in the Rye
To Kill a Mockingbird
Domain Driven Design
Thin Red Line
Crouching Tiger, Hidden Dragon
Lawrence of Arabia
Office Space
*/
 insert into book(id,title) values (11,"The Pragmatic Programmer");
 insert into member (id,name)values(43,"Liu Xiaoqing");
 insert into checkout_item(member_id,book_id) values (43,11);
 select member.name from member where member.id in(
  select checkout_item.member_id from checkout_item where checkout_item.book_id in(
   select book.id from book where book.title="The Pragmatic Programmer"));
--Liu Xiaoqing  
select member.name from member where member.id in (select member_id as cnt from checkout_item group by member_id having count(*)>1);
/*
Anand Beck
Frank Smith
*/