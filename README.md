# spring-boot-neo4j

#### Neo4J com Docker 
```
Comando para rodar o Neo4J server
docker run --publish=7474:7474 --publish=7687:7687 neo4j:3.0
Neo4J Browser URL
http://localhost:7474/browser
```
#### Script para criar nos e relacionamentos
```
CREATE (JanelaIndiscreta:Filme {titulo: 'Janela Indiscreta', diretor: 'Alfred Hitchcock'})
CREATE (UmCorpoQueCai:Filme {titulo: 'Um Corpo que Cai', diretor: 'Alfred Hitchcock'})
CREATE (CidadaoKane:Filme {titulo: 'Cidadão Kane', diretor: 'Orson Welles'})
CREATE (AMarcaDaMaldade:Filme {titulo: 'A Marca da Maldade', diretor: 'Orson Welles'})
CREATE (NoTempoDasDiligencias:Filme {titulo: 'No Tempo das Diligências', diretor: 'John Ford'})
CREATE (RastrosDeOdio:Filme {titulo: 'Rastros de Ódio', diretor: 'John Ford'})
CREATE (LevadaDaBreca:Filme {titulo: 'Levada da Breca', diretor: 'Howard Hawks'})
CREATE (OndeComecaOInferno:Filme {titulo: 'Onde Começa o Inferno', diretor: 'Howard Hawks'})
CREATE (OSetimoSelo:Filme {titulo: 'O Sétimo Selo', diretor: 'Ingmar Bergman'})
CREATE (QuandoDuasMulheresPecam:Filme {titulo: 'Quando Duas Mulheres Pecam', diretor: 'Ingmar Bergman'})
CREATE (Rashomon:Filme {titulo: 'Rashomon', diretor: 'Akira Kurosawa'})
CREATE (OsSeteSamurais:Filme {titulo: 'Os Sete Samurais', diretor: 'Akira Kurosawa'})
CREATE (LuzesDaCidade:Filme {titulo: 'Luzes da Cidade', diretor: 'Charlie Chaplin'})
CREATE (TemposModernos:Filme {titulo: 'Tempos Modernos', diretor: 'Charlie Chaplin'})
CREATE (Intolerancia:Filme {titulo: 'Intolerância', diretor: 'D.W. Griffith'})
CREATE (WayDownEast:Filme {titulo: 'Way Down East', diretor: 'D.W. Griffith'})
CREATE (AMulherFazOHomem:Filme {titulo: 'A Mulher Faz o Homem', diretor: 'Frank Capra'})
CREATE (AFelicidadeNaoSeCompra:Filme {titulo: 'A Felicidade Não Se Compra', diretor: 'Frank Capra'})
CREATE (ADoceVida:Filme {titulo: 'A Doce Vida', diretor: 'Federico Fellini'})
CREATE (Amarcord:Filme {titulo: 'Amarcord', diretor: 'Federico Fellini'})
CREATE (Tubarao:Filme {titulo: 'Tubarão', diretor: 'Steven Spielberg'})
CREATE (Extraterrestre:Filme {titulo: 'E.T.: O Extraterrestre', diretor: 'Steven Spielberg'})
CREATE (UmDiaNoCampo:Filme {titulo: 'Um Dia no Campo', diretor: 'Jean Renoir'})
CREATE (ARegraDoJogo:Filme {titulo: 'A Regra do Jogo', diretor: 'Jean Renoir'})
CREATE (Desencanto:Filme {titulo: 'Desencanto', diretor: 'David Lean'})
CREATE (LawrenceDaArabia:Filme {titulo: 'Lawrence da Arábia', diretor: 'David Lean'})
CREATE (AIdadeDoOuro:Filme {titulo: 'A Idade do Ouro', diretor: 'Luis Buñuel'})
CREATE (ODiscretoCharmeDaBurguesia:Filme {titulo: 'O Discreto Charme da Burguesia', diretor: 'Luis Buñuel'})
CREATE (TaxiDriver:Filme {titulo: 'Taxi Driver', diretor: 'Martin Scorsese'})
CREATE (TouroIndomavel:Filme {titulo: 'Touro Indomável', diretor: 'Martin Scorsese'})
CREATE (ALojaDaEsquina:Filme {titulo: 'A Loja da Esquina', diretor: 'Ernst Lubitsch'})
CREATE (SerOuNaoSer:Filme {titulo: 'Ser ou Não Ser', diretor: 'Ernst Lubitsch'})
CREATE (Nashville:Filme {titulo: 'Nashville', diretor: 'Robert Altman'})
CREATE (OJogador:Filme {titulo: 'O Jogador', diretor: 'Robert Altman'})
CREATE (NupciasDeEscandalo:Filme {titulo: 'Núpcias de Escândalo', diretor: 'George Cukor'})
CREATE (NasceUmaEstrela:Filme {titulo: 'Nasce uma Estrela', diretor: 'George Cukor'})
CREATE (NoivoNeurotico:Filme {titulo: 'Noivo Neurótico, Noiva Nervosa', diretor: 'Woody Allen'})
CREATE (CrimesEPecados:Filme {titulo: 'Crimes e Pecados', diretor: 'Woody Allen'})
CREATE (OPonteiroDaSaudade:Filme {titulo: 'O Ponteiro da Saudade', diretor: 'Vincente Minnelli'})
CREATE (SinfoniaDeParis:Filme {titulo: 'Sinfonia de Paris', diretor: 'Vincente Minnelli'})
CREATE (TheGodfather:Filme {titulo: 'The Godfather', diretor: 'Francis Ford Coppola'})
CREATE (ApocalypseNow:Filme {titulo: 'Apocalypse Now', diretor: 'Francis Ford Coppola'})
CREATE (NesteMundoENoOutro:Filme {titulo: 'Neste Mundo e no Outro', diretor: 'Michael Powell'})
CREATE (OsSapatinhosVermelhos:Filme {titulo: 'Os Sapatinhos Vermelhos', diretor: 'Michael Powell'})
CREATE (UmaOdisseiaNoEspaco:Filme {titulo: '2001: Uma Odisseia no Espaço', diretor: 'Stanley Kubrick'})
CREATE (LaranjaMecanica:Filme {titulo: 'Laranja Mecânica', diretor: 'Stanley Kubrick'})
CREATE (CrepusculoDosDeuses:Filme {titulo: 'Crepúsculo dos Deuses', diretor: 'Billy Wilder'})
CREATE (QuantoMaisQuenteMelhor:Filme {titulo: 'Quanto Mais Quente Melhor', diretor: 'Billy Wilder'})
CREATE (PatherPanchali:Filme {titulo: 'Pather Panchali', diretor: 'Satyajit Ray'})
CREATE (OMundoDeApu:Filme {titulo: 'O Mundo de Apu', diretor: 'Satyajit Ray'})
CREATE (RepulsaAoSexo:Filme {titulo: 'Repulsa ao Sexo', diretor: 'Roman Polanski'})
CREATE (Chinatown:Filme {titulo: 'Chinatown', diretor: 'Roman Polanski'})
CREATE (OsIncompreendidos:Filme {titulo: 'Os Incompreendidos', diretor: 'François Truffaut'})
CREATE (UmaMulherParaDois:Filme {titulo: 'Uma Mulher para Dois', diretor: 'François Truffaut'})
CREATE (AsTresNoitesDeEva:Filme {titulo: 'As Três Noites de Eva', diretor: 'Preston Sturges'})
CREATE (OdeioTeMeuAmor:Filme {titulo: 'Odeio-te Meu Amor', diretor: 'Preston Sturges'})
CREATE (OEncouracadoPotemkin:Filme {titulo: 'O Encouraçado Potemkin', diretor: 'Sergei Eisenstein'})
CREATE (AlexanderNevsky:Filme {titulo: 'Alexander Nevsky', diretor: 'Sergei Eisenstein'})
CREATE (Metropolis:Filme {titulo: 'Metrópolis', diretor: 'Fritz Lang'})
CREATE (OVampiroDeDusseldorf:Filme {titulo: 'M, o Vampiro de Dusseldorf', diretor: 'Fritz Lang'})
CREATE (Acossado:Filme {titulo: 'Acossado', diretor: 'Jean-Luc Godard'})
CREATE (BandaAParte:Filme {titulo: 'Banda à Parte', diretor: 'Jean-Luc Godard'})
CREATE (PistoleirosDoEntardecer:Filme {titulo: 'Pistoleiros do Entardecer', diretor: 'Sam Peckinpah'})
CREATE (MeuOdioSeraTuaHeranca:Filme {titulo: 'Meu Ódio Será Tua Herança', diretor: 'Sam Peckinpah'})
CREATE (Nosferatu:Filme {titulo: 'Nosferatu', diretor: 'F.W. Murnau'})
CREATE (Aurora:Filme {titulo: 'Aurora', diretor: 'F.W. Murnau'})
CREATE (ReliquiaMacabra:Filme {titulo: 'Relíquia Macabra', diretor: 'John Huston'})
CREATE (OTesouroDeSierraMadre:Filme {titulo: 'O Tesouro de Sierra Madre', diretor: 'John Huston'})
CREATE (AColeraDosDeuses:Filme {titulo: 'Aguirre, a Cólera dos Deuses', diretor: 'Werner Herzog'})
CREATE (OEnigmaDeKasparHauser:Filme {titulo: 'O Enigma de Kaspar Hauser', diretor: 'Werner Herzog'})
CREATE (NoSilencioDaNoite:Filme {titulo: 'No Silêncio da Noite', diretor: 'Nicholas Ray'})
CREATE (JuventudeTransviada:Filme {titulo: 'Juventude Transviada', diretor: 'Nicholas Ray'})
CREATE (OExpressoDeXangai:Filme {titulo: 'O Expresso de Xangai', diretor: 'Josef von Sternberg'})
CREATE (AImperatrizVermelha:Filme {titulo: 'A Imperatriz Vermelha', diretor: 'Josef von Sternberg'})
CREATE (SublimeObsessao:Filme {titulo: 'Sublime Obsessão', diretor: 'Douglas Sirk'})
CREATE (PalavrasAoVento:Filme {titulo: 'Palavras ao Vento', diretor: 'Douglas Sirk'})
CREATE (DesejosProibidos:Filme {titulo: 'Desejos Proibidos', diretor: 'Max Ophüls'})
CREATE (LolaMontes:Filme {titulo: 'Lola Montès', diretor: 'Max Ophüls'})
CREATE (AtlanticCity:Filme {titulo: 'Atlantic City', diretor: 'Louis Malle'})
CREATE (AdeusMeninos:Filme {titulo: 'Adeus, Meninos', diretor: 'Louis Malle'})
CREATE (TresHomensEmConflito:Filme {titulo: 'Três Homens em Conflito', diretor: 'Sergio Leone'})
CREATE (EraUmaVezNoOeste:Filme {titulo: 'Era uma Vez no Oeste', diretor: 'Sergio Leone'})
CREATE (HomensEUmaSentenca:Filme {titulo: '12 Homens e uma Sentença', diretor: 'Sidney Lumet'})
CREATE (UmDiaDeCao:Filme {titulo: 'Um Dia de Cão', diretor: 'Sidney Lumet'})
CREATE (OsMelhoresAnosDeNossasVidas:Filme {titulo: 'Os Melhores Anos de Nossas Vidas', diretor: 'William Wyler'})
CREATE (BenHur:Filme {titulo: 'Ben-Hur', diretor: 'William Wyler'})
CREATE (OConformista:Filme {titulo: 'O Conformista', diretor: 'Bernardo Bertolucci'})
CREATE (UltimoTangoEmParis:Filme {titulo: 'Último Tango em Paris', diretor: 'Bernardo Bertolucci'})
CREATE (MelvinEHoward:Filme {titulo: 'Melvin e Howard', diretor: 'Jonathan Demme'})
CREATE (OSilencioDosInocentes:Filme {titulo: 'O Silêncio dos Inocentes', diretor: 'Jonathan Demme'})
CREATE (MeuTio:Filme {titulo: 'Meu Tio', diretor: 'Jacques Tati'})
CREATE (PlaytimeTempoDeDiversao:Filme {titulo: 'Playtime - Tempo de Diversão', diretor: 'Jacques Tati'})
CREATE (Laura:Filme {titulo: 'Laura', diretor: 'Otto Preminger'})
CREATE (TempestadeSobreWashington:Filme {titulo: 'Tempestade Sobre Washington', diretor: 'OttoPreminger'})
CREATE (PaiEFilha:Filme {titulo: 'Pai e Filha', diretor: 'Yasujiro Ozu'})
CREATE (EraUmaVezEmToquio:Filme {titulo: 'Era uma Vez em Tóquio', diretor: 'Yasujiro Ozu'})
CREATE (OsFantasmasSeDivertem:Filme {titulo: 'Os Fantasmas se Divertem', diretor: 'Tim Burton'})
CREATE (EdwardMaosDeTesoura:Filme {titulo: 'Edward Mãos de Tesoura', diretor: 'Tim Burton'})
CREATE (FeiraDeAmostras:Filme {titulo: 'Feira de Amostras', diretor: 'Henry King'})
CREATE (OMatador:Filme {titulo: 'O Matador', diretor: 'Henry King'})
CREATE (Frederico:Usuario {nome: 'Frederico', idade: 31})
CREATE (Cristhiany:Usuario {nome: 'Cristhiany', idade: 29})
CREATE (Davi:Usuario {nome: 'Davi', idade: 18})
CREATE (Paulo:Usuario {nome: 'Paulo', idade: 20})
CREATE (Cleia:Usuario {nome: 'Cleia', idade: 40})
CREATE (Augusto:Usuario {nome: 'Augusto', idade: 50})
CREATE (Maria:Usuario {nome: 'Maria', idade: 21})
CREATE (Vanessa:Usuario {nome: 'Vanessa', idade: 22})
CREATE (Victoria:Usuario {nome: 'Victoria', idade: 23})
CREATE (Alexandre:Usuario {nome: 'Alexandre', idade: 31})
CREATE (Luiz:Usuario {nome: 'Luiz', idade: 38})
CREATE (Luis:Usuario {nome: 'Luis', idade: 40})
CREATE (Gabriel:Usuario {nome: 'Gabriel', idade: 44})
CREATE (Daniele:Usuario {nome: 'Daniele', idade: 22})
CREATE (Pedro:Usuario {nome: 'Pedro', idade: 30})
CREATE (Sandro:Usuario {nome: 'Sandro', idade: 30})
CREATE (Daniel:Usuario {nome: 'Daniel', idade: 18})
CREATE (Thiago:Usuario {nome: 'Thiago', idade: 19})
CREATE (Gustavo:Usuario {nome: 'Gustavo', idade: 21})
CREATE (Ricardo:Usuario {nome: 'Ricardo', idade: 26})
CREATE (Henrique:Usuario {nome: 'Henrique', idade: 30})
CREATE (Tamires:Usuario {nome: 'Tamires', idade: 32})
CREATE (Jessika:Usuario {nome: 'Jessika', idade: 28})
CREATE (Izadora:Usuario {nome: 'Izadora', idade: 27})
CREATE (Sara:Usuario {nome: 'Sara', idade: 55})
CREATE (Matheus:Usuario {nome: 'Matheus', idade: 56})
CREATE (Isabela:Usuario {nome: 'Isabela', idade: 60})
CREATE (Fabricio:Usuario {nome: 'Fabricio', idade: 30})
CREATE (Kaua:Usuario {nome: 'Kaua', idade: 22})
CREATE (Bryan:Usuario {nome: 'Bryan', idade: 23})
CREATE (Vivia:Usuario {nome: 'Vivia', idade: 24})
CREATE (Danyllo:Usuario {nome: 'Danyllo', idade: 26})
CREATE (Joao:Usuario {nome: 'Joao', idade: 29})
CREATE (Marcia:Usuario {nome: 'Marcia', idade: 30})
CREATE (Lorena:Usuario {nome: 'Lorena', idade: 30})
CREATE (Afonso:Usuario {nome: 'Afonso', idade: 20})
CREATE (Marcio:Usuario {nome: 'Marcio', idade: 21})
CREATE (Diogo:Usuario {nome: 'Diogo', idade: 19})
CREATE (Rodrigo:Usuario {nome: 'Rodrigo', idade: 29})
CREATE (Vinicius:Usuario {nome: 'Vinicius', idade: 38})
CREATE (Wesley:Usuario {nome: 'Wesley', idade: 33})
CREATE (Fabiana:Usuario {nome: 'Fabiana', idade: 36})
CREATE (Mirla:Usuario {nome: 'Mirla', idade: 37})
CREATE (Leonora:Usuario {nome: 'Leonora', idade: 41})
CREATE (Divina:Usuario {nome: 'Divina', idade: 51})
CREATE (Leia:Usuario {nome: 'Leia', idade: 58})
CREATE (Cleuza:Usuario {nome: 'Cleuza', idade: 22})
CREATE (Carmem:Usuario {nome: 'Carmem', idade: 35})
CREATE (Miguel:Usuario {nome: 'Miguel', idade: 36})
CREATE (Fernando:Usuario {nome: 'Fernando', idade: 22})
CREATE (Gilson:Usuario {nome: 'Gilson', idade: 21})
CREATE (Claudionor:Usuario {nome: 'Claudionor', idade: 20})
CREATE (Alminda:Usuario {nome: 'Alminda', idade: 18})
CREATE (Amalia:Usuario {nome: 'Amalia', idade: 18})
CREATE (Cleiton:Usuario {nome: 'Cleiton', idade: 18})
CREATE (Marcos:Usuario {nome: 'Marcos', idade: 19})
CREATE (Dayanne:Usuario {nome: 'Dayanne', idade: 21})
CREATE (Vladmir:Usuario {nome: 'Vladmir', idade: 21})
CREATE (Magal:Usuario {nome: 'Magal', idade: 25})
CREATE (Cristiano:Usuario {nome: 'Cristiano', idade: 26})
CREATE (Kaio:Usuario {nome: 'Kaio', idade: 28})
CREATE (Martins:Usuario {nome: 'Martins', idade: 22})
CREATE (Camila:Usuario {nome: 'Camila', idade: 26})
CREATE (Jairo:Usuario {nome: 'Jairo', idade: 32})
CREATE (Lemos:Usuario {nome: 'Lemos', idade: 33})
CREATE (Giuvan:Usuario {nome: 'Giuvan', idade: 33})
CREATE (Marcelo:Usuario {nome: 'Marcelo', idade: 35})
CREATE (Marina:Usuario {nome: 'Marina', idade: 21})
CREATE (Cesar:Usuario {nome: 'Cesar', idade: 31})
CREATE (Milena:Usuario {nome: 'Milena', idade: 26})
CREATE (Tadeu:Usuario {nome: 'Tadeu', idade: 28})
CREATE (Cecilia:Usuario {nome: 'Cecilia', idade: 30})
CREATE (Guedes:Usuario {nome: 'Guedes', idade: 30})
CREATE (Jacira:Usuario {nome: 'Jacira', idade: 30})
CREATE (Andre:Usuario {nome: 'Andre', idade: 36})
CREATE (Anderson:Usuario {nome: 'Anderson', idade: 21})
CREATE (Adilson:Usuario {nome: 'Adilson', idade: 26})
CREATE (Francisco:Usuario {nome: 'Francisco', idade: 25})
CREATE (Renata:Usuario {nome: 'Renata', idade: 25})
CREATE (Rosagela:Usuario {nome: 'Rosagela', idade: 30})
CREATE (Cleide:Usuario {nome: 'Cleide', idade: 30})
CREATE (Jose:Usuario {nome: 'Jose', idade: 24})
CREATE (Caique:Usuario {nome: 'Caique', idade: 28})
CREATE (Fernanda:Usuario {nome: 'Fernanda', idade: 22})
CREATE (Marli:Usuario {nome: 'Marli', idade: 21})
CREATE (Diego:Usuario {nome: 'Diego', idade: 23})
CREATE (Natalia:Usuario {nome: 'Natalia', idade: 35})
CREATE (Elder:Usuario {nome: 'Elder', idade: 41})
CREATE (Eder:Usuario {nome: 'Eder', idade: 60})
CREATE (Robson:Usuario {nome: 'Robson', idade: 55})
CREATE (Humberto:Usuario {nome: 'Humberto', idade: 56})
CREATE (Lucas:Usuario {nome: 'Lucas', idade: 53})
CREATE (Reinaldo:Usuario {nome: 'Reinaldo', idade: 28})
CREATE (Charles:Usuario {nome: 'Charles', idade: 60})
CREATE (Vitor:Usuario {nome: 'Vitor', idade: 45})
CREATE (Victor:Usuario {nome: 'Victor', idade: 32})
CREATE (Sandra:Usuario {nome: 'Sandra', idade: 22})
CREATE (Ana:Usuario {nome: 'Ana', idade: 31})
CREATE (Claudia:Usuario {nome: 'Claudia', idade: 30})
CREATE (Enzo:Usuario {nome: 'Enzo', idade: 21})

CREATE
(LevadaDaBreca)-[:RATED {rating: 9}]->(Frederico),
(LevadaDaBreca)-[:RATED {rating: 8}]->(Cristhiany),
(LevadaDaBreca)-[:RATED {rating: 9}]->(Davi),
(JanelaIndiscreta)-[:RATED {rating: 8}]->(Paulo),
(UmCorpoQueCai)-[:RATED {rating: 8}]->(Paulo),
(CidadaoKane)-[:RATED {rating: 8}]->(Cleia),
(AMarcaDaMaldade)-[:RATED {rating: 8}]->(Cleia),
(NoTempoDasDiligencias)-[:RATED {rating: 8}]->(Augusto),
(RastrosDeOdio)-[:RATED {rating: 8}]->(Augusto),
(OndeComecaOInferno)-[:RATED {rating: 8}]->(Maria),
(OSetimoSelo)-[:RATED {rating: 8}]->(Maria),
(QuandoDuasMulheresPecam)-[:RATED {rating: 8}]->(Vanessa),
(Rashomon)-[:RATED {rating: 8}]->(Vanessa),
(OsSeteSamurais)-[:RATED {rating: 8}]->(Victoria),
(LuzesDaCidade)-[:RATED {rating: 8}]->(Victoria),
(TemposModernos)-[:RATED {rating: 8}]->(Alexandre),
(Intolerancia)-[:RATED {rating: 8}]->(Alexandre),
(WayDownEast)-[:RATED {rating: 8}]->(Luiz),
(AMulherFazOHomem)-[:RATED {rating: 8}]->(Luiz),
(AFelicidadeNaoSeCompra)-[:RATED {rating: 8}]->(Luis),
(ADoceVida)-[:RATED {rating: 9}]->(Luis),
(Amarcord)-[:RATED {rating: 8}]->(Gabriel),
(Tubarao)-[:RATED {rating: 9}]->(Gabriel),
(Extraterrestre)-[:RATED {rating: 8}]->(Daniele),
(UmDiaNoCampo)-[:RATED {rating: 8}]->(Daniele),
(ARegraDoJogo)-[:RATED {rating: 8}]->(Pedro),
(Desencanto)-[:RATED {rating: 8}]->(Pedro),
(LawrenceDaArabia)-[:RATED {rating: 8}]->(Sandro),
(AIdadeDoOuro)-[:RATED {rating: 8}]->(Sandro),
(ODiscretoCharmeDaBurguesia)-[:RATED {rating: 8}]->(Daniel),
(TaxiDriver)-[:RATED {rating: 8}]->(Daniel),
(TouroIndomavel)-[:RATED {rating: 8}]->(Thiago),
(ALojaDaEsquina)-[:RATED {rating: 8}]->(Thiago),
(SerOuNaoSer)-[:RATED {rating: 8}]->(Gustavo),
(Nashville)-[:RATED {rating: 8}]->(Gustavo),
(OJogador)-[:RATED {rating: 8}]->(Ricardo),
(NupciasDeEscandalo)-[:RATED {rating: 8}]->(Ricardo),
(NasceUmaEstrela)-[:RATED {rating: 8}]->(Henrique),
(NoivoNeurotico)-[:RATED {rating: 8}]->(Henrique),
(CrimesEPecados)-[:RATED {rating: 8}]->(Tamires),
(OPonteiroDaSaudade)-[:RATED {rating: 9}]->(Tamires),
(SinfoniaDeParis)-[:RATED {rating: 8}]->(Jessika),
(TheGodfather)-[:RATED {rating: 9}]->(Jessika),
(ApocalypseNow)-[:RATED {rating: 8}]->(Izadora),
(NesteMundoENoOutro)-[:RATED {rating: 8}]->(Izadora),
(OsSapatinhosVermelhos)-[:RATED {rating: 8}]->(Sara),
(UmaOdisseiaNoEspaco)-[:RATED {rating: 8}]->(Sara),
(LaranjaMecanica)-[:RATED {rating: 8}]->(Matheus),
(CrepusculoDosDeuses)-[:RATED {rating: 8}]->(Matheus),
(QuantoMaisQuenteMelhor)-[:RATED {rating: 8}]->(Isabela),
(PatherPanchali)-[:RATED {rating: 8}]->(Isabela),
(OMundoDeApu)-[:RATED {rating: 8}]->(Fabricio),
(RepulsaAoSexo)-[:RATED {rating: 8}]->(Fabricio),
(Chinatown)-[:RATED {rating: 8}]->(Kaua),
(OsIncompreendidos)-[:RATED {rating: 8}]->(Kaua),
(UmaMulherParaDois)-[:RATED {rating: 8}]->(Bryan),
(AsTresNoitesDeEva)-[:RATED {rating: 8}]->(Bryan),
(OdeioTeMeuAmor)-[:RATED {rating: 8}]->(Vivia),
(OEncouracadoPotemkin)-[:RATED {rating: 8}]->(Vivia),
(AlexanderNevsky)-[:RATED {rating: 8}]->(Danyllo),
(Metropolis)-[:RATED {rating: 9}]->(Danyllo),
(OVampiroDeDusseldorf)-[:RATED {rating: 8}]->(Joao),
(Acossado)-[:RATED {rating: 9}]->(Joao),
(BandaAParte)-[:RATED {rating: 8}]->(Marcia),
(PistoleirosDoEntardecer)-[:RATED {rating: 8}]->(Marcia),
(MeuOdioSeraTuaHeranca)-[:RATED {rating: 8}]->(Lorena),
(Nosferatu)-[:RATED {rating: 8}]->(Lorena),
(Aurora)-[:RATED {rating: 8}]->(Afonso),
(ReliquiaMacabra)-[:RATED {rating: 8}]->(Afonso),
(OTesouroDeSierraMadre)-[:RATED {rating: 8}]->(Marcio),
(AColeraDosDeuses)-[:RATED {rating: 8}]->(Marcio),
(OEnigmaDeKasparHauser)-[:RATED {rating: 8}]->(Diogo),
(NoSilencioDaNoite)-[:RATED {rating: 8}]->(Diogo),
(JuventudeTransviada)-[:RATED {rating: 8}]->(Rodrigo),
(OExpressoDeXangai)-[:RATED {rating: 8}]->(Rodrigo),
(AImperatrizVermelha)-[:RATED {rating: 8}]->(Vinicius),
(SublimeObsessao)-[:RATED {rating: 8}]->(Vinicius),
(PalavrasAoVento)-[:RATED {rating: 8}]->(Wesley),
(DesejosProibidos)-[:RATED {rating: 8}]->(Wesley),
(LolaMontes)-[:RATED {rating: 8}]->(Fabiana),
(AtlanticCity)-[:RATED {rating: 9}]->(Fabiana),
(AdeusMeninos)-[:RATED {rating: 8}]->(Mirla),
(TresHomensEmConflito)-[:RATED {rating: 9}]->(Mirla),
(EraUmaVezNoOeste)-[:RATED {rating: 8}]->(Leonora),
(HomensEUmaSentenca)-[:RATED {rating: 8}]->(Leonora),
(UmDiaDeCao)-[:RATED {rating: 8}]->(Divina),
(OsMelhoresAnosDeNossasVidas)-[:RATED {rating: 8}]->(Divina),
(BenHur)-[:RATED {rating: 8}]->(Leia),
(OConformista)-[:RATED {rating: 8}]->(Leia),
(UltimoTangoEmParis)-[:RATED {rating: 8}]->(Cleuza),
(MelvinEHoward)-[:RATED {rating: 8}]->(Cleuza),
(OSilencioDosInocentes)-[:RATED {rating: 8}]->(Carmem),
(MeuTio)-[:RATED {rating: 8}]->(Carmem),
(PlaytimeTempoDeDiversao)-[:RATED {rating: 8}]->(Miguel),
(PlaytimeTempoDeDiversao)-[:RATED {rating: 8}]->(Miguel),
(Laura)-[:RATED {rating: 8}]->(Fernando),
(Laura)-[:RATED {rating: 8}]->(Fernando),
(TempestadeSobreWashington)-[:RATED {rating: 8}]->(Gilson),
(TempestadeSobreWashington)-[:RATED {rating: 8}]->(Gilson),
(PaiEFilha)-[:RATED {rating: 8}]->(Claudionor),
(PaiEFilha)-[:RATED {rating: 9}]->(Claudionor),
(EraUmaVezEmToquio)-[:RATED {rating: 8}]->(Alminda),
(EraUmaVezEmToquio)-[:RATED {rating: 9}]->(Alminda),
(OsFantasmasSeDivertem)-[:RATED {rating: 8}]->(Amalia),
(OsFantasmasSeDivertem)-[:RATED {rating: 8}]->(Amalia),
(EdwardMaosDeTesoura)-[:RATED {rating: 8}]->(Cleiton),
(EdwardMaosDeTesoura)-[:RATED {rating: 8}]->(Cleiton),
(FeiraDeAmostras)-[:RATED {rating: 8}]->(Marcos),
(FeiraDeAmostras)-[:RATED {rating: 8}]->(Marcos),
(OMatador)-[:RATED {rating: 8}]->(Dayanne),
(OMatador)-[:RATED {rating: 8}]->(Dayanne),
(JanelaIndiscreta)-[:RATED {rating: 8}]->(Vladmir),
(UmCorpoQueCai)-[:RATED {rating: 8}]->(Vladmir),
(CidadaoKane)-[:RATED {rating: 8}]->(Magal),
(AMarcaDaMaldade)-[:RATED {rating: 8}]->(Magal),
(NoTempoDasDiligencias)-[:RATED {rating: 8}]->(Cristiano),
(RastrosDeOdio)-[:RATED {rating: 8}]->(Cristiano),
(OndeComecaOInferno)-[:RATED {rating: 8}]->(Kaio),
(OSetimoSelo)-[:RATED {rating: 8}]->(Kaio),
(QuandoDuasMulheresPecam)-[:RATED {rating: 8}]->(Martins),
(Rashomon)-[:RATED {rating: 9}]->(Martins),
(OsSeteSamurais)-[:RATED {rating: 8}]->(Camila),
(LuzesDaCidade)-[:RATED {rating: 9}]->(Camila),
(TemposModernos)-[:RATED {rating: 8}]->(Jairo),
(Intolerancia)-[:RATED {rating: 8}]->(Jairo),
(WayDownEast)-[:RATED {rating: 8}]->(Lemos),
(AMulherFazOHomem)-[:RATED {rating: 8}]->(Lemos),
(AFelicidadeNaoSeCompra)-[:RATED {rating: 8}]->(Giuvan),
(ADoceVida)-[:RATED {rating: 8}]->(Giuvan),
(Amarcord)-[:RATED {rating: 8}]->(Marcelo),
(Tubarao)-[:RATED {rating: 8}]->(Marcelo),
(Extraterrestre)-[:RATED {rating: 8}]->(Marina),
(UmDiaNoCampo)-[:RATED {rating: 8}]->(Marina),
(ARegraDoJogo)-[:RATED {rating: 8}]->(Cesar),
(Desencanto)-[:RATED {rating: 8}]->(Cesar),
(LawrenceDaArabia)-[:RATED {rating: 8}]->(Milena),
(AIdadeDoOuro)-[:RATED {rating: 8}]->(Milena),
(ODiscretoCharmeDaBurguesia)-[:RATED {rating: 8}]->(Tadeu),
(TaxiDriver)-[:RATED {rating: 8}]->(Tadeu),
(TouroIndomavel)-[:RATED {rating: 8}]->(Cecilia),
(ALojaDaEsquina)-[:RATED {rating: 9}]->(Cecilia),
(SerOuNaoSer)-[:RATED {rating: 8}]->(Guedes),
(Nashville)-[:RATED {rating: 9}]->(Guedes),
(OJogador)-[:RATED {rating: 8}]->(Jacira),
(NupciasDeEscandalo)-[:RATED {rating: 8}]->(Jacira),
(NasceUmaEstrela)-[:RATED {rating: 8}]->(Andre),
(NoivoNeurotico)-[:RATED {rating: 8}]->(Andre),
(CrimesEPecados)-[:RATED {rating: 8}]->(Anderson),
(OPonteiroDaSaudade)-[:RATED {rating: 8}]->(Anderson),
(SinfoniaDeParis)-[:RATED {rating: 8}]->(Adilson),
(TheGodfather)-[:RATED {rating: 8}]->(Adilson),
(ApocalypseNow)-[:RATED {rating: 8}]->(Francisco),
(NesteMundoENoOutro)-[:RATED {rating: 8}]->(Francisco),
(OsSapatinhosVermelhos)-[:RATED {rating: 8}]->(Renata),
(UmaOdisseiaNoEspaco)-[:RATED {rating: 8}]->(Renata),
(LaranjaMecanica)-[:RATED {rating: 8}]->(Rosagela),
(CrepusculoDosDeuses)-[:RATED {rating: 8}]->(Rosagela),
(QuantoMaisQuenteMelhor)-[:RATED {rating: 8}]->(Cleide),
(PatherPanchali)-[:RATED {rating: 8}]->(Cleide),
(OMundoDeApu)-[:RATED {rating: 8}]->(Jose),
(RepulsaAoSexo)-[:RATED {rating: 9}]->(Jose),
(Chinatown)-[:RATED {rating: 8}]->(Caique),
(OsIncompreendidos)-[:RATED {rating: 9}]->(Caique),
(UmaMulherParaDois)-[:RATED {rating: 8}]->(Fernanda),
(AsTresNoitesDeEva)-[:RATED {rating: 8}]->(Fernanda),
(OdeioTeMeuAmor)-[:RATED {rating: 8}]->(Marli),
(OEncouracadoPotemkin)-[:RATED {rating: 8}]->(Marli),
(AlexanderNevsky)-[:RATED {rating: 8}]->(Diego),
(Metropolis)-[:RATED {rating: 8}]->(Diego),
(OVampiroDeDusseldorf)-[:RATED {rating: 8}]->(Natalia),
(Acossado)-[:RATED {rating: 8}]->(Natalia),
(BandaAParte)-[:RATED {rating: 8}]->(Elder),
(PistoleirosDoEntardecer)-[:RATED {rating: 8}]->(Elder),
(MeuOdioSeraTuaHeranca)-[:RATED {rating: 8}]->(Eder),
(Nosferatu)-[:RATED {rating: 8}]->(Eder),
(Aurora)-[:RATED {rating: 8}]->(Robson),
(ReliquiaMacabra)-[:RATED {rating: 8}]->(Robson),
(OTesouroDeSierraMadre)-[:RATED {rating: 8}]->(Humberto),
(AColeraDosDeuses)-[:RATED {rating: 8}]->(Humberto),
(OEnigmaDeKasparHauser)-[:RATED {rating: 8}]->(Lucas),
(NoSilencioDaNoite)-[:RATED {rating: 9}]->(Lucas),
(JuventudeTransviada)-[:RATED {rating: 8}]->(Reinaldo),
(OExpressoDeXangai)-[:RATED {rating: 9}]->(Reinaldo),
(AImperatrizVermelha)-[:RATED {rating: 8}]->(Charles),
(SublimeObsessao)-[:RATED {rating: 8}]->(Charles),
(PalavrasAoVento)-[:RATED {rating: 8}]->(Vitor),
(DesejosProibidos)-[:RATED {rating: 8}]->(Vitor),
(LolaMontes)-[:RATED {rating: 8}]->(Victor),
(AtlanticCity)-[:RATED {rating: 8}]->(Victor),
(AdeusMeninos)-[:RATED {rating: 8}]->(Sandra),
(TresHomensEmConflito)-[:RATED {rating: 8}]->(Sandra),
(EraUmaVezNoOeste)-[:RATED {rating: 8}]->(Ana),
(HomensEUmaSentenca)-[:RATED {rating: 8}]->(Ana),
(UmDiaDeCao)-[:RATED {rating: 8}]->(Claudia),
(OsMelhoresAnosDeNossasVidas)-[:RATED {rating: 8}]->(Claudia),
(BenHur)-[:RATED {rating: 8}]->(Enzo),
(OConformista)-[:RATED {rating: 8}]->(Enzo),
(UltimoTangoEmParis)-[:RATED {rating: 8}]->(Frederico),
(MelvinEHoward)-[:RATED {rating: 8}]->(Cristhiany),
(OSilencioDosInocentes)-[:RATED {rating: 8}]->(Davi),
(MeuTio)-[:RATED {rating: 8}]->(Davi),
(OSilencioDosInocentes)-[:RATED {rating: 8}]->(Frederico),
(MeuTio)-[:RATED {rating: 8}]->(Frederico),
(OSilencioDosInocentes)-[:RATED {rating: 8}]->(Cristhiany),
(MeuTio)-[:RATED {rating: 8}]->(Cristhiany),
(OSilencioDosInocentes)-[:RATED {rating: 8}]->(Cleuza),
(MeuTio)-[:RATED {rating: 8}]->(Cleuza),
(LevadaDaBreca)-[:RATED {rating: 8}]->(Cleuza)

;
```
