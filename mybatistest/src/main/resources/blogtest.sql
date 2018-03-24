CREATE TABLE blog (
    blog_id bigserial NOT NULL PRIMARY KEY,
    blog_title CHARACTER VARYING(100),
    blog_author_id INTEGER
)
WITH (OIDS=FALSE);

CREATE TABLE author (
    author_id bigserial NOT NULL PRIMARY KEY,
    author_name CHARACTER VARYING(100),
    author_password CHARACTER VARYING(100),
    author_email CHARACTER VARYING(100),
    author_bio CHARACTER VARYING(100),
    author_favourite_section CHARACTER VARYING(100)
)
WITH (OIDS=FALSE);

CREATE TABLE post (
    post_id bigserial NOT NULL PRIMARY KEY,
    post_subject CHARACTER VARYING(100),
    post_body CHARACTER VARYING(100),
    blog_id INTEGER,
    post_author_id INTEGER
)
WITH (OIDS=FALSE);

CREATE TABLE tag (
    tag_id bigserial NOT NULL PRIMARY KEY,
    tag_name CHARACTER VARYING(100)
)
WITH (OIDS=FALSE);

CREATE TABLE post_tag (
    post_id INTEGER,
    tag_id INTEGER
)
WITH (OIDS=FALSE);
