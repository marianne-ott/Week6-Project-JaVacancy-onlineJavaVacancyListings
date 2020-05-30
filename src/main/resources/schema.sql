CREATE TABLE VACANCY(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  job_id VARCHAR (8),
  job_title VARCHAR(40),
  company_name VARCHAR(40),
  location ENUM ('Oslo', 'Trondheim', 'Bergen', 'Stavanger'),
  experience ENUM ('Entry', 'Mid', 'Senior'),
  salary BIGINT,
  job_description VARCHAR(5000),
  search_relevance BIGINT DEFAULT 0
);

CREATE TABLE APPLICATION (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
application_id BIGINT,
first_name VARCHAR (25),
last_name VARCHAR (25),
email VARCHAR (40),
phone_number BIGINT,
application_text VARCHAR (5000),
vacancy_id VARCHAR (8),
FOREIGN KEY (vacancy_id) REFERENCES VACANCY(job_id)
);



