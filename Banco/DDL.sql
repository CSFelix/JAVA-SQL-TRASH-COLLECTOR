-- DDL BANCO DE DADOS (aps_semestre_3)--

/*imagens_cenarios*/
CREATE TABLE imagens_cenarios
(
	id_cenario			SERIAL PRIMARY KEY NOT NULL,
	descricao			VARCHAR(15) UNIQUE,
	diretorio			VARCHAR(200) UNIQUE
);

/*imagens_personagem*/
CREATE TABLE imagens_personagem
(
	id_personagem		SERIAL PRIMARY KEY NOT NULL,
	descricao			VARCHAR(20) UNIQUE,
	diretorio			VARCHAR(200) UNIQUE
);

/*recordes_jogador*/
CREATE TABLE recordes_jogador
(
	id_dificuldade		INTEGER PRIMARY KEY NOT NULL,
	data_jogo			DATE DEFAULT NOW(),
	jogador 			VARCHAR(3) DEFAULT 'AAA',
	pontos				INTEGER CHECK(pontos >= 0) DEFAULT 0
);

/*rank_facil*/
CREATE TABLE rank_facil
(
	id_facil			SERIAL PRIMARY KEY NOT NULL,
	pontos				INTEGER CHECK(pontos >= 0) DEFAULT 0,
	data_jogo			DATE NOT NULL DEFAULT NOW(),
	jogador 			VARCHAR(3) NOT NULL DEFAULT 'AAA'
);

/*rank_medio*/
CREATE TABLE rank_medio
(
	id_medio			SERIAL PRIMARY KEY NOT NULL,
	pontos				INTEGER CHECK(pontos >= 0) DEFAULT 0,
	data_jogo			DATE NOT NULL DEFAULT NOW(),
	jogador 			VARCHAR(3) NOT NULL DEFAULT 'AAA'
);

/*rank_dificil*/
CREATE TABLE rank_dificil
(
	id_dificil			SERIAL PRIMARY KEY NOT NULL,
	pontos				INTEGER CHECK(pontos >= 0) DEFAULT 0,
	data_jogo			DATE NOT NULL DEFAULT NOW(),
	jogador 			VARCHAR(3) NOT NULL DEFAULT 'AAA'
);