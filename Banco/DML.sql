-- DML BANCO DE DADOS (aps_semestre_3) --

/*imagens_cenarios*/
INSERT INTO imagens_cenarios (descricao, diretorio)
VALUES 
('CENÁRIO MANHÃ', 'src\imagens\cenarios\cenario_manha.png'), 
('CENÁRIO TARDE', 'src\imagens\cenarios\cenario_tarde.png'), 
('CENÁRIO NOITE', 'src\imagens\cenarios\cenario_noite.png');

/*imagens_personagem*/
INSERT INTO imagens_personagem (descricao, diretorio)
VALUES
('papel', 'src\imagens\personagens\papel1.png'),
('vidro', 'src\imagens\personagens\vidro1.png'),
('metal', 'src\imagens\personagens\metal1.png'),
('plástico', 'src\imagens\personagens\plastico1.png'),
('não reciclável', 'src\imagens\personagens\naoreciclavel1.png'),
('orgânico', 'src\imagens\personagens\organico1.png'),
('radioativo', 'src\imagens\personagens\radioativo1.png'),
('perigoso', 'src\imagens\personagens\perigoso1.png'),
('hospitalar', 'src\imagens\personagens\hospitalar1.png'),
('madeira', 'src\imagens\personagens\madeira1.png');

/*recordes_jogador*/
INSERT INTO recordes_jogador (id_dificuldade, pontos, data_jogo, jogador)
VALUES
(1, 0, NOW(), 'NON'),
(2, 0, NOW(), 'NON'),
(3, 0, NOW(), 'NON');

/*rank_facil*/
INSERT INTO rank_facil (pontos, data_jogo, jogador)
VALUES
(5, NOW(), 'EVE'),
(10, NOW(), 'MGS'),
(15, NOW(), 'GFS'),
(20, NOW(), 'GMS'),
(25, NOW(), 'ADM'),
(30, NOW(), 'TST'),
(35, NOW(), 'DBZ'),
(40, NOW(), 'CDZ'),
(55, NOW(), 'HXH'),
(75, NOW(), 'GUI');

/*rank_medio*/
INSERT INTO rank_medio (pontos, data_jogo, jogador)
VALUES
(15, NOW(), 'GUI'),
(30, NOW(), 'HXH'),
(45, NOW(), 'CDZ'),
(75, NOW(), 'DBZ'),
(100, NOW(), 'TST'),
(115, NOW(), 'ADM'),
(130, NOW(), 'GMS'),
(145, NOW(), 'GFS'),
(175, NOW(), 'MGS'),
(200, NOW(), 'EVE');

/*rank_dificil*/
INSERT INTO rank_dificil (pontos, data_jogo, jogador)
VALUES
(25, NOW(), 'EVE'),
(50, NOW(), 'MGS'),
(75, NOW(), 'GFS'),
(125, NOW(), 'DBZ'),
(200, NOW(), 'CDZ'),
(250, NOW(), 'HXH'),
(275, NOW(), 'TST'),
(350, NOW(), 'ADM'),
(425, NOW(), 'MGS'),
(500, NOW(), 'GUI');