INSERT INTO roles (id, name) VALUES (1, 'ADMIN');
INSERT INTO roles (id, name) VALUES (2, 'USER');

INSERT INTO users (id, first_name, last_name, email, password, role_id) VALUES (5, 'Nick', 'Green', 'nick@mail.com', '$2a$10$ewlo67KBR/I.kg.WJljP4u/P15wzz.WMS2Qb6Pa0LMlrgHCu/tMMm', 2);
INSERT INTO users (id, first_name, last_name, email, password, role_id) VALUES (6, 'Nora', 'White', 'nora@mail.com', '$2a$10$ewlo67KBR/I.kg.WJljP4u/P15wzz.WMS2Qb6Pa0LMlrgHCu/tMMm', 2);
INSERT INTO users (id, first_name, last_name, email, password, role_id) VALUES (4, 'Mike', 'Brown', 'mike@mail.com', '$2a$10$ewlo67KBR/I.kg.WJljP4u/P15wzz.WMS2Qb6Pa0LMlrgHCu/tMMm', 1);
