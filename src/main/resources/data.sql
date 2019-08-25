DROP TABLE IF EXISTS country;
 
CREATE TABLE country (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
);


CREATE TABLE team (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  country_id int,
  won int,
  lose int,
  foreign key (country_id) references country(id)
);


CREATE TABLE league_matches (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  team_1 int,
  team_2 int,
  win_loss int,
  foreign key (team_1) references team(id),
  foreign key (team_2) references team(id)
);

insert into country values(1,'India');
insert into country values(2, 'China');
insert into country values(3, 'Brazil');


insert into team values(1,'Team_India',1,2,0);
insert into team values(2, 'Team_China',2,1,1);
insert into team values(3, 'Team_Brazil',3,0,2);

insert into league_matches values(1,1,2,1);
insert into league_matches values(2,2,3,1);
insert into league_matches values(3,1,3,1);
 