<form action="Form1ProyectoServlet">

<h1>Crear proyecto ingeniería</h1>

<!-- <h3><text>Email:</text><input type="text" name="email" placeholder="Email" /></h3> -->
<!-- <h3><text>Nombre gestor:</text><input type="text" name="name" placeholder="Nombre completo" /></h3> -->
<h3><text>Nombre proyecto:</text><input type="text" name="title" placeholder="Titulo" /></h3>
<!-- <h3><text>Contraseña:</text><input type="password" name="password" placeholder="Contraseña" /></h3> -->
<h3><text>Nº Trabajadores:</text><input type="text" name="numeroTrabajadores" placeholder="Numero Trabajadores" /></h3>
<!-- <h3><text>Nº Horas Trabajadas:</text><input type="text" name="numeroHorasTrabajadas" placeholder="Horas Trabajadas" /></h3> -->
<h3><text>Nº Horas Totales:</text><input type="text" name="numeroHorasTotales" placeholder="Horas Totales" /></h3>

<h2><select name="advisor">
	<option value="" disabled selected>Elija un gestor</option>
	<c:forEach items="${gestor_list}" var="gestor_i">
		<option value=${gestor_i.email}>${gestor_i.name}-${gestor_i.email}</option>
	</c:forEach>
</select></h2>

<button type="submit">Crear nuevo proyecto</button>



</form>