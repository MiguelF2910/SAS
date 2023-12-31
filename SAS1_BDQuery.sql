Create SAS1;
USE [SAS1]
GO
/****** Object:  Table [dbo].[P]    Script Date: 13/12/2021 12:31:23 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[P](
	[PID] [int] IDENTITY(1,1) NOT NULL,
	[NOM] [varchar](50) NULL,
	[PRE] [float] NULL,
	[TPID1] [int] NULL,
 CONSTRAINT [pk_P1] PRIMARY KEY CLUSTERED 
(
	[PID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Rol_Usuario]    Script Date: 13/12/2021 12:31:23 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Rol_Usuario](
	[ROL_ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ROL_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TP]    Script Date: 13/12/2021 12:31:23 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TP](
	[TPID] [int] IDENTITY(1,1) NOT NULL,
	[MARCA] [varchar](20) NULL,
 CONSTRAINT [pk_P] PRIMARY KEY CLUSTERED 
(
	[TPID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Usuarios]    Script Date: 13/12/2021 12:31:23 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Usuarios](
	[Usuario_ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre_Usuario] [varchar](255) NULL,
	[Password] [varchar](255) NULL,
	[Rol_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Usuario_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[P] ON 

INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (0, N'Bonafont 1L', 11, 1)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (1, N'Bonafont 1/2 ml', 8, 1)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (2, N'Ciel 1L', 10, 2)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (3, N'Ciel 1/2 ml', 8, 2)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (4, N'COCA-COLA 1L', 21, 0)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (5, N'COCA-COLA 1/2 ml', 15, 0)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (6, N'COCA-COLA 1/4 ml', 8, 0)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (7, N'COCA-COLA 315 ml', 8, 0)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (8, N'Atun', 18, 10)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (9, N'Atun en Aceite', 24, 10)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (10, N'Lata chiles 780g', 20, 8)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (11, N'Lata chiles 120g', 12, 8)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (12, N'Lata chipotles 120g', 10, 9)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (13, N'Lata chipotles 780g', 27, 9)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (14, N'Lata piñas 780g', 30, 8)
INSERT [dbo].[P] ([PID], [NOM], [PRE], [TPID1]) VALUES (17, N'Cloro 500ml', 17, 32)
SET IDENTITY_INSERT [dbo].[P] OFF
GO
SET IDENTITY_INSERT [dbo].[Rol_Usuario] ON 

INSERT [dbo].[Rol_Usuario] ([ROL_ID], [Nombre]) VALUES (1, N'Administrador')
INSERT [dbo].[Rol_Usuario] ([ROL_ID], [Nombre]) VALUES (2, N'Vendedor')
INSERT [dbo].[Rol_Usuario] ([ROL_ID], [Nombre]) VALUES (3, N'Cliente')
SET IDENTITY_INSERT [dbo].[Rol_Usuario] OFF
GO
SET IDENTITY_INSERT [dbo].[TP] ON 

INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (0, N'COCA-COLA')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (1, N'Bonafont')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (2, N'Jarritos')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (3, N'Peñafiel')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (4, N'Pascual')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (5, N'Jumex')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (6, N'Pepsi')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (7, N'La Costeña')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (8, N'San Marcos')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (9, N'DOLORES')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (10, N'Herdez')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (11, N'Del monte')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (12, N'Clemente')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (13, N'SIGMA')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (14, N'Chipilo')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (15, N'Suan')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (16, N'San Rafael')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (17, N'Alpura')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (18, N'Lala')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (19, N'Santa Clara')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (20, N'Bonafina')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (21, N'Sabritas')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (22, N'Rikolino')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (23, N'Gamesa')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (24, N'Marinela')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (25, N'Barcel')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (26, N'Pedigri')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (27, N'Purina')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (28, N'Petalo')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (29, N'Vogue')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (30, N'Delsi')
INSERT [dbo].[TP] ([TPID], [MARCA]) VALUES (32, N'Cloralex')
SET IDENTITY_INSERT [dbo].[TP] OFF
GO
SET IDENTITY_INSERT [dbo].[Usuarios] ON 

INSERT [dbo].[Usuarios] ([Usuario_ID], [Nombre_Usuario], [Password], [Rol_ID]) VALUES (1, N'Flowers64', N'GTAPro99', 1)
INSERT [dbo].[Usuarios] ([Usuario_ID], [Nombre_Usuario], [Password], [Rol_ID]) VALUES (2, N'Toronja88', N'Taquitos02', 3)
INSERT [dbo].[Usuarios] ([Usuario_ID], [Nombre_Usuario], [Password], [Rol_ID]) VALUES (7, N'Alexis', N'12', 3)
SET IDENTITY_INSERT [dbo].[Usuarios] OFF
GO
ALTER TABLE [dbo].[P]  WITH CHECK ADD  CONSTRAINT [fk_TP1] FOREIGN KEY([TPID1])
REFERENCES [dbo].[TP] ([TPID])
GO
ALTER TABLE [dbo].[P] CHECK CONSTRAINT [fk_TP1]
GO
ALTER TABLE [dbo].[Usuarios]  WITH CHECK ADD FOREIGN KEY([Rol_ID])
REFERENCES [dbo].[Rol_Usuario] ([ROL_ID])
GO
