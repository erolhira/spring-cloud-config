CREATE TABLE APP_CONFIG (
  id INT AUTO_INCREMENT PRIMARY KEY,  
  APPLICATION VARCHAR(255),
  PROFILE VARCHAR(255),
  LABEL VARCHAR(255),
  CODE VARCHAR(255),
  VALUE VARCHAR(255),
  CREATED_ON TIMESTAMP
);

--common properties
INSERT INTO APP_CONFIG (code, value, application, profile, label) 
VALUES ('prop-1','from common properties - default','application', 'default','dev');

INSERT INTO APP_CONFIG (code, value, application, profile, label) 
VALUES ('prop-2','from common properties - default','application', 'default','dev');

INSERT INTO APP_CONFIG (code, value, application, profile, label) 
VALUES ('prop-3','from common properties - istanbul','application', 'istanbul','dev');

INSERT INTO APP_CONFIG (code, value, application, profile, label) 
VALUES ('prop-3','from common properties - ankara','application', 'ankara','dev');

--app-common properties
INSERT INTO APP_CONFIG (code, value, application, profile, label)
VALUES ('prop-4','from app properties - default','myconfig-client-app','default','dev');

--instance properties
INSERT INTO APP_CONFIG (code, value, application, profile, label)
VALUES ('prop-4','from instance properties - instance01','myconfig-client-app','instance01','dev');

--istanbul properties
INSERT INTO APP_CONFIG (code, value, application, profile, label)
VALUES ('prop-4','from app properties - istanbul','myconfig-client-app','istanbul','dev');

INSERT INTO APP_CONFIG (code, value, application, profile, label) 
VALUES ('prop-2','from app properties - istanbul','myconfig-client-app', 'istanbul','dev');

--ankara properties
INSERT INTO APP_CONFIG (code, value, application, profile, label)
VALUES ('prop-2','from app properties - ankara','myconfig-client-app','ankara','dev');

