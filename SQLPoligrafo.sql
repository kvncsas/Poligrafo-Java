
USE HR_Analytics;

drop table if exists datos_generales_poli
drop table if exists psiquiatricos_poli
drop table if exists escolaridades_poli
drop table if exists estudiando_poli
drop table if exists o_financieras_poli
drop table if exists vivecon_poli;
drop table if exists drogas_pers_poli;
drop table if exists vincu_margenley_poli;
drop table if exists irregluhv_poli;
drop table if exists t_exam_1;
drop table if exists t_exam_2;
drop table if exists particinarco_poli;
drop table if exists vincu_margenley_poli;
drop table if exists propiedades_poli;
drop table if exists empleos_poli;
drop table if exists malosactos_poli;
drop table if exists solicitud_poli;


--truncate table datos_generales_poli
--truncate table psiquiatricos_poli
--truncate table escolaridades_poli
--truncate table estudiando_poli
--truncate table o_financieras_poli
--truncate table vivecon_poli;
--truncate table drogas_pers_poli;
--truncate table vincu_margenley_poli;
--truncate table irregluhv_poli;
--truncate table t_exam_1;
--truncate table t_exam_2;
--truncate table particinarco_poli;
--truncate table vincu_margenley_poli;
--truncate table propiedades_poli;
--truncate table empleos_poli;




create table psiquiatricos_poli (
no_id bigint,
tipoproblema varchar (100),
fechacreacion date);

create table vivecon_poli (
no_id bigint,
tpersona varchar (105),
cpersona int,
fechacreacion date);

create table escolaridades_poli (
no_id bigint,
tipo_escol varchar (150),
programa varchar (150),
nom_institucion varchar (200),
ciudad_inst varchar (150),
anio_inst int,
fechacreacion date);

create table estudiando_poli (
no_id bigint,
no_semestre int,
nom_prog_acad varchar (200),
nom_inst_prog_acad varchar (200),
nom_ciudad_prog varchar (250),
jorn_prog_acad varchar (250),
estadoestusus varchar (210),
explestadoestusus  varchar (MAX),
aniosuspension int,
fechacreacion date);

create table o_financieras_poli(
no_id bigint,
obligacion_finan varchar(150),
fechacreacion date);

create table propiedades_poli(
no_id bigint,
propiedad_exa varchar(150),
fechacreacion date);

create table drogas_pers_poli (
no_id bigint,
tipodroga varchar(250),
frecuencia_droga varchar (250),
fechacreacion date);

create table particinarco_poli (
no_id bigint,
ti_partici varchar(150),
fechacreacion date);

create table vincu_margenley_poli (
no_id bigint,
tipovinculo varchar(150),
fechacreacion date);

create table irregluhv_poli (
no_id bigint,
ti_falsificacion varchar(150),
fechacreacion date);

create table malosactos_poli (
no_id bigint,
malacto varchar (150),
fechacreacion date);

create table t_exam_1 (
no_id bigint,
num_pre varchar (150),
pregun varchar (250),
diagnos varchar (250),
admisiones varchar (250),
notas varchar (250),
fechacreacion date);

create table t_exam_2 (
no_id bigint,
num_pre varchar (s50),
pregun varchar (250),
fechacreacion date);

create table empleos_poli (
no_id bigint,
num_trabajo int,
empresa varchar (250),
mesesla int,
lugarempresa varchar (250),
cargotrabe varchar (250),
salariobe varchar (250),
mesingreso varchar (50),
anioingreso varchar (20),
mesretiro varchar (20),
anioretiro varchar (20),
motivoretiro varchar (MAX),
fechacreacion date);


