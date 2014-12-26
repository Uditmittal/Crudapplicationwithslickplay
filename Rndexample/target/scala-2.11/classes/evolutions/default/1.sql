# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table `employee` (`eid` INTEGER NOT NULL PRIMARY KEY,`name` VARCHAR(50) NOT NULL,`eadd` VARCHAR(100) NOT NULL,`emob` VARCHAR(100) NOT NULL);
create table `person` (`pid` INTEGER NOT NULL PRIMARY KEY,`pname` VARCHAR(254) NOT NULL,`padd` VARCHAR(254) NOT NULL,`pmob` VARCHAR(254) NOT NULL);

# --- !Downs

drop table `person`;
drop table `employee`;

