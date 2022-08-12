INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp Javascript', 'https://www.formabase.com/2017/wp-content/uploads/2021/10/frontend-react-developer-1600x600-1-640x640.png', 'https://freesvg.org/img/primary-javascript.png');

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2023-10-20T03:00:00Z', 1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2022-11-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2023-11-20T03:00:00Z', 1);

INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha JavaScript', 'Trilha com os capitulos referentes a JavaScript', 1, 'https://www.formabase.com/2017/wp-content/uploads/2021/10/frontend-react-developer-1600x600-1-640x640.png', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum', 'Compatilhe conhecimento e tire duvidas', 2, 'https://www.formabase.com/2017/wp-content/uploads/2021/10/frontend-react-developer-1600x600-1-640x640.png', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Aulas ao vivo', 'Aulas ao vivo para maior intereção', 3, 'https://www.formabase.com/2017/wp-content/uploads/2021/10/frontend-react-developer-1600x600-1-640x640.png', 0, 1);

INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 1', 'Primeiros passos na programação', 1, 'https://www.formabase.com/2017/wp-content/uploads/2021/10/frontend-react-developer-1600x600-1-640x640.png', 1, null);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 2', 'Lógica de programação', 2, 'https://www.formabase.com/2017/wp-content/uploads/2021/10/frontend-react-developer-1600x600-1-640x640.png', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 3', 'Variaveis e constantes', 3, 'https://www.formabase.com/2017/wp-content/uploads/2021/10/frontend-react-developer-1600x600-1-640x640.png', 1, 2);

INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_moment, available, only_Update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2022-10-20T13:00:00Z', null, true, false);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_moment, available, only_Update) VALUES (2, 2, TIMESTAMP WITH TIME ZONE '2022-10-20T13:00:00Z', null, true, false);

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 01 - Capitulo 01', 1, 1);
INSERT INTO tb_content ( id, text_Content, video_Uri) VALUES (1,'Material de apoio - Aula 01', 'https://www.youtube.com/watch?v=0_e9Egeyk2E');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 02 - Capitulo 01', 2, 1);
INSERT INTO tb_content ( id, text_Content, video_Uri) VALUES (2,'Material de apoio - Aula 01', 'https://www.youtube.com/watch?v=0_e9Egeyk2E');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 03 - Capitulo 01', 3, 1);
INSERT INTO tb_content ( id, text_Content, video_Uri) VALUES (3,'Material de apoio - Aula 01', 'https://www.youtube.com/watch?v=0_e9Egeyk2E');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 04 - Exercicio', 3, 1);
INSERT INTO tb_task (id, description, question_Count, approval_Count, weight, due_Date) VALUES (4, 'Pass tests', 5, 4, 1.0, TIMESTAMP WITH TIME ZONE '2022-10-20T13:00:00Z');

INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (1, 1, 1);
INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (2, 1, 1);