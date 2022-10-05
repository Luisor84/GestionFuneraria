create database mydb;
use mydb;

create table tblprivilegios(
id_privilegio int not null,
privilegio varchar(45) not null,
formulario varchar(20) not null,
primary key(id_privilegio)
);

create table tblusuarios(
id_usuario int not null,
usuario varchar(45) not null,
contraseña varchar(45) not null,
nombre varchar(100) not null,
primary key(id_usuario)
);

create table tblperfilusuarios(
id_perfilusuario int not null,
estado varchar(15) not null,
id_privilegio int not null,
id_usuario int not null,
primary key(id_perfilusuario),
constraint tblperfilusuarios_tblprivilegios_fk foreign key (id_privilegio) references tblprivilegios(id_privilegio),
constraint tblperfilusuarios_tblusuarios_fk foreign key (id_usuario) references tblusuarios(id_usuario)
);

create table tblplanfunerario(
id_planfunerario int not null,
nombre_plan varchar(45) not null,
valor_plan float not null,
primary key(id_planfunerario)
);

create table tblclientes(
id_cliente int not null,
identificacion varchar(20) not null,
nombre_cliente varchar(150) not null,
fecha_nacimiento date not null,
direccion varchar(150) not null,
ciudad varchar(45) not null,
telefono varchar(60) not null,
correo varchar(150) not null,
id_planfunerario int not null,
id_usuario int not null,
primary key(id_cliente),
constraint tblclientes_tblusuarios_fk foreign key (id_usuario) references tblusuarios(id_usuario),
constraint tblclientes_tblplanfunerario_fk foreign key (id_planfunerario) references tblplanfunerario(id_planfunerario)
);

create table tblmediospago(
id_mediopago int not null,
mediopago varchar(45) not null,
primary key(id_mediopago)
);

create table tblpagos(
id_pago int not null,
num_documento varchar(20) not null,
fecha_pago date not null,
valor_pago float not null,
concepto varchar(250) not null,
id_mediopago int not null,
id_cliente int not null,
primary key(id_pago),
constraint tblpagos_tblclientes_fk foreign key (id_cliente) references tblclientes(id_cliente),
constraint tblpagos_tblmediospago_fk foreign key (id_mediopago) references tblmediospago(id_mediopago)
);

