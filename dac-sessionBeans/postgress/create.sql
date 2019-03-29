CREATE TABLE band(
  id  serial,
  originPlace character varying(80) NOT NULL,
  name character varying(54) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE member(
  id  serial,
  birthday date NOT NULL,
  name character varying(54) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE playlist(
  id  serial,
  birthday date NOT NULL,
  name character varying(54) NOT NULL,
  PRIMARY KEY (id)
);
