CREATE TABLE Jaegers (
	id			SERIAL PRIMARY KEY,
	modelName	TEXT,
	mark		TEXT,
	height		double,
	weight		double,
	status		TEXT,
	origin		TEXT,
	launch		DATE,
	kaijuKill	INTEGER
);