create table solicitud_poli (
id int identity primary key, 
usuarioRegistrador varchar (100),
fechaPeticion date,
horaPeticion varchar (20),
nombreEvaluado varchar (100),
tipoIdentificacion varchar (20),
numeroIdentificacion bigint,
cargoEvaluado varchar (100),
areaEvaluado varchar (100),
nombreSolicitante varchar (100),
cargoSolicitante varchar (100),
ciudadPeticion varchar (50),
tipoConvocatoria varchar (50),
estadoPeticion varchar (50),
color varchar (10))

CREATE TABLE datos_generales_poli(
--1). Datos personas
nombre varchar (max),
t_identificacion varchar (max),
no_id bigint,
lugar_exp varchar (max),
lugar_naci varchar (max),
fecha_naci date,
direccion varchar (max),
barrio varchar (max),
localidad varchar (max),
edad int,
estrato int,
tel_fijo varchar (max),
tel_celular varchar (max),
cargoactual varchar (max),
cargoaspira varchar (max),
areaactual varchar (max),
areaaspira varchar (max),
razon_novedad  varchar (max),
email varchar (max),
solicitador varchar (max),
cargosolicitador varchar (max),
poligrafista varchar (max),
genero varchar (max),
admision varchar (max),
--foto_examen image,
--2). Estado de salud
estado_salud varchar (max),
prob_salud varchar (max),
prob_salud_descrip varchar  (max),
--3). Información familiar
estado_civil varchar (20),
dijovivir varchar (max),
familiares_aparte varchar (max),
nom_pareja varchar (max),
fami_ries_soci varchar (20),
expli_fami_ries varchar (max),
admision varchar (max),
--4) Informacion academica
estaestudiando varchar (10),
admision varchar (max),
--5).Información financiera
situa_economica varchar (15),
tiene_ingre_men varchar (10),
sostiene_eco varchar (max),
act_lab_inde varchar (10),
labores_indep varchar (max),
liquida_cesan varchar (10),
cantidad_liquida_cesan varchar (max),
tiene_ahorros varchar (10),
cant_ahorros varchar(max),
apoyo_padres varchar (10),
desc_apoyo_padres varchar (max),
ing_pareja varchar  (10),
total_ingresos_pareja varchar(max),
hadembargo varchar (10),
explhadembargo varchar (max),
reportadocr varchar (10),
expreportadocr varchar (max),
tieneobligafinan varchar (10),
exploblifinanc varchar (max),
tienedeuda varchar (10),
exptienedeuda varchar (max),
gastos_mensuales varchar (max),
tienepropi varchar(10),
exptienepropi varchar (max),
admision varchar (max),
--) Consumo de juegos de azar
juegpg1 varchar (max),
juegpg2 varchar (10),
expjuegpg2 varchar (max),
juegpg3 varchar (10),
expjuegpg3 varchar (max),
juegpg4 varchar (10),
expjuegpg4 varchar (max),
juegpg5 varchar (10),
expjuegpg5 varchar (max),
admision varchar (max),
--6). Consumo bebidas
con_bebidas varchar (10),
frecuencia_bebi varchar (50),
tipo_bebida varchar (50),
cantidad_oca varchar (10),
lastvez_consumo varchar (50),
bebidaspre1 varchar (10),
expbebidaspre1 varchar (max),
bebidaspre2 varchar (10),
expbebidaspre2 varchar (max),
bebidaspre3 varchar (10),
expbebidaspre3 varchar (max),
bebidaspre4 varchar (10),
expbebidaspre4 varchar (max),
bebidaspre5 varchar (10),
expbebidaspre5 varchar (max),
bebidaspre6 varchar (10),
expbebidaspre6 varchar (max),
bebidaspre7 varchar (10),
expbebidaspre7 varchar (max),
bebidaspre8 varchar (10),
expbebidaspre8 varchar (max),
bebidaspre9 varchar (10),
expbebidaspre9 varchar (max),
admision varchar (max),
--7). Consumo sustancias psicoactivas
haconsumido varchar (10),
exphaconsumido varchar (max),
drogaspregun1 varchar (10),
expdrogaspregun1 varchar (max),
drogaspregun2 varchar (10),
expdrogaspregun2 varchar (max),
drogaspregun3 varchar (10),
expdrogaspregun3 varchar (max),
drogaspregun4 varchar (10),
expdrogaspregun4 varchar (max),
haparticinarco varchar (10),
exphaparticipado varchar (max),
drogaspregun5 varchar (10),
expdrogaspregun5 varchar (max),
drogaspregun6 varchar (10),
expdrogaspregun6 varchar (max),
drogaspregun7 varchar (10),
expdrogaspregun7 varchar (max),
drogaspregun8 varchar (10),
expdrogaspregun8 varchar (max),
drogaspregun9 varchar (10),
expdrogaspregun9 varchar (max),
drogaspregun10 varchar (10),
expdrogaspregun10 varchar (max),
drogaspregun11 varchar (10),
expdrogaspregun11 varchar (max),
drogaspregun12 varchar (10),
expdrogaspregun12 varchar (max),
drogaspregun13 varchar (10),
expdrogaspregun13 varchar (max),
admision varchar (max),
--8). Antecedentes judiciales
antecejupre1 varchar (10),
expantecejupre1 varchar (max),
antecejupre2 varchar (10),
expantecejupre2 varchar (max),
antecejupre3 varchar (10),
expantecejupre3 varchar (max),
antecejupre4 varchar (10),
expantecejupre4 varchar (max),
expantecejupre5 varchar (max),
antecejupre6 varchar (10),
expantecejupre6 varchar (max),
antecejupre7 varchar (10),
expantecejupre7 varchar (max),
antecejupre8 varchar (10),
expantecejupre8 varchar (max),
antecejupre9 varchar (10),
expantecejupre9 varchar (max),
antecejupre10 varchar (10),
expantecejupre10 varchar (max),
antecejupre11 varchar (10),
expantecejupre11 varchar (max),
antecejupre12 varchar (10),
expantecejupre12 varchar (max),
admision varchar (max),
--9). Vinculos al margen de la ley
vinculosmargenley varchar (15),
exptipovinculos varchar (max),
actdelictpre1 varchar (10),
expactdelictpre1 varchar (max),
actdelictpre2 varchar (10),
expactdelictpre2 varchar (max),
actdelictpre3 varchar (10),
expactdelictpre3 varchar (max),
actdelictpre4 varchar (10),
expactdelictpre4 varchar (max),
actdelictpre5 varchar (10),
expactdelictpre5 varchar (max),
actdelictpre6 varchar (10),
expactdelictpre6 varchar (max),
actdelictpre7 varchar (10),
expactdelictpre7 varchar (max),
admision varchar (max),
--10). Falsificación
hvfalsifi varchar (10),
exphvfalsifi varchar (max),
datosfalsospre1 varchar (10),
expdatosfalsospre1 varchar (max),
datosfalsospre2 varchar (10),
expdatosfalsospre2 varchar (max),
pgrutinaope1_ varchar (10),
pgrutinaope1 varchar (10),
rpgrutinaope1 varchar (max),
pgrutinaope2 varchar (10),
rpgrutinaope2 varchar (max),
pgrutinaope3 varchar (10),
rpgrutinaope3 varchar (max),
pgrutinaope4 varchar (10),
rpgrutinaope4 varchar (max),
pgrutinaope5 varchar (10),
rpgrutinaope5 varchar (max),
pgrutinaope6 varchar (10),
rpgrutinaope6 varchar (max),
pgrutinaope7 varchar (10),
rpgrutinaope7 varchar (max),
pgrutinaope8 varchar (10),
rpgrutinaope8 varchar (max),
pgrutinaope9 varchar (10),
rpgrutinaope9 varchar (max),
pgrutinaope10 varchar (10),
rpgrutinaope10 varchar (max),
pgrutinaope11 varchar (10),
rpgrutinaope11 varchar (max),
pgrutinaope12 varchar (10),
rpgrutinaope12 varchar (max),
pgrutinaadmi1 varchar (max),
pgrutinaadmi2 varchar (10),
pgrutinaadmi3 varchar (10),
rpgrutinaadmi3 varchar (max),
pgrutinaadmi4 varchar (10),
rpgrutinaadmi4 varchar (max),
pgrutinaadmi5 varchar (10),
rpgrutinaadmi5 varchar (max),
pgrutinaadmi6 varchar (10),
rpgrutinaadmi6 varchar (max),
pgrutinaadmi7 varchar (10),
rpgrutinaadmi7 varchar (max),
pgrutinaadmi8 varchar (10),
rpgrutinaadmi8 varchar (max),
pgrutina1 varchar (10),
rpgrutina1 varchar (max),
pgrutina2 varchar (10),
rpgrutina2 varchar (max),
pgrutina3 varchar (10),
rpgrutina3 varchar (max),
pgrutina4 varchar (10),
rpgrutina4 varchar (max),
pgrutina5 varchar (10),
rpgrutina5 varchar (max),
pgrutina6 varchar (10),
rpgrutina6 varchar (max),
pgrutina7 varchar (10),
rpgrutina7 varchar (max),
pgrutina8 varchar (10),
rpgrutina8 varchar (max),
pgrutina9 varchar (10),
rpgrutina9 varchar (max),
pgrutina10 varchar (10),
rpgrutina10 varchar (max),
pgrutina11 varchar (10),
rpgrutina11 varchar (max),
pgrutina12 varchar (10),
rpgrutina12 varchar (max),
pgrutina13 varchar (10),
rpgrutina13 varchar (max),
pgrutina14 varchar (10),
rpgrutina14 varchar (max),
pgrutina15 varchar (10),
rpgrutina15 varchar (max),
pgrutina16 varchar (10),
rpgrutina16 varchar (max),
pgrutina17 varchar (10),
rpgrutina17 varchar (max),
pgrutina18 varchar (10),
rpgrutina18 varchar (max),
pgrutina19 varchar (10),
rpgrutina19 varchar (max),
admision varchar (max),
--11). Histial laboral
empleobefore varchar (10),
periodosinacla varchar (max),
didmalosactos varchar (10),
expdidmalosactos varchar (max),
historlabopre1 varchar (10),
exphistorlabopre1 varchar (max),
historlabopre2 varchar (10),
exphistorlabopre2 varchar (max),
historlabopre3 varchar (10),
exphistorlabopre3 varchar (max),
historlabopre4 varchar (10),	
exphistorlabopre4 varchar (max),
historlabopre5 varchar (10),
exphistorlabopre5 varchar (max),
historlabopre6 varchar (10),
exphistorlabopre6 varchar (max),
historlabopre7 varchar (10),
exphistorlabopre7 varchar (max),
historlabopre8 varchar (10),
exphistorlabopre8 varchar (max),
admision varchar (max),
--12). Planes infiltración
planinfilpre1 varchar (10),
expplaninfilpre1 varchar (max),
planinfilpre2 varchar (10),
expplaninfilpre2 varchar (max),
planinfilpre3 varchar (10),
expplaninfilpre3 varchar (max),
planinfilpre4 varchar (10),
expplaninfilpre4 varchar (max),
comoseentero varchar (max),
rq varchar (max),
admisiones varchar (max),
admisiones_pt varchar (max),
tipotecnica varchar (max),
sistemaExamen varchar (20),
diagnostico varchar (max),
tipoexamen varchar (50),
motivoexamen varchar (50),
direccionexamen varchar (100),
ciudadexamen varchar (100),
estadoexamen varchar (50),
admision varchar (max),
--examenfinal varbinary (max),
nombreExamen varchar (max),
color varchar (20),
estadocolor varchar (50),
notasft varchar (max),
fechacreacion date)

select * from datos_generales_poli


