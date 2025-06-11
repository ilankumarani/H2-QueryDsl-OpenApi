insert into OWNER_SCHEMA.OWNER_DETAILS
(id, name, email)
    VALUES
(1, 'ILAN', 'ilankumaran.i@gmail.com'),
(2, 'GANESH', 'kumaranilan@yahoo.com');


insert into BLOG_SCHEMA.BLOG_DETAILS
(id ,category, content, title, owner_id)
    VALUES
(11, 'ANIMAL', 'DOG', 'ALPHA', 1),
(22, 'BIRD', 'PEACOCK', 'BETA', 1),
(33, 'AUTOMOBILE', 'CAR', 'DELTA', 2),
(44, 'VEHICLE', 'BIKE', 'GAMMA', 2);
