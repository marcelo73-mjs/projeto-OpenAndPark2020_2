use projetoWeb;

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `sobrenome` varchar(255) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `logradouro` varchar(255) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `numero` varchar(5) NOT NULL,
  `bloco` varchar(5) NOT NULL,
  `CEP` varchar(12) NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `idCliente_UNIQUE` (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `comentario` (
  `idComentario` int(11) NOT NULL AUTO_INCREMENT,
  `fk_id_cliente` int(11) NOT NULL,
  `mensagem` varchar(255) NOT NULL,
  `data_mensagem` datetime NOT NULL,
  `numero_estrelas` int(11) NOT NULL,
  PRIMARY KEY (`idComentario`),
  UNIQUE KEY `idComentario_UNIQUE` (`idComentario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `estacionamento` (
  `id_estacionamento` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `logradouro` varchar(255) NOT NULL,
  `numero` int(5) NOT NULL,
  `bloco` varchar(5) NOT NULL,
  `bairro` varchar(255) NOT NULL,
  `CEP` varchar(12) NOT NULL,
  `cidade` varchar(12) NOT NULL,
  `UF` varchar(12) NOT NULL,
  PRIMARY KEY (`id_estacionamento`),
  UNIQUE KEY `idestacionamento_UNIQUE` (`id_estacionamento`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

CREATE TABLE `estacionaVaga` (
  `id_estacionaVaga` int(11) NOT NULL AUTO_INCREMENT,
  `fk_idEstacionamento` int(11) NOT NULL,
  `fk_idVaga` int(11) NOT NULL,
  `hora_entrada` time NOT NULL,
  `hora_saida` time NOT NULL,
  `vagas_livres` tinyint(4) NOT NULL,
  PRIMARY KEY (`id_estacionaVaga`),
  UNIQUE KEY `id_estacionaVaga_UNIQUE` (`id_estacionaVaga`),
  KEY `fk_idVaga_idx` (`fk_idVaga`),
  KEY `fk_idEstacionamento_idx` (`fk_idEstacionamento`),
  CONSTRAINT `fk_idEstacionamento` FOREIGN KEY (`fk_idEstacionamento`) REFERENCES `estacionamento` (`id_estacionamento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_idVaga` FOREIGN KEY (`fk_idVaga`) REFERENCES `Vaga` (`idVaga`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `login` (
  `id_login` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `usuraio` varchar(255) NOT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `email` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id_login`),
  UNIQUE KEY `id_login` (`id_login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `marca` (
  `idMarca` int(10) unsigned NOT NULL,
  `nome_marca` varchar(255) NOT NULL,
  `fabricante` varchar(255) NOT NULL,
  PRIMARY KEY (`idMarca`),
  UNIQUE KEY `idMarca` (`idMarca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `modelo` (
  `idModelo` int(10) unsigned NOT NULL,
  `ano_fabricacao` datetime NOT NULL,
  `descricao` varchar(255) NOT NULL,
  PRIMARY KEY (`idModelo`),
  UNIQUE KEY `idModelo` (`idModelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Vaga` (
  `idVaga` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  PRIMARY KEY (`idVaga`),
  UNIQUE KEY `idVaga_UNIQUE` (`idVaga`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

























