delete from author;
delete from blog;
delete from post;
delete from post_tag;
delete from tag;


-- author
insert into author (author_name, author_password, author_email, author_bio, author_favourite_section) values ('lyy', '12345', 'test@baidu.com', 'from china', 'junmping');
insert into author (author_name, author_password, author_email, author_bio, author_favourite_section) values ('dtt', '12345', 'dtt@baidu.com', 'from japan', 'swim');

-- blog
insert into blog (blog_title, blog_author_id) select 'flower', author_id from author where author_name='lyy';
insert into blog (blog_title, blog_author_id) select 'sun', author_id from author where author_name='dtt';

-- post
insert into post (post_subject, post_body, blog_id, post_author_id) select 'Monday', 'monday is the first day', blog_id, blog_author_id from blog where blog_title='flower';
insert into post (post_subject, post_body, blog_id, post_author_id) select 'Sunday', 'Sunday is the first day', blog_id, blog_author_id from blog where blog_title='flower';
insert into post (post_subject, post_body, blog_id, post_author_id) select 'Monday11', 'monday11 is the last day', blog_id, blog_author_id from blog where blog_title='sun';
insert into post (post_subject, post_body, blog_id, post_author_id) select 'Sunday11', 'Sunday11 is the last day', blog_id, blog_author_id from blog where blog_title='sun';

-- tag
insert into tag (tag_name) values ('red');
insert into tag (tag_name) values ('green');
insert into tag (tag_name) values ('blue');
insert into tag (tag_name) values ('yellow');

-- post_tag
insert into post_tag (post_id, tag_id) select post.post_id, tag.tag_id from post, tag where post.post_subject='Monday' and tag.tag_name='red';
insert into post_tag (post_id, tag_id) select post.post_id, tag.tag_id from post, tag where post.post_subject='Monday' and tag.tag_name='blue';
insert into post_tag (post_id, tag_id) select post.post_id, tag.tag_id from post, tag where post.post_subject='Sunday' and tag.tag_name='blue';
insert into post_tag (post_id, tag_id) select post.post_id, tag.tag_id from post, tag where post.post_subject='Sunday' and tag.tag_name='yellow';
insert into post_tag (post_id, tag_id) select post.post_id, tag.tag_id from post, tag where post.post_subject='Monday11' and tag.tag_name='red';
insert into post_tag (post_id, tag_id) select post.post_id, tag.tag_id from post, tag where post.post_subject='Sunday11' and tag.tag_name='red';