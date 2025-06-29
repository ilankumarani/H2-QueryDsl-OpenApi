create table blog_schema.blog_details (
        id INT generated by default as identity,
        owner_id INT,
        category VARCHAR(200),
        content VARCHAR(200),
        title VARCHAR(200),
        primary key (id)
    );


create table owner_schema.owner_details (
        id INT generated by default as identity,
        email VARCHAR(200),
        name VARCHAR(200),
        primary key (id)
    );